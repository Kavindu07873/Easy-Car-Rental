package lk.ijse.Spring.repo;

import lk.ijse.Spring.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepo extends JpaRepository<Orders,String> {
}
