package lk.ijse.Spring.service;

import lk.ijse.Spring.dto.DriverDetailsDto;
import lk.ijse.Spring.dto.DriverDto;

import java.util.ArrayList;

public interface DriverDetailsService {
    public void addDriver(DriverDetailsDto dto);
    public ArrayList<DriverDetailsDto> getAllDriver();


    }
