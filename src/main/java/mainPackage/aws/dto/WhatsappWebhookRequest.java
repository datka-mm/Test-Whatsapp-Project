package mainPackage.aws.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class WhatsappWebhookRequest {

    private String mode;

    private String challenge;

    private String token;

    private int displayPhoneNumber;    // my number

    private Long phoneNumberId;         // my whatsapp phone number id

    private String from;               // who sent the message (phone number)

    private String timestamp;

    private String message;            // text
}
