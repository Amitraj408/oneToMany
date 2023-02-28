package com.amitraj.onetomanyjavatechie.repository;

import com.amitraj.onetomanyjavatechie.dto.OrderResponse;
import com.amitraj.onetomanyjavatechie.entity.Customer;
import org.hibernate.mapping.Join;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {

    @Query("select c.name,p.productName from Customer c Join c.products p")
    public List<Object[]> getJoinInformation();

    @Query("select c.name,p.price,p.quantity from Customer c join c.products p")
    public List<Object[]> getMultipleColumns();

    @Query("select new com.amitraj.onetomanyjavatechie.dto.OrderResponse(c.name,p.productName,p.price,p.quantity) from Customer c join c.products p")
    public List<OrderResponse> getAllTheInformation();

    @Query("select new com.amitraj.onetomanyjavatechie.dto.OrderResponse(c.name,p.productName,c.email,p.quantity) from Customer c join c.products p")
    public List<OrderResponse> getFinalInfo();
}
