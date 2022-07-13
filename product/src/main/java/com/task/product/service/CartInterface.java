package com.task.product.service;

import java.util.Optional;

import com.task.product.entities.Cart;

public interface CartInterface {
    public String addProduct(Cart cartObj);

    public Optional<Cart> getProductByCartId(String cartItemId );
}
