package lk.ijse.Spring.Controller;


import lk.ijse.Spring.dto.CarDto;
import lk.ijse.Spring.service.CarService;
import lk.ijse.Spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/Car")
@CrossOrigin//this will handle all the cross policy errors
public class CarController {



    @Autowired
    CarService carService;

    @PostMapping
    public ResponseUtil saveCar(@ModelAttribute CarDto dto){
        carService.addCar(dto);
        return new ResponseUtil("200",dto.toString()+ " Added",null);

    }

    @PutMapping
    public ResponseUtil updateCar(@RequestBody CarDto dto){

                carService.UpdateCar(dto);
        return new ResponseUtil("200",dto.toString()+" Updated",null);
    }

    @DeleteMapping(params = "id")
    public ResponseUtil deleteCar(String id){
    carService.DeleteCar(id);

        return new ResponseUtil("200",id+" Deleted",null);
    }

    @GetMapping
    public ResponseUtil getAllCar(){
        ArrayList<CarDto> allCar = carService.getAllCar();
        System.out.println(allCar);
        return new ResponseUtil("200"," Success",allCar);

    }

//    @GetMapping(params = "type")
//    public ResponseUtil SearchCarByType(String type){
//        CarDto carDto = carService.SearchCarByType(type);
//        return  new ResponseUtil("200","Success.!",carDto);
//    }
}
