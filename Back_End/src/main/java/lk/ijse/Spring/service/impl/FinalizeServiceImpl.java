package lk.ijse.Spring.service.impl;

import lk.ijse.Spring.dto.Finalizedto;
import lk.ijse.Spring.dto.OrdersDTO;
import lk.ijse.Spring.entity.Finalize;
import lk.ijse.Spring.entity.Orders;
import lk.ijse.Spring.repo.FinalizeRepo;
import lk.ijse.Spring.service.FinalizeService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class FinalizeServiceImpl implements FinalizeService {

    @Autowired
    ModelMapper mapper;
    @Autowired
    FinalizeRepo finalizeRepo;


    public void FinalizeOrder(Finalizedto dto) {
        Finalize finalize = mapper.map(dto, Finalize.class);
        System.out.println(finalize.toString());
        if (finalizeRepo.existsById(finalize.getOid())) {
            throw new RuntimeException("Order : " + finalize.getOid() + " Already Available.!");
        }
        finalizeRepo.save(finalize);

    }

}
