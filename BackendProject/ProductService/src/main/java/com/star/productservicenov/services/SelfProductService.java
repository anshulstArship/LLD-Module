package com.star.productservicenov.services;

import com.star.productservicenov.exceptions.ProductNotFoundExcption;
import com.star.productservicenov.models.Category;
import com.star.productservicenov.models.Product;
import com.star.productservicenov.repositiories.CategoryRepository;
import com.star.productservicenov.repositiories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("selfProductService")
public class SelfProductService implements ProductService{

    private ProductRepository productRepository;
    private CategoryRepository categoryRepository;

    SelfProductService(ProductRepository productRepository,CategoryRepository categoryRepository){
        this.productRepository=productRepository;
        this.categoryRepository=categoryRepository;
    }

    @Override
    public Product getSingleProduct(Long id) throws ProductNotFoundExcption {
        Optional<Product> product = productRepository.findById(id);
        if(product.isEmpty()){
            throw  new ProductNotFoundExcption();
        }
        return product.get();
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public void createProduct(Product product) {
        if(product.getCategory()!=null){
            if(product.getCategory().getId()==null){
                String value = product.getCategory().getValue();
                Optional<Category> valueFromDB = categoryRepository.findByValue(value);

                if(valueFromDB.isEmpty()){
                    Category category=categoryRepository.save(product.getCategory());
                    product.setCategory(category);
                }else{
                    product.setCategory(valueFromDB.get());
                }
            }
            productRepository.save(product);
        }else {
            throw new RuntimeException();
        }


    }

    @Override
    public void deleteProduct(Long id) {

    }

    @Override
    public void updateProduct(Long id, Product product) {

    }

    @Override
    public void replaceProduct(Long id, Product product) {

    }
}
