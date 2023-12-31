package com.cop.api.product.repository;

import com.cop.api.product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, String> {

    Product getProductByProductId(String partNumber);
}
