package com.task.product.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.task.product.entities.Cart;
import com.task.product.service.CartImpl;

@RestController
public class CartController {
    @Autowired
    private CartImpl cImpl;

    @PostMapping (value = "/api/cart")
    public String addProduct(@RequestBody Cart cartobj){
        return cImpl.addProduct(cartobj);
    }

    @GetMapping(value = "api/cart/{id}")
    public Optional<Cart> getProductByCartId(String cartItemId){
        return cImpl.getProductByCartId(cartItemId);
    }
}
