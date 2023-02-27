package lk.ijse.Spring.service.impl;

//import lk.ijse.Spring.entity.Item;
//import lk.ijse.Spring.repo.ItemRepo;
import lk.ijse.Spring.dto.OrdersDTO;
import lk.ijse.Spring.entity.OrderDetails;
import lk.ijse.Spring.entity.Orders;
import lk.ijse.Spring.repo.*;
import lk.ijse.Spring.service.PurchaseOrderService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class PurchaseOrderServiceImpl implements PurchaseOrderService {

    @Autowired
    private OrdersRepo ordersRepo;

    @Autowired
    private OrderDetailsRepo orderDetailsRepo;

    @Autowired
    private CustomerRepo customerRepo;
    @Autowired
    private CarRepo carRepo;

    @Autowired
    private DriverRepo driverRepo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public void purchaseOrder(OrdersDTO dto) {
        //Let's handle it in Spring Way
        Orders orders = mapper.map(dto, Orders.class);
        System.out.println(orders.toString());
//
//        save order and order details
//        if an error occur all transactions will be rolled backed
//
//        orderDetailsRepo.save(orderDetails);
//
        if (ordersRepo.existsById(orders.getOid())) {
            throw new RuntimeException("Order : " + orders.getOid() + " Already Available.!");
        }
        //save order and order details
        //if an error occur all transactions will be rolled backed
        ordersRepo.save(orders);




//        for (OrderDetails od : orders.getOrderDetails()) {
//            //find and update item qty on hand
//
//            Optional<Item> resp = itemRepo.findById(od.getItemCode());
//            if (!resp.isPresent()) {
//                throw new RuntimeException(od.getItemCode() + ": Item Not Available On the Database.!");
//            }
//
//            Item item = resp.get();
//            item.setQtyOnHand((item.getQtyOnHand() - od.getQty()));
//            itemRepo.save(item);
//        }

    }

    @Override
    public OrdersDTO searchOrder(String oid) {
        return mapper.map(ordersRepo.findById(oid), OrdersDTO.class);
    }


}
