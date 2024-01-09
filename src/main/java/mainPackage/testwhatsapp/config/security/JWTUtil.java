//package test.testwhatsapp.config.security;
//
//
//import com.auth0.jwt.JWT;
//import com.auth0.jwt.algorithms.Algorithm;
//import com.auth0.jwt.interfaces.DecodedJWT;
//import com.auth0.jwt.interfaces.JWTVerifier;
//import lombok.Getter;
//import lombok.Setter;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.stereotype.Component;
//
//import java.time.ZonedDateTime;
//import java.util.Date;
//
//@Component
////@ConfigurationProperties(prefix = "security.jwt")
//@Getter
//@Setter
//public class JWTUtil {
//
//    @Value("${security.jwt.secret}")
//    private String secret;
//
//    @Value("${security.jwt.issuer}")
//
//    private String issuer;
//
//    @Value("${security.jwt.expires}")
//    private long expires;
//
//    public String generateToken(String email) {
//
//        Date expirationDate = Date.from(ZonedDateTime.now().plusDays(60).toInstant());
//
//        return JWT.create()
//                .withClaim("email", email)
//                .withIssuedAt(new Date())
//                .withIssuer(issuer)
//                .withExpiresAt(expirationDate)
//                .sign(Algorithm.HMAC512(secret));
//    }
//
//    public String validateJWTToken(String jwt) {
//        DecodedJWT verify = getDecodedJWT(jwt);
//        return verify.getClaim("email").asString();
//    }
//
//    private DecodedJWT getDecodedJWT(String jwt) {
//        JWTVerifier jwtVerifier = JWT.require(Algorithm.HMAC512(secret))
//                .withIssuer(issuer)
//                .build();
//
//        return jwtVerifier.verify(jwt);
//    }
//}
