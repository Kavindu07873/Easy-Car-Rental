package lk.ijse.Spring.service;

import lk.ijse.Spring.dto.DriverDto;
import lk.ijse.Spring.entity.Driver;
import org.modelmapper.TypeToken;

import java.util.ArrayList;

public interface DriverService {

    public  void addDriver(DriverDto dto);
    public  void UpdateDriver(DriverDto dto);
    public void DeleteDriver(String id);
    public ArrayList<DriverDto> getAllDriver();
}
