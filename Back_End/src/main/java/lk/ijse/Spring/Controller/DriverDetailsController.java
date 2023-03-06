package lk.ijse.Spring.Controller;

import lk.ijse.Spring.dto.DriverDetailsDto;
import lk.ijse.Spring.dto.DriverDto;
import lk.ijse.Spring.dto.OrderDetailsDTO;
import lk.ijse.Spring.dto.OrdersDTO;
import lk.ijse.Spring.entity.DriverDetails;
import lk.ijse.Spring.service.DriverDetailsService;
import lk.ijse.Spring.service.DriverService;
import lk.ijse.Spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/DriverDetails")
@CrossOrigin
public class DriverDetailsController {

    @Autowired
  private   DriverDetailsService driverDetailsService;


//    @PostMapping
//    public ResponseUtil saveDriverDetails(@ModelAttribute DriverDetailsDto driverDetailsDto){
//
//        driverDetailsService.addDriver(driverDetailsDto);
//        return new ResponseUtil("200",driverDetailsDto.toString()+ " Added",null);
//    }
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil saveDriverDetails(@RequestBody DriverDetails dto) {

//        System.out.println(dto.toString());


        driverDetailsService.saveDriverDetails(dto);
        return new ResponseUtil("200", "Successfully Purchased.!", null);

    }

    @GetMapping
    public ResponseUtil getAllDriverDetails(){
        ArrayList<DriverDetailsDto> driverDetailsDtos = driverDetailsService.getAllDriverDetails();
        return new ResponseUtil("200"," Success",driverDetailsDtos);

    }


//    @GetMapping
//    public ResponseUtil getAllDriverDetails(){
//        ArrayList<DriverDetailsDto> allDriver = driverDetailsService.getAllDriver();
//
//        return new ResponseUtil("200"," Success",allDriver);
//
//    }
}
