package lk.ijse.Spring.repo;

import lk.ijse.Spring.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepo extends JpaRepository<Payment,String> {

}
