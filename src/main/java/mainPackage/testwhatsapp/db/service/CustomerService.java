//package test.testwhatsapp.db.service;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.stereotype.Service;
//import test.testwhatsapp.config.security.JWTUtil;
//import test.testwhatsapp.db.entity.Customer;
//import test.testwhatsapp.db.enums.Role;
//import test.testwhatsapp.db.repository.CustomerRepository;
//import test.testwhatsapp.dto.request.AuthRequest;
//import test.testwhatsapp.dto.request.PhoneNumberRequest;
//import test.testwhatsapp.dto.request.SignUpRequest;
//import test.testwhatsapp.dto.response.AuthResponse;
//import test.testwhatsapp.exceptions.MyException;
//
//import javax.transaction.Transactional;
//import java.io.IOException;
//import java.net.URI;
//import java.net.URISyntaxException;
//import java.net.http.HttpClient;
//import java.net.http.HttpRequest;
//import java.net.http.HttpResponse;
//import java.time.LocalDateTime;
//
//@Service
//@Transactional
//@RequiredArgsConstructor
//public class CustomerService {
//
//    private final CustomerRepository repository;
//    private final JWTUtil jwtUtil;
//
//    private Customer getAuthenticateCustomer() {
//        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//        String login = authentication.getName();
//        return repository.findByCustomerByPhoneNumber(login).orElseThrow(() ->
//                new MyException("Customer not found!")
//        );
//    }
//
//    public AuthResponse login(AuthRequest request) {
//        Customer customer = repository.findByCustomerByPhoneNumber(request.getPhoneNumber()).orElseThrow(() ->
//                new MyException(
//                        "Customer with phone number: " + request.getPhoneNumber() + " not found!"
//                )
//        );
//
//        if (!customer.getPassword().equals(request.getPassword())) {
//            throw new MyException("Password is wrong!");
//        }
//
//        String jwtToken = jwtUtil.generateToken(customer.getPhoneNumber());
//
//        return new AuthResponse(
//                customer.getId(),
//                customer.getPhoneNumber(),
//                jwtToken
//        );
//    }
//
//
//    public void sendMessage(PhoneNumberRequest phoneNumberRequest) {
//        Customer customer = getAuthenticateCustomer();
//
//        if (phoneNumberRequest != null) {
//            for (String phoneNumber : phoneNumberRequest.getPhoneNumbers()) {
//                try {
//                    HttpRequest request = HttpRequest.newBuilder()
//                            .uri(new URI("https://graph.facebook.com/v16.0/" + customer.getPhoneNumberId() + "/messages"))
//                            .header("Authorization", "Bearer " + customer.getAccessToken())
//                            .header("Content-Type", "application/json")
//
//                            // todo Getting started example
//                            //.POST(HttpRequest.BodyPublishers.ofString("{ \"messaging_product\": \"whatsapp\", \"recipient_type\": \"individual\", \"to\": \""+phoneNumber+"\", \"type\": \"template\", \"template\": { \"name\": \"hello_world\", \"language\": { \"code\": \"en_US\" } } }"))
//                            // Text message example
//                            //.POST(HttpRequest.BodyPublishers.ofString("{ \"messaging_product\": \"whatsapp\", \"recipient_type\": \"individual\", \"to\": \""+phoneNumber+"\", \"type\": \"text\", \"text\": { \"preview_url\": false, \"body\": \"This is an example of a text message\" } }"))
//                            // Bespoke message template example
//                            //.POST(HttpRequest.BodyPublishers.ofString("{ \"messaging_product\": \"whatsapp\", \"recipient_type\": \"individual\", \"to\": \""+phoneNumber+"\", \"type\": \"template\", \"template\": { \"name\": \"new_customer_offer\", \"language\": { \"code\": \"en\" }, \"components\":[{\"type\":\"header\",\"parameters\":[{\"type\":\"image\",\"image\":{\"link\":\"https://i.ibb.co/DRMHqRj/welcome.jpg\"}}]},{\"type\":\"body\",\"parameters\":[{\"type\":\"text\",\"text\":\"John Smith\"}]}] } }"))
//                            // String phoneNumber = "+996705436274";
//
//                            .POST(HttpRequest.BodyPublishers.ofString("{ \"messaging_product\": \"whatsapp\", \"to\": \"" + phoneNumber + "\", \"type\": \"template\", \"template\": { \"name\": \"hello_world\", \"language\": { \"code\": \"en_US\" } } }"))
//                            .build();
//                    HttpClient http = HttpClient.newHttpClient();
//                    HttpResponse<String> response = http.send(request, HttpResponse.BodyHandlers.ofString());
//                    System.out.println(response.body());
//
//                } catch (URISyntaxException | IOException |
//                         InterruptedException e) {
//                    e.printStackTrace();
//                }
//
//            }
//        }
//
//        System.out.println("No phone numbers!");
//
//    }
//
//    public AuthResponse signUp(SignUpRequest request) {
//        if (repository.existsByPhoneNumber(request.getPhoneNumber())) {
//            throw new MyException("Exists phone number!");
//        }
//
//
//        Customer customer = new Customer(
//                request.getPhoneNumber(),
//                request.getPassword(),
//                request.getUrl(),
//                request.getPhoneNumberId(),
//                request.getAccessToken(),
//                request.getDate(),
//                now().minusMinutes(60),
//                Role.ADMIN);
//
//        String jwt = jwtUtil.generateToken(customer.getPhoneNumber());
//        return new AuthResponse(
//                customer.getId(),
//                customer.getPhoneNumber(),
//                jwt);
//    }
//
//    public LocalDateTime now() {
//        LocalDateTime now = LocalDateTime.now();
//        return LocalDateTime.of(
//                now.getYear(),
//                now.getMonth(),
//                now.getDayOfMonth(),
//                now.getHour(),
//                now.getMinute(),
//                0,
//                0);
//    }
//}
