//package mainPackage.testwhatsapp.db.entity;
//
//import lombok.*;
//
//import javax.persistence.*;
//import java.time.LocalDateTime;
//
//@Entity
//@Table(name = "customers")
//@Getter
//@Setter
//@Builder
//@NoArgsConstructor
//@AllArgsConstructor
//public class Customer {
//
//    @Id
//    @GeneratedValue(
//            generator = "customer_gen",
//            strategy = GenerationType.SEQUENCE
//    )
//    @SequenceGenerator(
//            name = "customer_gen",
//            sequenceName = "customer_seq",
//            allocationSize = 1
//    )
//    private Long id;
////    private String email;
//    private String phoneNumber;
//    private String password;
//    private String url;
//    private String phoneNumberId;
//    private String accessToken;
//    private LocalDateTime recordDate;
//    private LocalDateTime notificationTime;
//}