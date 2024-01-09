package mainPackage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class TestwhatsappApplication {
    public static void main(String[] args) {
        SpringApplication.run(TestwhatsappApplication.class, args);


        System.out.println("hello world!");






//        SendMessageService service = new SendMessageService();
//        List<String> phoneNumbers = new ArrayList<>();
//        phoneNumbers.add("+996705436274");
//        phoneNumbers.add("+996507140201");
//        phoneNumbers.add("+996778747485");
//        phoneNumbers.add("+996776543103");
//        PhoneNumberRequest request = new PhoneNumberRequest(phoneNumbers);
//
//        service.sendMessage(request);


    }

//    public static void sendMessage() {
//
//        String token = "EAADjUWGxpMMBADZAHLmFowRuHJawl84s22DtOTHtbCoezsvZA0FZAaB5E30RZA6WMna1fZBRg9qK0cUNRHmvL4RtqdEq8dSOUNbZARBOpWP7dofxnhTZBBvRcIvs2quEcTUv7QYfNoeWo8H9RSCvterYda3VaZAMmDsmYcwnha9arxOM5h7KpsYmv1G7WEZCSrHPpWBAZCDFX02tFEDgh5EQACkf71BTeNjQ0ZD";
//        String phoneNumber = "+996705436274";
//        try {
//            HttpRequest request = HttpRequest.newBuilder()
//                    .uri(new URI("https://graph.facebook.com/v13.0/106037769175723/messages"))
//                    .header("Authorization", "Bearer " + token)
//                    .header("Content-Type", "application/json")
//                    // Getting started example
//                    //.POST(HttpRequest.BodyPublishers.ofString("{ \"messaging_product\": \"whatsapp\", \"recipient_type\": \"individual\", \"to\": \""+phoneNumber+"\", \"type\": \"template\", \"template\": { \"name\": \"hello_world\", \"language\": { \"code\": \"en_US\" } } }"))
//                    // Text message example
//                    //.POST(HttpRequest.BodyPublishers.ofString("{ \"messaging_product\": \"whatsapp\", \"recipient_type\": \"individual\", \"to\": \""+phoneNumber+"\", \"type\": \"text\", \"text\": { \"preview_url\": false, \"body\": \"This is an example of a text message\" } }"))
//                    // Bespoke message template example
//                    .POST(HttpRequest.BodyPublishers.ofString("{\"messaging_product\": \"whatsapp\", \"to\": \"" + phoneNumber + "\", \"type\": \"template\", \"template\": {\"name\": \"hello_world\", \"language\": {\"code\": \"en_US\" } } }"))
//                    .build();
//            HttpClient http = HttpClient.newHttpClient();
//            HttpResponse<String> response = http.send(request, HttpResponse.BodyHandlers.ofString());
//            System.out.println(response.body());
//
//        } catch (URISyntaxException | IOException | InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("No phone numbers!");
//    }
}

