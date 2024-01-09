//package test.testwhatsapp.config.security;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Component;
//import org.springframework.util.StringUtils;
//import org.springframework.web.filter.OncePerRequestFilter;
//import test.testwhatsapp.db.entity.Customer;
//import test.testwhatsapp.db.repository.CustomerRepository;
//
//import javax.servlet.FilterChain;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.util.Optional;
//
//
//@Component
//@RequiredArgsConstructor
//public class JWTTokenFilter extends OncePerRequestFilter {
//
//    private final JWTUtil jwtUtil;
//    private final CustomerRepository customerRepository;
//    public static final String AUTHORIZATION = "Authorization";
//    public static final String BEARER = "Bearer ";
//
//    @Override
//    protected void doFilterInternal(HttpServletRequest request,
//                                    HttpServletResponse response,
//                                    FilterChain filterChain) throws ServletException, IOException {
//
//        Optional<String> optionalJwt = getJwtFromRequest(request);
//
//        optionalJwt.ifPresent(token -> {
//
//
//            String phoneNumber = jwtUtil.validateJWTToken(token);
//
//            Customer customer = customerRepository.findByCustomerByPhoneNumber(phoneNumber).orElseThrow(
//                    () -> new UsernameNotFoundException("Customer with phone number: " + phoneNumber + " not found")
//            );
//
//            UsernamePasswordAuthenticationToken authToken = new UsernamePasswordAuthenticationToken(
//                    customer,
//                    null,
//                    customer.getAuthorities()
//            );
//
//            SecurityContextHolder.getContext().setAuthentication(authToken);
//        });
//
//        filterChain.doFilter(request, response);
//    }
//
//    private Optional<String> getJwtFromRequest(HttpServletRequest request) {
//
//        String bearerToken = request.getHeader(AUTHORIZATION);
//
//        if (StringUtils.hasText(bearerToken) && bearerToken.startsWith(BEARER)) {
//            return Optional.of(bearerToken.substring(BEARER.length()));
//        }
//
//        return Optional.empty();
//    }
//}
