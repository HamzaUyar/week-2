package com.iytesd2.spring_rest.repository;

import com.iytesd2.spring_rest.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {
    private final List<Product> productList = new ArrayList<>();

    public ProductRepository() {
        // Initialize with some sample data
        Product product = new Product();
        product.setId(1L);
        product.setName("Samsung");
        product.setDescription("Samsung Galaxy");
        product.setPrice(999.99);
        productList.add(product);
    }

    public List<Product> getProducts() {
        return productList;
    }
}
