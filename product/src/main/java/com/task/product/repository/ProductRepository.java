package com.task.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.task.product.entities.Product;

public interface ProductRepository extends JpaRepository<Product, String> {
     
    @Query (value ="update  product set product_status=Boolen.TRUE where id=? )",nativeQuery=true)
    public Product deleteByProductId(Product productId);
}
