package com.amitraj.onetomanyjavatechie.dto;

import com.amitraj.onetomanyjavatechie.entity.Customer;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class OrderRequest {

    private Customer customer;
}
