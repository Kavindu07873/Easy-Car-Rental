package lk.ijse.Spring.service;

import lk.ijse.Spring.dto.OrdersDTO;

public interface PurchaseOrderService {
    public void purchaseOrder(OrdersDTO dto);

    public OrdersDTO searchOrder(String oid);
}
