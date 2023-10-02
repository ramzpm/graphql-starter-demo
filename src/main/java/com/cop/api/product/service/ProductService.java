package com.cop.api.product.service;


import com.cop.api.product.model.Product;

public interface ProductService {

    Product getProduct(String partnumber);

    Product addProduct(Product product);

}
