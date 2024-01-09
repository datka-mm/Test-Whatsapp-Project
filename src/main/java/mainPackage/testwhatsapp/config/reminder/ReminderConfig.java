//package test.testwhatsapp.config.reminder;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.scheduling.annotation.EnableScheduling;
//import org.springframework.scheduling.annotation.Scheduled;
//import test.testwhatsapp.db.entity.Customer;
//import test.testwhatsapp.db.repository.CustomerRepository;
//
//import javax.transaction.Transactional;
//import java.io.IOException;
//import java.net.URI;
//import java.net.URISyntaxException;
//import java.net.http.HttpClient;
//import java.net.http.HttpRequest;
//import java.net.http.HttpResponse;
//import java.time.LocalDateTime;
//import java.util.List;
//
//@Configuration
////@EnableScheduling
//@RequiredArgsConstructor
//public class ReminderConfig {
//
//    private final CustomerRepository customerRepository;
//
//
////    @Transactional
////    @Scheduled(cron = "0 0/1 * * * *")
//    public void reminder() {
//        System.out.println("in reminder");
//        List<Customer> customers = customerRepository.findAll();
//        if (!customers.isEmpty()) {
//            for (Customer c : customers) {
//                if (c.getNotificationTime().equals(now())) {
//                    sendMessage(c.getPhoneNumber());
//                }
//            }
//        } else {
//            System.out.println("Phone number is empty!");
//        }
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
//
//    public void sendMessage(String phoneNumber) {
//        System.out.println("in send message method");
//        if (phoneNumber != null) {
//            try {
//                HttpRequest request = HttpRequest.newBuilder()
//                        .uri(new URI("https://graph.facebook.com/v16.0/" + "106037769175723" + "/messages"))
//                        .header("Authorization", "Bearer " + "EAADjUWGxpMMBADGeUZCJ3nqahh0ZA8nsB8ZBm7oe2ge4RdtFjIFeAJj7gBPBN3hN7up3QUn3vt7y3JJEsimHJSsK8dcTcbG92rcG1hSXKglF0ZCil23OHBNo3ZBUINcn6CgJ0wBGUkZCQj6X6ZBRYUAKzZB2rfUgAxENHViF86FzyjU8hMg08gIRtQL6RJgIrANFhfsH6L12Ft4tz4gPNZAm1ou4XBiQZCHRUZD")
//                        .header("Content-Type", "application/json")
//
//                        // todo Getting started example
//                        //.POST(HttpRequest.BodyPublishers.ofString("{ \"messaging_product\": \"whatsapp\", \"recipient_type\": \"individual\", \"to\": \""+phoneNumber+"\", \"type\": \"template\", \"template\": { \"name\": \"hello_world\", \"language\": { \"code\": \"en_US\" } } }"))
//                        // Text message example
//                        //.POST(HttpRequest.BodyPublishers.ofString("{ \"messaging_product\": \"whatsapp\", \"recipient_type\": \"individual\", \"to\": \""+phoneNumber+"\", \"type\": \"text\", \"text\": { \"preview_url\": false, \"body\": \"This is an example of a text message\" } }"))
//                        // Bespoke message template example
//                        //.POST(HttpRequest.BodyPublishers.ofString("{ \"messaging_product\": \"whatsapp\", \"recipient_type\": \"individual\", \"to\": \""+phoneNumber+"\", \"type\": \"template\", \"template\": { \"name\": \"new_customer_offer\", \"language\": { \"code\": \"en\" }, \"components\":[{\"type\":\"header\",\"parameters\":[{\"type\":\"image\",\"image\":{\"link\":\"https://i.ibb.co/DRMHqRj/welcome.jpg\"}}]},{\"type\":\"body\",\"parameters\":[{\"type\":\"text\",\"text\":\"John Smith\"}]}] } }"))
//                        // String phoneNumber = "+996705436274";
//
//                        .POST(HttpRequest.BodyPublishers.ofString("{ \"messaging_product\": \"whatsapp\", \"to\": \"" + phoneNumber + "\", \"type\": \"template\", \"template\": { \"name\": \"hello_my_friend_how_are_from_today\", \"language\": { \"code\": \"en\" } } }"))
//                        .build();
//                HttpClient http = HttpClient.newHttpClient();
//                HttpResponse<String> response = http.send(request, HttpResponse.BodyHandlers.ofString());
//                System.out.println(response.body());
//
//            } catch (URISyntaxException | IOException |
//                     InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//
//        System.out.println("No phone numbers!");
//
//    }
//}
