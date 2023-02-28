package com.amitraj.onetomanyjavatechie.service;

import com.amitraj.onetomanyjavatechie.dto.OrderRequest;
import com.amitraj.onetomanyjavatechie.dto.OrderResponse;
import com.amitraj.onetomanyjavatechie.entity.Customer;
import com.amitraj.onetomanyjavatechie.repository.CustomerRepository;
import com.amitraj.onetomanyjavatechie.repository.ProductsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;
    private final ProductsRepository productsRepository;



    public Customer saveCustomerWithProduct(Customer customer) {
        return customerRepository.save(customer);
    }
    public List<Customer> getAllCustomer() {
        return customerRepository.findAll();
    }

    public List<Object[]> getJoinColumnDetails(){
        return customerRepository.getJoinInformation();
    }

    public List<Object[]> getMultipleColumns(){
        return customerRepository.getMultipleColumns();
    }
    public List<OrderResponse> getAllTheInformation(){
        return customerRepository.getAllTheInformation();
    }
    public List<OrderResponse> getFinalInfo(){
        return customerRepository.getFinalInfo();
    }



}
