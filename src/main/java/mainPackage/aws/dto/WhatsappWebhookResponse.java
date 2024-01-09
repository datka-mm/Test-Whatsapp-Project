package mainPackage.aws.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class WhatsappWebhookResponse {

    private String receiverPhoneNumberId;

    private String senderPhoneNumber; // displayPhoneNumber

    private String senderDisplayName; // sender whatsapp display name

    private String text;

    private String timestamp;
}