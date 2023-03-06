package lk.ijse.Spring.service;

import lk.ijse.Spring.dto.DriverDetailsDto;
import lk.ijse.Spring.dto.DriverDto;
import lk.ijse.Spring.entity.DriverDetails;

import java.util.ArrayList;

public interface DriverDetailsService {
    public void saveDriverDetails(DriverDetails driverDetails );
    public ArrayList<DriverDetailsDto> getAllDriverDetails();


    }
