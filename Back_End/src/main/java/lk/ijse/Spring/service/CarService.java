package lk.ijse.Spring.service;

import lk.ijse.Spring.dto.CarDto;

import java.util.ArrayList;

public interface CarService {

    public void  UpdateCar(CarDto dto);
    public  void addCar(CarDto dto);
    public  void  DeleteCar(String id);
    public ArrayList<CarDto> getAllCar();
}
