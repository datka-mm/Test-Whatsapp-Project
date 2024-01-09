//package test.testwhatsapp.api;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//import test.testwhatsapp.db.service.CustomerService;
//import test.testwhatsapp.db.service.SendMessageService;
//
//@RestController
//@RequestMapping("/api/messages")
//@RequiredArgsConstructor
//public class SendMessageApi {
//
//    private final CustomerService service;
//    private final SendMessageService sendMessageService;
//
////    @PostMapping("/send-message")
////    public void sendMessage(@RequestParam String phoneNumber,
////                            @RequestParam String patientName,
////                            @RequestParam String doctorName,
////                            @RequestParam String date,
////                            @RequestParam String time,
////                            @RequestParam String clinicPhoneNumber,
////                            @RequestParam String address) {
////        sendMessageService.sendMessage(phoneNumber, patientName, doctorName, date, time, clinicPhoneNumber, address);
////    }
//
//
//    @PostMapping("/send-message")
//    public void sendMessage(@RequestParam String phoneNumber,
//                            @RequestParam String clinicName,
//                            @RequestParam String patientName,
//                            @RequestParam String doctorName,
//                            @RequestParam String date,
//                            @RequestParam String time,
//                            @RequestParam String clinicPhoneNumber,
//                            @RequestParam String address) {
//        sendMessageService.helper2(phoneNumber, clinicName, patientName, doctorName, date, time, clinicPhoneNumber, address);
//    }
//
//
////
//////    @PostMapping("/sign-up")
////    public AuthResponse signUp(@RequestBody SignUpRequest request) {
////        return service.signUp(request);
////    }
////
////
////    @PostMapping("/login")
////    public AuthResponse login(@RequestBody AuthRequest request) {
////        return service.login(request);
////    }
////
////
////    @PostMapping("/send-message")
////    public void sendMessage(@RequestBody PhoneNumberRequest request) {
////        System.out.println("before");
////        service.sendMessage(request);
////        System.out.println("after");
////    }
//
//
//
//
////    private static final String FACEBOOK_API_URL = "https://graph.facebook.com/v16.0/102172879567021/messages";
////    private static final String ACCESS_TOKEN = "EAARf04CjDw8BAMsPmrxmVG6PUr8GkCx84d24n6USRWsFh4bEtWq2TPeestiRn2w6k8kEwwDQHIgaZAfGR6NZAXV33qHfT5I4mySSp07B0BKnAlJE63JEwPA3uTCT3nZBrIPIw1xIO94CoJ1nbLFe3nu0ZA6nO4XGa3b3D0oGa1qkLiyH2lEYhj5Tg0KNQeLapnXGibaYD5GMKq8SFTD5";
////
////    @PostMapping("/send-message")
////    public ResponseEntity<String> sendMessage() {
////        RestTemplate restTemplate = new RestTemplate();
////
////        HttpHeaders headers = new HttpHeaders();
////        headers.setContentType(MediaType.APPLICATION_JSON);
////        headers.set("Authorization", "Bearer " + ACCESS_TOKEN);
////
////        String recipient = "996705436274"; // Replace with the desired recipient number
////        String templateName = "hello_world"; // Replace with the desired template name
////
////        String example = " \"messaging_product\": \"whatsapp\",\n" +
////                "    \"to\": \"996705436274\", \n" +
////                "    \"type\": \"template\",\n" +
////                "    \"template\": \n" +
////                "  { \n" +
////                "      \"name\": \"hello_world\",\n" +
////                "      \"language\": \n" +
////                "   {\n" +
////                "        \"code\": \"en_US\" \n" +
////                "   }\n" +
////                "    }\n" +
////                "     }";
////
//////        String requestBody = String.format("{\"recipient\": {\"whatsapp_id\": \"%s\"}, \"template\": {\"name\": \"%s\"}}", recipient, templateName);
////
////
////        HttpEntity<String> request = new HttpEntity<>(example, headers);
////
////        ResponseEntity<String> response = restTemplate.postForEntity(FACEBOOK_API_URL, request, String.class);
////
////
////        // Handle the response here and return an appropriate HTTP response
////
////        return response;
////    }
//}
////    private final ClientService clientService;
//
////
////    @PostMapping("/send-whatsapp")
////    public void sendWhatsAppMessage(@RequestParam String recipient,
////                                    @RequestParam String templateName) {
////
////        clientService.sendWhatsAppMessage(recipient, templateName);
////    }
//
//// http client
//// rest template
////
//
////    @PostMapping("/{phoneNoId}/messages")
////    Call<MessageSendResponse> messageSend(@PathVariable("phoneNoId") String phoneNoId,
////                                          @RequestBody MessageSendRequest request);
//
////    @PostMapping("/{phoneNoId}/messages")
////    public MessageSendResponse sendMessage(@RequestBody PhoneNumbersRequest request,
////                              @PathVariable String phoneNoId) {
////        return clientService.sendMessages(request);
////    }
//
