package lk.ijse.Spring.service.impl;

import lk.ijse.Spring.dto.CustomerDto;
import lk.ijse.Spring.dto.DriverDto;
import lk.ijse.Spring.entity.Driver;
import lk.ijse.Spring.repo.CustomerRepo;
import lk.ijse.Spring.repo.DriverRepo;
import lk.ijse.Spring.service.DriverService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;

@Service
@Transactional
public class DriverServiceImpl implements DriverService {
    @Autowired
    DriverRepo Drepo;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public void addDriver(DriverDto dto) {
//        Driver driver = new Driver(dto.getName(),dto.getLicNo(),dto.getAddress(), dto.getAvailability(),dto.getUser());
        Driver driver = modelMapper.map(dto, Driver.class);
        Drepo.save(driver);


    }

    @Override
    public void UpdateDriver(DriverDto dto) {
        Driver driver = modelMapper.map(dto, Driver.class);

        driver.setAvailability("no");
        Drepo.save(driver);
    }

    @Override
    public void DeleteDriver(String id) {
        Drepo.deleteById(id);
    }

    @Override
    public ArrayList<DriverDto> getAllDriver() {
        return modelMapper.map(Drepo.findAll(), new TypeToken<ArrayList<DriverDto>>() {
        }.getType());
    }
}
