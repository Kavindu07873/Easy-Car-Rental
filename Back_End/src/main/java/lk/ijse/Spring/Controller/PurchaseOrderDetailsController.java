package lk.ijse.Spring.Controller;

import lk.ijse.Spring.entity.OrderDetails;
import lk.ijse.Spring.service.PurchaseOrderService;
import lk.ijse.Spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/purchaseDetails")
@CrossOrigin
public class PurchaseOrderDetailsController {
    @Autowired
    private PurchaseOrderService service;
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil purchaseOrderDetails(@RequestBody OrderDetails details) {
        System.out.println(details.toString());
        service.purchaseOrderDetails(details);
        return new ResponseUtil("200", "Successfully Purchased.!", null);

    }
}
