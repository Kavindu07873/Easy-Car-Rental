package lk.ijse.Spring.Controller;

import lk.ijse.Spring.dto.OrdersDTO;
import lk.ijse.Spring.entity.OrderDetails;
import lk.ijse.Spring.service.PurchaseOrderService;
import lk.ijse.Spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/purchase")
@CrossOrigin
public class PurchaseOrderController {

    @Autowired
    private PurchaseOrderService service;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil purchaseOrder(@RequestBody OrdersDTO dto) {

        System.out.println(dto.toString());


        service.purchaseOrder(dto);
        return new ResponseUtil("200", "Successfully Purchased.!", null);

    }


    @GetMapping(path = "/{oid}")
    public ResponseUtil searchOrder(@PathVariable String oid) {
        OrdersDTO ordersDTO = service.searchOrder(oid);
        return new ResponseUtil("200", "Successfully Purchased.!", ordersDTO);
    }

}
