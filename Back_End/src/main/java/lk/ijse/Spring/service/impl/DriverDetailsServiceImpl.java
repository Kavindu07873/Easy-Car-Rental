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
    public void saveDriverDetails(DriverDetails driverDetails ) {

        DriverDetails driverDetail = modelMapper.map(driverDetails, DriverDetails.class);
        driverDetailsRepo.save(driverDetail);


    }
    @Override
    public ArrayList<DriverDetailsDto> getAllDriverDetails() {
        return modelMapper.map(driverDetailsRepo.findAll(),
                new TypeToken<ArrayList<DriverDetailsDto>>() {
        }.getType());
    }
}
