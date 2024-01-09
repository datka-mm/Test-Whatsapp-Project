package mainPackage.aws.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "messages")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WhatsAppMessage {

    @Id
    @GeneratedValue(
            generator = "message_gen",
            strategy = GenerationType.SEQUENCE
    )
    @SequenceGenerator(
            name = "message_gen",
            sequenceName = "message_seq",
            allocationSize = 1
    )
    private Long id;

    private String sender;

    private String message;

//    private boolean isRead;

    private Long clinicId;

    private LocalDateTime timestamp;

    public WhatsAppMessage(String sender, String message, LocalDateTime timestamp) {
        this.sender = sender;
        this.message = message;
        this.timestamp = timestamp;
    }

    public WhatsAppMessage(String sender, String message, Long clinicId, LocalDateTime timestamp) {
        this.sender = sender;
        this.message = message;
        this.clinicId = clinicId;
        this.timestamp = timestamp;
    }
}
