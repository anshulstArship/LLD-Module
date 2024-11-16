package com.star.productservicenov.services;

import com.star.productservicenov.models.Product;

import java.util.List;

public interface ProductService {

    Product getSingleProduct(Long id);
    List<Product> getAllProducts();

    void createProduct(Product product);
    void deleteProduct(Long id);

    void updateProduct(Long id, Product product);
    void  replaceProduct(Long id, Product product);
}
