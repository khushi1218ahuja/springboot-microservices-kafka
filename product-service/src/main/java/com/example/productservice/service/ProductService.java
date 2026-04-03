package com.example.productservice.service;

import com.example.productservice.entity.Product;
import com.example.productservice.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }


    // SAVE PRODUCT
    public Product saveProduct(Product product){

        return repository.save(product);

    }


    // GET ALL PRODUCTS
    public List<Product> getAllProducts(){

        return repository.findAll();

    }


    // GET PRODUCT BY ID ⭐ VERY IMPORTANT
    public Product getProductById(Long id){

        return repository.findById(id).orElse(null);

    }

}
