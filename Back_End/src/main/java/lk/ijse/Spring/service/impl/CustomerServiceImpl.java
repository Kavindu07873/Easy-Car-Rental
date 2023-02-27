package lk.ijse.Spring.service.impl;

import lk.ijse.Spring.dto.CustomerDto;
import lk.ijse.Spring.entity.Customer;
import lk.ijse.Spring.repo.CustomerRepo;
import lk.ijse.Spring.service.CustomerService;
import lk.ijse.Spring.util.ResponseUtil;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.transaction.Transactional;
import java.util.ArrayList;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {


    @Autowired
    CustomerRepo repo;

    @Autowired
    ModelMapper modelMapper;


    @Override
    public void addCustomer(CustomerDto dto) {
        Customer customer1 = modelMapper.map(dto, Customer.class);
        repo.save(customer1);
    }

    @Override
    public void UpdateCustomer(CustomerDto dto) {
        Customer customer1 = modelMapper.map(dto, Customer.class);
        repo.save(customer1);

    }

    @Override
    public void deleteCustomer(String id) {
        repo.deleteById(id);

    }

    @Override
    public ArrayList<CustomerDto> getAllCustomers() {
        return modelMapper.map(repo.findAll(), new TypeToken<ArrayList<CustomerDto>>() {
        }.getType());
    }

}
