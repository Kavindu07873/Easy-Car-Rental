package lk.ijse.Spring.repo;

import lk.ijse.Spring.entity.DriverDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;

public interface DriverDetailsRepo extends JpaRepository<DriverDetails, String> {
}
