package com.cop.api.product.service.impl;

import com.cop.api.product.model.Product;
import com.cop.api.product.repository.ProductRepository;
import com.cop.api.product.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ProductServiceImpl implements ProductService {

    ProductRepository productRepository;

    @Override
    public Product getProduct(String partnumber) {
     return productRepository.getProductByProductId(partnumber);
    }

    @Override
    public Product addProduct(Product product) {
        return productRepository.saveAndFlush(product);
    }
}
