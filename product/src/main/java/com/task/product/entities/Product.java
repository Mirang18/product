package com.task.product.entities;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity

public class Product {
@Id
@Column(name = "productId")
    public String productId;
    public String productName;
    public String productImage;
    public float productPrice;
    String productDescription;
    @Enumerated(EnumType.STRING)
    public Status productStatus;
    @Enumerated(EnumType.STRING)
    public Categorize productCategorize;

    @OneToMany
    @JoinColumn(name="productId",referencedColumnName = "productId")
    private List<Cart> cart= new LinkedList<>();


    public Product() {
    }

    public Product(String productId, String productName, String productImage, float productPrice, String productDescription, Status productStatus, Categorize productCategorize, List<Cart> cart) {
        this.productId = productId;
        this.productName = productName;
        this.productImage = productImage;
        this.productPrice = productPrice;
        this.productDescription = productDescription;
        this.productStatus = productStatus;
        this.productCategorize = productCategorize;
        this.cart = cart;
    }

    public String getProductId() {
        return this.productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return this.productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductImage() {
        return this.productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public float getProductPrice() {
        return this.productPrice;
    }

    public void setProductPrice(float productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductDescription() {
        return this.productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public Status getProductStatus() {
        return this.productStatus;
    }

    public void setProductStatus(Status productStatus) {
        this.productStatus = productStatus;
    }

    public Categorize getProductCategorize() {
        return this.productCategorize;
    }

    public void setProductCategorize(Categorize productCategorize) {
        this.productCategorize = productCategorize;
    }

    public List<Cart> getCart() {
        return this.cart;
    }

    public void setCart(List<Cart> cart) {
        this.cart = cart;
    }

    @Override
    public String toString() {
        return "{" +
            " productId='" + getProductId() + "'" +
            ", productName='" + getProductName() + "'" +
            ", productImage='" + getProductImage() + "'" +
            ", productPrice='" + getProductPrice() + "'" +
            ", productDescription='" + getProductDescription() + "'" +
            ", productStatus='" + getProductStatus() + "'" +
            ", productCategorize='" + getProductCategorize() + "'" +
            ", cart='" + getCart() + "'" +
            "}";
    }
   
    
   
   
}
