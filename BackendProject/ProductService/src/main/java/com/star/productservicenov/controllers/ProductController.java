package com.star.productservicenov.controllers;

import com.star.productservicenov.exceptions.ProductNotFoundExcption;
import com.star.productservicenov.models.Product;
import com.star.productservicenov.services.ProductService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    private ProductService productService;

    public ProductController(@Qualifier("selfProductService") ProductService productService){
        this.productService=productService;

    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getSingleProduct(@PathVariable Long id) throws ProductNotFoundExcption {

        return new ResponseEntity<>(productService.getSingleProduct(id), HttpStatus.OK);
    }

    @GetMapping
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @PostMapping()
    public void createProduct(@RequestBody Product product){
        productService.createProduct(product);

    }

    @DeleteMapping("/{id}") // Request Type
    public void deleteProduct(@PathVariable Long id){}

    @PatchMapping("/{id}") // Partial Update
    public void updateProduct(@PathVariable Long id, @RequestBody Product product){};

    @PutMapping("/{id}")
    public void replaceProduct(@PathVariable Long id, @RequestBody Product product){};


}
