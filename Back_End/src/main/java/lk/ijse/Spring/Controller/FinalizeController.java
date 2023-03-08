package lk.ijse.Spring.Controller;

import lk.ijse.Spring.dto.Finalizedto;
import lk.ijse.Spring.dto.OrdersDTO;
import lk.ijse.Spring.service.FinalizeService;
import lk.ijse.Spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Finalize")
@CrossOrigin
public class FinalizeController {

    @Autowired
    private FinalizeService finalizeService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil FinalizeOrder(@RequestBody Finalizedto dto) {

        System.out.println(dto.toString());


        finalizeService.FinalizeOrder(dto);
        return new ResponseUtil("200", "Successfully Purchased.!", null);

    }



}
