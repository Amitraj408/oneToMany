package com.amitraj.onetomanyjavatechie.service;

import com.amitraj.onetomanyjavatechie.repository.CustomerRepository;
import com.amitraj.onetomanyjavatechie.repository.ProductsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final CustomerRepository customerRepository;
    private final ProductsRepository productsRepository;

}
