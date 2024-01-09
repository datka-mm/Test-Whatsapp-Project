//package test.testwhatsapp.db.service;
//
//import org.springframework.stereotype.Service;
//
//import java.io.IOException;
//import java.net.URI;
//import java.net.URISyntaxException;
//import java.net.http.HttpClient;
//import java.net.http.HttpRequest;
//import java.net.http.HttpResponse;
//
//@Service
//public class SendMessageService {
//
//    public void sendMessage(String phoneNumber, String patientName, String doctorName, String date, String time, String address, String clinicPhoneNumber) {
//        try {
//            HttpRequest request = HttpRequest.newBuilder()
//                    .uri(new URI("https://graph.facebook.com/v16.0/101022073035672/messages"))
//                    .header("Authorization", "Bearer " + "EAAEUZAogPPWEBAHDUxlkJZC6MA3iXxT06XnPhfRZB7pnVxboHZCpYMDj9AcQAZC8ZCW1ZAGSYe4nxT1156OzvbNAd2CCKmG2I0EGClHLsLGPZBQ2Mh3DFJGM1JceoTGO19GFWScSnpQRKVYRTwpuSEn11ONSg52p2cD2A3YwtmhhRJwqEYSbox5GVN7Riz0ntzKRu4FifNw3K0Erqb0cYI5PZCVkYa9uQzMEZD")
//                    .header("Content-Type", "application/json")
//                    .POST(HttpRequest.BodyPublishers.ofString(
//                            "{\"messaging_product\": \"whatsapp\", " +
//                                    "\"to\": \"" + phoneNumber + "\", " +
//                                    "\"type\": \"template\", " +
//                                    "\"template\": { " +
//                                    "\"name\": \"utility_message_template_with_variables_english\", " +
//                                    "\"language\": { \"code\": \"en_US\" }, " +
//                                    "\"components\": [" +
//                                    "{\"type\": \"body\", \"parameters\": [" +
//                                    "{\"type\": \"text\", \"text\": \"" + patientName + "\"}," +
//                                    "{\"type\": \"text\", \"text\": \"" + doctorName + "\"}," +
//                                    "{\"type\": \"text\", \"text\": \"" + date + "\"}," +
//                                    "{\"type\": \"text\", \"text\": \"" + time + "\"}," +
//                                    "{\"type\": \"text\", \"text\": \"" + clinicPhoneNumber + "\"}," +
//                                    "{\"type\": \"text\", \"text\": \"" + address + "\"}" +
//                                    "]}" +
//                                    "]" +
//                                    "}}"))
//                    .build();
//
//            HttpClient http = HttpClient.newHttpClient();
//            HttpResponse<String> response = http.send(request, HttpResponse.BodyHandlers.ofString());
//            System.out.println(response.body());
//        } catch (URISyntaxException | IOException | InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("No phone numbers!");
//    }
//
//
//
////    public void sendMessage(String phoneNumber, String patientName, String doctorName, String date, String time, String address, String clinicPhoneNumber) {
////        try {
////            HttpRequest request = HttpRequest.newBuilder()
////                    .uri(new URI("https://graph.facebook.com/v16.0/106037769175723/messages"))
////                    .header("Authorization", "Bearer " + "EAADjUWGxpMMBACMIQCZBD5ZA1C6fWg3ZC8upmGMwm4yVNN2kCTYjWn9JinW1pBZBIlWJ8YEvBcqzcbdzRLucqqoPuRZB65yPMTN44weul8RnHPL2sZBpI4fIuDvoW6PrbZBEl8RKW5GwZAFTCPjKBzrk9wPzhvHok2WnNdZCxvhqVfuh1dy3SZBmO8esRC7omJe83y7MAfFGpwvZCfDf1rhTtvKGkuJLKz2bIEZD")
////                    .header("Content-Type", "application/json")
////                    .POST(HttpRequest.BodyPublishers.ofString(
////                            "{\"messaging_product\": \"whatsapp\", " +
////                                    "\"to\": \"" + phoneNumber + "\", " +
////                                    "\"type\": \"template\", " +
////                                    "\"template\": { " +
////                                    "\"name\": \"utility_message_template_with_variables_english\", " +
////                                    "\"language\": { \"code\": \"en_US\" }, " +
////                                    "\"components\": [" +
////                                    "{\"type\": \"body\", \"parameters\": [" +
////                                    "{\"type\": \"text\", \"text\": \"Dear " + patientName + ". This is a reminder that you have an appointment with Dr. " + doctorName + " at " + time + " on " + date + ". Please remember to bring any necessary documents or medical records. Phone number: " + clinicPhoneNumber + ", our address: " + address + ". Thank you, Your Polyclinic\"}" +
////                                    "]}" +
////                                    "]" +
////                                    "}}"))
////                    .build();
////
////            HttpClient http = HttpClient.newHttpClient();
////            HttpResponse<String> response = http.send(request, HttpResponse.BodyHandlers.ofString());
////            System.out.println(response.body());
////        } catch (URISyntaxException | IOException | InterruptedException e) {
////            e.printStackTrace();
////        }
////        System.out.println("No phone numbers!");
////    }
//
//
////    @Value("${facebook.api.url}")
////    private String apiUrl;
////
////    @Value("${facebook.access.token}")
////    private String accessToken;
//
////    @Value("${facebook.phoneNumberId}")
////    private String phoneNumberId;
//
//
////    public void sendMessage() {
////
////        String token = "EAAEUZAogPPWEBABnHySXLYkVBts9S8CZAU9W1h2r77mDI1fW0AOze4ZBbWBk9ZBUIPqnPfcH3I06izPbH05ucgCdp2kbnMzg3S8SyV6EbZCdN0rWg5EPZAH2FQ8SLypFuouJ1Oau4tMTa4kEhTzYJERRtcqWiCWmMaZB5ZC6CdEmYlZCs0KoTZAsDJLehPpBLVfrCz5Spv18NVG8u3O4QplJFVcvvyWQ4v0DQjb4TZBnWot2AZDZD";
////        String phoneNumber = "+996705436274";
////        try {
////            HttpRequest request = HttpRequest.newBuilder()
////                    .uri(new URI("https://graph.facebook.com/v13.0/101022073035672/messages"))
////                    .header("Authorization", "Bearer " + token)
////                    .header("Content-Type", "application/json")
////                    // Getting started example
////                    //.POST(HttpRequest.BodyPublishers.ofString("{ \"messaging_product\": \"whatsapp\", \"recipient_type\": \"individual\", \"to\": \""+phoneNumber+"\", \"type\": \"template\", \"template\": { \"name\": \"hello_world\", \"language\": { \"code\": \"en_US\" } } }"))
////                    // Text message example
////                    //.POST(HttpRequest.BodyPublishers.ofString("{ \"messaging_product\": \"whatsapp\", \"recipient_type\": \"individual\", \"to\": \""+phoneNumber+"\", \"type\": \"text\", \"text\": { \"preview_url\": false, \"body\": \"This is an example of a text message\" } }"))
////                    // Bespoke message template example
////                    .POST(HttpRequest.BodyPublishers.ofString("{\"messaging_product\": \"whatsapp\", \"to\": \"+996705436274\", \"type\": \"template\", \"template\": {\"name\": \"hello_world\", \"language\": {\"code\": \"en_US\" } } }"))
////                    .build();
////            HttpClient http = HttpClient.newHttpClient();
////            HttpResponse<String> response = http.send(request, HttpResponse.BodyHandlers.ofString());
////            System.out.println(response.body());
////
////        } catch (URISyntaxException | IOException | InterruptedException e) {
////            e.printStackTrace();
////        }
////
////        System.out.println("No phone numbers!");
////    }
//
////    public void sendMessage(String phoneNumber, String patientName, String doctorName, String date, String time, String address, String clinicPhoneNumber) {
////
////        try {
////            HttpRequest request = HttpRequest.newBuilder()
////                    .uri(new URI("https://graph.facebook.com/v16.0/106037769175723/messages"))
////                    .header("Authorization", "Bearer " + "EAADjUWGxpMMBACMIQCZBD5ZA1C6fWg3ZC8upmGMwm4yVNN2kCTYjWn9JinW1pBZBIlWJ8YEvBcqzcbdzRLucqqoPuRZB65yPMTN44weul8RnHPL2sZBpI4fIuDvoW6PrbZBEl8RKW5GwZAFTCPjKBzrk9wPzhvHok2WnNdZCxvhqVfuh1dy3SZBmO8esRC7omJe83y7MAfFGpwvZCfDf1rhTtvKGkuJLKz2bIEZD")
////                    .header("Content-Type", "application/json")
////
////  //----------------------------------------------------------------------------------------------------
////
////
//////                    .POST(HttpRequest.BodyPublishers.ofString("{ \"messaging_product\": \"whatsapp\", \"recipient_type\": \"individual\", \"to\": \"" + phoneNumber + "\", \"type\": \"template\", \"template\": { \"name\": \"marketing_interactive_kyrgyz_message\", \"language\": { \"code\": \"ky_KG\" }, \"components\":[{\"type\":\"body\",\"parameters\":[{\"type\":\"text\",\"text\":\"" + patientName + "\"}]}]}}"
//////                    .POST(HttpRequest.BodyPublishers.ofString("{ \"messaging_product\": \"whatsapp\", \"recipient_type\": \"individual\", \"to\": \"" + phoneNumber + "\", \"type\": \"template\", \"template\": { \"name\": \"utility_message_template_with_variables_english\", \"language\": { \"code\": \"ky_KG\" }, \"components\":[{\"type\":\"body\",\"parameters\":[{\"type\":\"text\",\"text\":\"" + patientName + "\"}]}]}}"
//////                    .POST(HttpRequest.BodyPublishers.ofString("{ \"messaging_product\": \"whatsapp\", \"recipient_type\": \"individual\", \"to\": \"" + phoneNumber + "\", \"type\": \"template\", \"template\": { \"name\": \"message_for_patient_en\", \"language\": { \"code\": \"en_US\" }, \"components\":[{\"type\":\"body\",\"parameters\":[{\"type\":\"text\",\"text\":\"" + patientName + "\"}, {\"type\":\"text\",\"text\":\"" + doctorName + "\"}, {\"type\":\"text\",\"text\":\"" + date + "\"}, {\"type\":\"text\",\"text\":\"" + time + "\"}, {\"type\":\"text\",\"text\":\"" + clinicPhoneNumber + "\"}, {\"type\":\"text\",\"text\":\"" + address + "\"}]}]}}")).build();
//////                    .POST(HttpRequest.BodyPublishers.ofString("{ \"messaging_product\": \"whatsapp\", \"recipient_type\": \"individual\", \"to\": \"" + phoneNumber + "\", \"type\": \"template\", \"template\": { \"name\": \"message_for_patient_en\", \"language\": { \"code\": \"en_US\" }, \"components\":[{\"type\":\"body\",\"parameters\":[{\"type\":\"text\",\"text\":\"" + clinicName + "\"}, {\"type\":\"text\",\"text\":\"" + patientName + "\"}, {\"type\":\"text\",\"text\":\"" + date + "\"}, {\"type\":\"text\",\"text\":\"" + time + "\"}, {\"type\":\"text\",\"text\":\"" + doctorName + "\"}, {\"type\":\"text\",\"text\":\"" + clinicPhoneNumber + "\"}, {\"type\":\"text\",\"text\":\"" + address + "\"}]}]}}")).build();
////
////
//////                        .POST(HttpRequest.BodyPublishers.ofString("{ \"messaging_product\": \"whatsapp\", \"to\": \"" + phoneNumber + "\"," +
//////                                " \"type\": \"template\", \"template\": { \"name\": \"utility_message_template_with_variables_english\", \"language\": { \"code\": \"en_US\" }, {\"type\": \"body\", \"parameters\": [{\"type\": \"text\", \"text\": " + patientName + "}, " +
//////                                "{\"type\": \"body\", \"parameters\": [{\"type\": \"text\", \"text\":  " + doctorName + "}, " +
//////                                "{\"type\": \"body\", \"parameters\": [{\"type\": \"text\", \"text\":  " + date + "}," +
//////                                "{\"type\": \"body\", \"parameters\": [{\"type\": \"text\", \"text\":  " + address + "} } }"))
//////                                "{\"type\": \"body\", \"parameters\": [{\"type\": \"text\", \"text\":  " + time + "}," +
//////                                "{\"type\": \"body\", \"parameters\": [{\"type\": \"text\", \"text\":  " + clinicPhoneNumber + "}," +
////
//// //---------------------------------------------------------------------------------------------------------------
////
////                    .POST(HttpRequest.BodyPublishers.ofString(
////                            "{\"messaging_product\": \"whatsapp\", " +
////                                    "\"to\": \"" + phoneNumber + "\", " +
////                                    "\"type\": \"template\", " +
////                                    "\"template\": { " +
////                                    "\"name\": \"utility_message_template_with_variables_english\", " +
////                                    "\"language\": { \"code\": \"en_US\" }, " +
////                                    "\"components\": [" +
////                                    "{\"type\": \"body\", \"parameters\": [{\"type\": \"text\", \"text\": \"" + patientName + "\"}]}, " +
////                                    "{\"type\": \"body\", \"parameters\": [{\"type\": \"text\", \"text\": \"" + doctorName + "\"}]}, " +
////                                    "{\"type\": \"body\", \"parameters\": [{\"type\": \"text\", \"text\": \"" + date + "\"}]}, " +
////                                    "{\"type\": \"body\", \"parameters\": [{\"type\": \"text\", \"text\": \"" + time + "\"}]}, " +
////                                    "{\"type\": \"body\", \"parameters\": [{\"type\": \"text\", \"text\": \"" + clinicPhoneNumber + "\"}]}, " +
////                                    "{\"type\": \"body\", \"parameters\": [{\"type\": \"text\", \"text\": \"" + address + "\"}]}" +
////                                    "]" +
////                                    "}}"))
////                    .build();
////
////            //-------------------------------------------------------------------------------------------------
////
//////                        .POST(HttpRequest.BodyPublishers.ofString("{ \"messaging_product\": \"whatsapp\", \"to\": \"" + phoneNumber + "\"," +
//////                                "\"type\": \"template\", \"template\": { \"name\": \"utility_message_template_with_variables_english\", \"language\": { \"code\": \"en_US\" }, \"elements\": [" +
//////                                "{\"type\": \"text\", \"text\": \"" + patientName + "\"}," +
//////                                "{\"type\": \"text\", \"text\": \"" + doctorName + "\"}," +
//////                                "{\"type\": \"text\", \"text\": \"" + date + "\"}," +
//////                                "{\"type\": \"text\", \"text\": \"" + time + "\"}," +
//////                                "{\"type\": \"text\", \"text\": \"" + clinicPhoneNumber + "\"}," +
//////                                "{\"type\": \"text\", \"text\": \"" + address + "\"}]}}"))
//////
//////                        .build();
////
////
////            //--------------------------------------------------------------------------------------------------
////
////            HttpClient http = HttpClient.newHttpClient();
////            HttpResponse<String> response = http.send(request, HttpResponse.BodyHandlers.ofString());
////            System.out.println(response.body());
////
////        } catch (URISyntaxException | IOException |
////                 InterruptedException e) {
////            e.printStackTrace();
////        }
////
////
////        System.out.println("No phone numbers!");
////
////    }
//
//    public void helper2(String phoneNumber, String clinicName, String patientName, String date, String time, String doctorName, String clinicPhoneNumber, String address) {
//
//        try {
//            HttpRequest request = HttpRequest.newBuilder()
//                    .uri(new URI("https://graph.facebook.com/v16.0/101022073035672/messages"))
//                    .header("Authorization", "Bearer EAAEUZAogPPWEBAGZCNH1fZAkQwaLZAKXChlBdOiCtqyRR37I8l9zmdCBTbYvwrYKJVGZCs4XCl72Wd2TVKzK2aDAX6IhUOsyWlEhZCFc7eaqEPxp2ortoS32niwFbYw49zW9HebETOeku6wzEWxs8ZC7Qxj3Ec24mnsvK6sZCWITM53eqqxxGJZCbCDNYcBy7417sCuTHD0W0GbULmrTgg2BodSFmXn3Auq4DQ0ZB28Y61ZAQZDZD")
//                    .header("Content-Type", "application/json")
//                    .POST(HttpRequest.BodyPublishers.ofString(
//                            "{ \"messaging_product\": \"whatsapp\", \"recipient_type\": \"individual\", \"to\": \"" + phoneNumber +
//                                    "\", \"type\": \"template\", \"template\": { \"name\": \"message_for_patient_update_kg\", \"language\": { \"code\": \"ky_KG\" }, \"components\":[{\"type\":\"body\",\"parameters\":[{\"type\":\"text\",\"text\":\"" + clinicName +
//                                    "\"}, {\"type\":\"text\",\"text\":\"" + patientName +
//                                    "\"}, {\"type\":\"text\",\"text\":\"" + date +
//                                    "\"}, {\"type\":\"text\",\"text\":\"" + time +
//                                    "\"}, {\"type\":\"text\",\"text\":\"" + doctorName +
//                                    "\"}, {\"type\":\"text\",\"text\":\"" + clinicPhoneNumber +
//                                    "\"}, {\"type\":\"text\",\"text\":\"" + address + "\"}]}]}}")
//                    ).build();
//
//            HttpClient http = HttpClient.newHttpClient();
//
//            HttpResponse<String> response = http.send(request, HttpResponse.BodyHandlers.ofString());
//
//            System.out.println(response.body());
//
//        } catch (URISyntaxException | IOException |
//                 InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void helper(String phoneNumber, String clinicName, String patientName, String date, String time, String doctorName, String clinicPhoneNumber, String address) {
//
//        try {
//            HttpRequest request = HttpRequest.newBuilder()
//                    .uri(new URI("https://graph.facebook.com/v16.0/101022073035672/messages"))
//                    .header("Authorization", "Bearer EAAEUZAogPPWEBALGY5IMO1HZCcS8DIQtkvQ0OygTWJpIXSx9Si47YQs00YlTaj8c3iuMax3MYvOEx5pTYUNlVi5kGQv6IiLyBsVjqDmM3laPGLcb84kpvZAy4lzoz45hUvMAn02nUo9D0F4mOLGYYvjCbh3e0nkqfFhDp3msHQY7QRZBInaB2yOaguXEnTJjzbWB8NDjOhjAwW038K1ojamQGoJZC9swgZB1ofyPklwAZDZD")
//                    .header("Content-Type", "application/json")
//                    .POST(HttpRequest.BodyPublishers.ofString("{ \"messaging_product\": \"whatsapp\", \"recipient_type\": \"individual\", \"to\": \"" + phoneNumber +
//                            "\", \"type\": \"template\", \"template\": { \"name\": \"message_for_patient_n_en\", \"language\": { \"code\": \"en_US\" }, \"components\":[{\"type\":\"body\",\"parameters\":[{\"type\":\"text\",\"text\":\"" + clinicName +
//                            "\"}, {\"type\":\"text\",\"text\":\"" + patientName +
//                            "\"}, {\"type\":\"text\",\"text\":\"" + date +
//                            "\"}, {\"type\":\"text\",\"text\":\"" + time +
//                            "\"}, {\"type\":\"text\",\"text\":\"" + doctorName +
//                            "\"}, {\"type\":\"text\",\"text\":\"" + clinicPhoneNumber +
//                            "\"}, {\"type\":\"text\",\"text\":\"" + address + "\"}]}]}}")).build();
//
////                    .POST(HttpRequest.BodyPublishers.ofString(
////                                    "{\"messaging_product\": \"whatsapp\", \"to\": \"" + patientPhoneNumber +
////                                            "\", \"type\": \"template\", \"template\": { \"name\": \"hello_world\", \"language\": { \"code\": \"en_US\" } } }")
////                    ).build();
//
//            HttpClient http = HttpClient.newHttpClient();
//            HttpResponse<String> response = http.send(request, HttpResponse.BodyHandlers.ofString());
//            System.out.println(response.body());
//
//        } catch (URISyntaxException | IOException |
//                 InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//
//
////    public void helper2(String phoneNumber, String clinicName, String patientName, String date, String time, String doctorName, String clinicPhoneNumber, String address) {
////
////        try {
////            HttpRequest request = HttpRequest.newBuilder()
////                    .uri(new URI("https://graph.facebook.com/v16.0/101022073035672/messages"))
////                    .header("Authorization", "Bearer EAAEUZAogPPWEBALGY5IMO1HZCcS8DIQtkvQ0OygTWJpIXSx9Si47YQs00YlTaj8c3iuMax3MYvOEx5pTYUNlVi5kGQv6IiLyBsVjqDmM3laPGLcb84kpvZAy4lzoz45hUvMAn02nUo9D0F4mOLGYYvjCbh3e0nkqfFhDp3msHQY7QRZBInaB2yOaguXEnTJjzbWB8NDjOhjAwW038K1ojamQGoJZC9swgZB1ofyPklwAZDZD")
////                    .header("Content-Type", "application/json")
////                    .POST(HttpRequest.BodyPublishers.ofString(
////                            "{ \"messaging_product\": \"whatsapp\", \"recipient_type\": \"individual\", \"to\": \"" + phoneNumber +
////                                    "\", \"type\": \"template\", \"template\": { \"name\": \"message_for_patient_update_kg\", \"language\": { \"code\": \"ky_KG\" }, \"components\":[{\"type\":\"body\",\"parameters\":[{\"type\":\"text\",\"text\":\"" + clinicName +
////                                    "\"}, {\"type\":\"text\",\"text\":\"" + patientName +
////                                    "\"}, {\"type\":\"text\",\"text\":\"" + date +
////                                    "\"}, {\"type\":\"text\",\"text\":\"" + time +
////                                    "\"}, {\"type\":\"text\",\"text\":\"" + doctorName +
////                                    "\"}, {\"type\":\"text\",\"text\":\"" + clinicPhoneNumber +
////                                    "\"}, {\"type\":\"text\",\"text\":\"" + address + "\"}]}]}}")
////                    ).build();
////
////            HttpClient http = HttpClient.newHttpClient();
////
////            HttpResponse<String> response = http.send(request, HttpResponse.BodyHandlers.ofString());
////
////            System.out.println(response.body());
////
////        } catch (URISyntaxException | IOException |
////                 InterruptedException e) {
////            e.printStackTrace();
////        }
//
////        try {
////            HttpRequest request = HttpRequest.newBuilder()
////                    .uri(new URI("https://graph.facebook.com/v16.0/101022073035672/messages"))
////                    .header("Authorization", "Bearer EAAEUZAogPPWEBAOP6hcIsMEib6mzf29H8hGubW6xHYRsqP4NwC2917J0m7WBEKpUKZAC0GLvtKgbhGZC2cSn2HcYegZCL3dGZCf7Me3GyuYiKuZCZAZBzuNw3dW5euxPsPf7TAzi7g8jlZCIuC5dPQQZBMZCXKszKBE4l1yN6ZCJweijj6DsdBi4t2r7ZACFlwU5LRdZBUN1vOCpXoVsrk1FOPdOZAOBbGZBrM85RCzz0IZCnSFWIIAZDZD")
////                    .header("Content-Type", "application/json")
////                    .POST(HttpRequest.BodyPublishers.ofString("{ \"messaging_product\": \"whatsapp\", \"recipient_type\": \"individual\", \"to\": \"" + phoneNumber +
////                            "\", \"type\": \"template\", \"template\": { \"name\": \"message_for_patient_update_kg\", \"language\": { \"code\": \"ky_KG\" }, \"components\":[{\"type\":\"body\",\"parameters\":[{\"type\":\"text\",\"text\":\"" + clinicName +
////                            "\"}, {\"type\":\"text\",\"text\":\"" + patientName +
////                            "\"}, {\"type\":\"text\",\"text\":\"" + date +
////                            "\"}, {\"type\":\"text\",\"text\":\"" + time +
////                            "\"}, {\"type\":\"text\",\"text\":\"" + doctorName +
////                            "\"}, {\"type\":\"text\",\"text\":\"" + clinicPhoneNumber +
////                            "\"}, {\"type\":\"text\",\"text\":\"" + address + "\"}]}]}}")).build();
////
////            HttpClient http = HttpClient.newHttpClient();
////            HttpResponse<String> response = http.send(request, HttpResponse.BodyHandlers.ofString());
////            System.out.println(response.body());
////
////
//////            HttpRequest request = HttpRequest.newBuilder()
//////                    .uri(new URI("https://graph.facebook.com/v16.0/101022073035672/messages"))
//////                    .header("Authorization", "Bearer EAAEUZAogPPWEBAMKhZCtbwMowUlmh8U4l4DQeoMZCl1BlfZBevpgpK2AFh3Gn6reQWwYFBRUs1O6He9V3eEnxWj6TC1LrKv2SbwKovygT7Qj2cdr8pKLyjZAEqXSNEGT82P9oXQ5C9S6bh5UvfeZCfslcrvaL61z4MXSGpjd6vx3m9O0UeIgldZA7tNV5CtcZAEzdp8Vjbtwk7ui50AWdAY8e3ZBn437ZAP9FUjei63YFFNQZDZD")
//////                    .header("Content-Type", "application/json")
//////                    .POST(HttpRequest.BodyPublishers.ofString("{ \"messaging_product\": \"whatsapp\", \"recipient_type\": \"individual\", \"to\": \"" + phoneNumber + "\", \"type\": \"template\", \"template\": { \"name\": \"message_for_patient_en_kg_with_en_example_without_r\", \"language\": { \"code\": \"ky_KG\" }, \"components\":[{\"type\":\"body\",\"parameters\":[{\"type\":\"text\",\"text\":\""
//////                            + clinicName +
//////                            "\"}, {\"type\":\"text\",\"text\":\"" + patientName +
//////                            "\"}, {\"type\":\"text\",\"text\":\"" + date +
//////                            "\"}, {\"type\":\"text\",\"text\":\"" + time +
//////                            "\"}, {\"type\":\"text\",\"text\":\"" + doctorName +
//////                            "\"}, {\"type\":\"text\",\"text\":\"" + clinicPhoneNumber +
//////                            "\"}, {\"type\":\"text\",\"text\":\"" + address + "\"}]}]}}")).build();
//////
//////            HttpClient http = HttpClient.newHttpClient();
//////            HttpResponse<String> response = http.send(request, HttpResponse.BodyHandlers.ofString());
//////            System.out.println(response.body());
////
////        } catch (URISyntaxException | IOException |
////                 InterruptedException e) {
////            e.printStackTrace();
////        }
////    }
//}
//
//
////{"messaging_product":"whatsapp","contacts":[{"input":"996705436274","wa_id":"996705436274"}],"messages":[{"id":"wamid.HBgMOTk2NzA1NDM2Mjc0FQIAERgSNDQ5NzAzMEM5QzgzMTVGNTk0AA=="}]}
////{"messaging_product":"whatsapp","contacts":[{"input":"996507140201","wa_id":"996507140201"}],"messages":[{"id":"wamid.HBgMOTk2NTA3MTQwMjAxFQIAERgSNzU4RjU1QkVENzUyNkMyQzMyAA=="}]}
//
