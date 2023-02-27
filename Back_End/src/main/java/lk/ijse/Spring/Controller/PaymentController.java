package lk.ijse.Spring.Controller;

import lk.ijse.Spring.dto.PaymentDto;
import lk.ijse.Spring.service.PaymentServic;
import lk.ijse.Spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/Payment")
@CrossOrigin//this will handle all the cross policy errors
public class PaymentController {

    @Autowired
    PaymentServic paymentService;


    @PostMapping
    public ResponseUtil savePayment(@ModelAttribute PaymentDto dto) {

        paymentService.addPayment(dto);

        return new ResponseUtil("200", dto.toString() + " Added", null);
    }
    @GetMapping
    public ResponseUtil getAllPayment(){
    ArrayList<PaymentDto> all = paymentService.getAllPayment();

        return new ResponseUtil("200"," Success",all);

    }
    @PutMapping
    public ResponseUtil updatePayment(@RequestBody PaymentDto dto){

        return new ResponseUtil("200",dto.toString()+" Updated",null);
    }


}
