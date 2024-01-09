//package test.testwhatsapp.db.repository;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.stereotype.Repository;
//import test.testwhatsapp.db.entity.Customer;
//
//import java.util.Optional;
//
//@Repository
//public interface CustomerRepository extends JpaRepository<Customer, Long> {
//
//    @Query("select c from Customer c where c.phoneNumber = :phoneNumber")
//    Optional<Customer> findByCustomerByPhoneNumber(String phoneNumber);
//
//    @Query("select case when count(c) > 0 then true else false end from Customer c where c.phoneNumber like :phoneNumber")
//    boolean existsByPhoneNumber(String phoneNumber);
//}