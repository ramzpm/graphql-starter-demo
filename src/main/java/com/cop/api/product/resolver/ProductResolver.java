package com.cop.api.product.resolver;


import com.cop.api.product.model.Product;
import com.cop.api.product.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
public class ProductResolver  {

    ProductService productService;

    @QueryMapping
    public Product getProduct(@Argument String id){
        return productService.getProduct(id);
    }

    @MutationMapping
    public Product addProduct(@Argument Product product){
        return productService.addProduct(product);
    }
}
