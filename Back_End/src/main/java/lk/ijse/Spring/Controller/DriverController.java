package lk.ijse.Spring.Controller;


import lk.ijse.Spring.dto.DriverDto;
import lk.ijse.Spring.service.DriverService;
import lk.ijse.Spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/Driver")
@CrossOrigin//this will handle all the cross policy errors
public class DriverController {

    @Autowired
    DriverService driverService;


    @PostMapping
    public ResponseUtil saveDriver(@ModelAttribute DriverDto dto){
//          System.out.println(driver);

        driverService.addDriver(dto);
        return new ResponseUtil("200",dto.toString()+ " Added",null);
    }

    @PutMapping
    public ResponseUtil updateDriver(@RequestBody DriverDto dto){
            driverService.UpdateDriver(dto);

        return new ResponseUtil("200",dto.toString()+" Updated",null);
    }

    @DeleteMapping(params = "id")
    public ResponseUtil deleteDriver(String id){
            driverService.DeleteDriver(id);
        return new ResponseUtil("200",id+" Deleted",null);
    }

    @GetMapping
    public ResponseUtil getAllDriver(){
        ArrayList<DriverDto> allDriver = driverService.getAllDriver();

        return new ResponseUtil("200"," Success",allDriver);

    }
}
