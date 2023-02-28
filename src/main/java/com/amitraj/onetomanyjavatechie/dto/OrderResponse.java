package com.amitraj.onetomanyjavatechie.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class OrderResponse {

    private String name;
    private String productName;
    private int price;
    private String email;

    public OrderResponse(String name, String productName, String email, int quantity) {
        this.name = name;
        this.productName = productName;
        this.email = email;
        this.quantity = quantity;
    }

    private  int quantity;

    public OrderResponse(String name, String productName, int price, int quantity) {
        this.name = name;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }
}
