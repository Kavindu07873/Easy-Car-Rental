package lk.ijse.Spring.service;

import lk.ijse.Spring.dto.CarDto;
import lk.ijse.Spring.entity.Car;
import org.modelmapper.TypeToken;

import java.util.ArrayList;
import java.util.Collections;

public interface CarService {

    public void  UpdateCar(CarDto dto);
    public  void addCar(CarDto dto);
    public  void  DeleteCar(String id);
    public ArrayList<CarDto> getAllCar();
}
