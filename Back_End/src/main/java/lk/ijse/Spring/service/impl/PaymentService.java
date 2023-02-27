package lk.ijse.Spring.service.impl;

import lk.ijse.Spring.dto.DriverDto;
import lk.ijse.Spring.dto.PaymentDto;
import lk.ijse.Spring.entity.Payment;
import lk.ijse.Spring.repo.PaymentRepo;
import lk.ijse.Spring.service.PaymentServic;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;

@Service
@Transactional
public class PaymentService implements PaymentServic {

    @Autowired
    ModelMapper mapper;
    @Autowired
    PaymentRepo repo;
@Override
    public void addPayment(PaymentDto dto){
        Payment payment = mapper.map(dto,Payment.class);
        repo.save(payment);
    }
    @Override
    public void UpdatePayment(PaymentDto dto){
        Payment payment = mapper.map(dto,Payment.class);
        repo.save(payment);

    }
    @Override
    public void DeletePayment(){}
    @Override
    public ArrayList<PaymentDto> getAllPayment(){
        return mapper.map(repo.findAll(), new TypeToken<ArrayList<PaymentDto>>() {
        }.getType());
    }
}
