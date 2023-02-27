package lk.ijse.Spring.repo;

import lk.ijse.Spring.entity.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverRepo  extends JpaRepository<Driver,String> {
}
