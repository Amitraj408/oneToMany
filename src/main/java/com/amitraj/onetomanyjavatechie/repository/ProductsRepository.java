package com.amitraj.onetomanyjavatechie.repository;

import com.amitraj.onetomanyjavatechie.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsRepository extends JpaRepository<Product,Integer> {
}
