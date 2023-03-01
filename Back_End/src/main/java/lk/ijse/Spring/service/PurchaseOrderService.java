package lk.ijse.Spring.service;

import lk.ijse.Spring.dto.OrderDetailsDTO;
import lk.ijse.Spring.dto.OrdersDTO;
import lk.ijse.Spring.entity.OrderDetails;

import java.util.ArrayList;

public interface PurchaseOrderService {
    public void purchaseOrder(OrdersDTO dto);
    public void purchaseOrderDetails(OrderDetails details);

    public OrdersDTO searchOrder(String oid);
    public ArrayList<OrdersDTO> getAllOrders();
    public ArrayList<OrderDetailsDTO> getAllOrdersDetails();


    }
