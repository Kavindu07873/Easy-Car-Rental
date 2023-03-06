package lk.ijse.Spring.Controller;

import lk.ijse.Spring.dto.DriverDetailsDto;
import lk.ijse.Spring.dto.DriverDto;
import lk.ijse.Spring.service.DriverDetailsService;
import lk.ijse.Spring.service.DriverService;
import lk.ijse.Spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/DriverDetails")
@CrossOrigin
public class DriverDetailsController {

    @Autowired
    DriverDetailsService driverDetailsService;


    @PostMapping
    public ResponseUtil saveDriver(@ModelAttribute DriverDetailsDto driverDetailsDto){

        driverDetailsService.addDriver(driverDetailsDto);
        return new ResponseUtil("200",driverDetailsDto.toString()+ " Added",null);
    }
    @GetMapping
    public ResponseUtil getAllDriver(){
        ArrayList<DriverDetailsDto> allDriver = driverDetailsService.getAllDriver();

        return new ResponseUtil("200"," Success",allDriver);

    }
}
