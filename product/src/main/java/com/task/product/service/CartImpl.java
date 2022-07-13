package com.task.product.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.task.product.entities.Cart;
import com.task.product.entities.Product;
import com.task.product.entities.Status;
import com.task.product.repository.CartRepository;
import com.task.product.repository.ProductRepository;

@Service
public class CartImpl implements CartInterface {
    
    @Autowired
    CartRepository cartrepoObj;
    @Autowired
    ProductRepository proObj;

    public String addProduct(Cart cartObj){
        Optional<Product> p1 = proObj.findById(cartObj.getProductId());
        if(p1.isPresent()){

            if(p1.get().getProductStatus() == Status.ACTIVE){
                cartrepoObj.save(cartObj);
            }
            else{
                return "Product has been added";
            }
        }
        else{
            return "Product Unavailable";
        }
        return null;
    }
    public Optional<Cart> getProductByCartId(String cartItemId) {
        return cartrepoObj.findById(cartItemId);
    }
}
