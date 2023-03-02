package lk.ijse.Spring.repo;

import lk.ijse.Spring.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepo extends JpaRepository<Car,String> {

//    Car findCarByType(String type);
}
