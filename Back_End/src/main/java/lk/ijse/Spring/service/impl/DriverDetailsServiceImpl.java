package lk.ijse.Spring.service.impl;

import lk.ijse.Spring.dto.DriverDetailsDto;
import lk.ijse.Spring.dto.DriverDto;
import lk.ijse.Spring.entity.Driver;
import lk.ijse.Spring.entity.DriverDetails;
import lk.ijse.Spring.repo.DriverDetailsRepo;
import lk.ijse.Spring.repo.DriverRepo;
import lk.ijse.Spring.service.DriverDetailsService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;

@Service
@Transactional
public class DriverDetailsServiceImpl implements DriverDetailsService {
    @Autowired
    DriverDetailsRepo driverDetailsRepo;

    @Autowired
    ModelMapper modelMapper;
    @Override
    public void addDriver(DriverDetailsDto driverDetailsDto) {
//        Driver driver = new Driver(dto.getName(),dto.getLicNo(),dto.getAddress(), dto.getAvailability(),dto.getUser());
        DriverDetails driverDetail = modelMapper.map(driverDetailsDto, DriverDetails.class);
        driverDetailsRepo.save(driverDetail);


    }
    @Override
    public ArrayList<DriverDetailsDto> getAllDriver() {
        return modelMapper.map(driverDetailsRepo.findAll(), new TypeToken<ArrayList<DriverDto>>() {
        }.getType());
    }
}
