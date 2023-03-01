package lk.ijse.Spring.service.impl;

import lk.ijse.Spring.dto.CarDto;
import lk.ijse.Spring.dto.OrderDetailsDTO;
import lk.ijse.Spring.dto.OrdersDTO;
import lk.ijse.Spring.entity.OrderDetails;
import lk.ijse.Spring.entity.Orders;
import lk.ijse.Spring.repo.*;
import lk.ijse.Spring.service.PurchaseOrderService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;

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
        Orders orders = mapper.map(dto, Orders.class);
        System.out.println(orders.toString());

        if (ordersRepo.existsById(orders.getOid())) {
            throw new RuntimeException("Order : " + orders.getOid() + " Already Available.!");
        }

        ordersRepo.save(orders);

    }
    @Override
    public void purchaseOrderDetails(OrderDetails details) {
        OrderDetails orderDetails = mapper.map(details,OrderDetails.class);
        orderDetailsRepo.save(orderDetails);
    }

    @Override
    public OrdersDTO searchOrder(String oid) {
        return mapper.map(ordersRepo.findById(oid),
                OrdersDTO.class);
    }
    @Override
    public ArrayList<OrdersDTO> getAllOrders(){
        return mapper.map(ordersRepo.findAll(), new TypeToken<ArrayList<OrdersDTO>>() {
        }.getType());
    }
    @Override
    public ArrayList<OrderDetailsDTO> getAllOrdersDetails(){
        return mapper.map(orderDetailsRepo.findAll(),
                new TypeToken<ArrayList<OrderDetailsDTO>>() {
        }.getType());
    }
}
