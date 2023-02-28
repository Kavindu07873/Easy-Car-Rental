package lk.ijse.Spring.service;

import lk.ijse.Spring.dto.OrdersDTO;
import lk.ijse.Spring.entity.OrderDetails;

public interface PurchaseOrderService {
    public void purchaseOrder(OrdersDTO dto);

    public void purchaseOrderDetails(OrderDetails details);

    public OrdersDTO searchOrder(String oid);
}
