package lk.ijse.Spring.Controller;


import lk.ijse.Spring.dto.CustomerDto;
import lk.ijse.Spring.service.CustomerService;
import lk.ijse.Spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/Customer")
@CrossOrigin//this will handle all the cross policy errors
public class CustomerController {
@Autowired
    CustomerService customerService;
    @PostMapping
    public ResponseUtil saveCustomer(@ModelAttribute CustomerDto dto){

        customerService.addCustomer(dto);
        return new ResponseUtil("200",dto.toString()+ " Added",null);
    }

    @PutMapping
    public ResponseUtil updateCustomer(@RequestBody CustomerDto dto){
        System.out.println(dto.toString());
            customerService.UpdateCustomer(dto);

        return new ResponseUtil("200",dto.toString()+" Updated",null);
    }

    @DeleteMapping(params = "id")
    public ResponseUtil deleteCustomer(String id){
//        System.out.println(id);
        customerService.deleteCustomer(id);
        return new ResponseUtil("200",id+" Deleted",null);
    }
    @GetMapping
    public ResponseUtil getAllCustomer(){

        ArrayList<CustomerDto> allCustomers = customerService.getAllCustomers();
//        List<Customer> all = repo.findAll();
        return new ResponseUtil("200"," Success",allCustomers);

    }
}
