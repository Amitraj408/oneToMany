package com.amitraj.onetomanyjavatechie.controller;

import com.amitraj.onetomanyjavatechie.dto.OrderRequest;
import com.amitraj.onetomanyjavatechie.dto.OrderResponse;
import com.amitraj.onetomanyjavatechie.entity.Customer;
import com.amitraj.onetomanyjavatechie.service.CustomerService;
import com.amitraj.onetomanyjavatechie.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/customer/product")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;
    private final ProductService productService;

    @PostMapping
    public Customer createCustomer(@RequestBody Customer customer){
        return customerService.saveCustomerWithProduct(customer);
    }

    @GetMapping
    public List<Customer> getAllCustomer(){
        return customerService.getAllCustomer();
    }
    @GetMapping("/get/info")
    public List<String> getJoinDetail(){
        List<Object[]> details = customerService.getJoinColumnDetails();
       return details.stream().map(ob->ob[0]+","+ob[1]).collect(Collectors.toList());
    }
    @GetMapping("/get/multiple/column")
    public List<Object> getMultipleColumnDetails(){
        List<Object[]> details = customerService.getMultipleColumns();
        return details.stream().map(ob->ob[0]+" : "+ob[1]+" : "+ob[2]).collect(Collectors.toList());
    }
    @GetMapping("/get/all")
    public List<OrderResponse> getAllTheDetails(){
        return customerService.getAllTheInformation();

    }
    @GetMapping("/get/final")
    public List<OrderResponse> getFinalInfo(){
        return customerService.getFinalInfo();

    }



}
