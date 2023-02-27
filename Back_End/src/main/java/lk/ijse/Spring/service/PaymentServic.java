package lk.ijse.Spring.service;

import lk.ijse.Spring.dto.PaymentDto;
import lk.ijse.Spring.entity.Payment;
import org.modelmapper.TypeToken;

import java.util.ArrayList;

public interface PaymentServic {

    public void addPayment(PaymentDto dto);
    public void UpdatePayment(PaymentDto dto);
    public void DeletePayment();

    public ArrayList<PaymentDto> getAllPayment();
}
