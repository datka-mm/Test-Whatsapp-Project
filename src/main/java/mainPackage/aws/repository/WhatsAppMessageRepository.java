package mainPackage.aws.repository;

import mainPackage.aws.entity.WhatsAppMessage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WhatsAppMessageRepository extends JpaRepository<WhatsAppMessage, Long> {
}