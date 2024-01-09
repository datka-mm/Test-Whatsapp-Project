//package test.testwhatsapp.db.entity;
//
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//import test.testwhatsapp.db.repository.CustomerRepository;
//
//import javax.transaction.Transactional;
//
//@Service
//@Slf4j
//@Transactional
//@RequiredArgsConstructor
//public class UserServiceImpl implements UserDetailsService {
//
//    private final CustomerRepository customerRepository;
//
//    @Override
//    public UserDetails loadUserByUsername(String phoneNumber) throws UsernameNotFoundException {
//        return customerRepository.findByCustomerByPhoneNumber(phoneNumber).orElseThrow(
//                () -> {
//                    log.error("Customer with phone number: {} not found", phoneNumber);
//                    throw new UsernameNotFoundException("Customer with phone number: " + phoneNumber + " not found");
//                }
//        );
//
//    }
//}
