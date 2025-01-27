package com.sr.product_service.service;

import com.sr.product_service.entity.ProductEntity;
import com.sr.product_service.dao.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    ProductRepo productRepository;

    public ProductEntity addProduct(ProductEntity newproduct) {
        return productRepository.saveAndFlush(newproduct);
    }

    public List<ProductEntity> getAllProducts() {
        return productRepository.findAll();
    }

    public Optional<ProductEntity> getProductById(int productId) {
        return productRepository.findById(productId);
    }

//    public List<ProductEntity> getProductsByUserId(int userId) {
//        return productRepository.findByUserId(userId);
//    }

    public ProductEntity updateProduct(ProductEntity editproduct) {
        return productRepository.save(editproduct);
    }

    public void deleteProductById(int productId) {
        productRepository.deleteById(productId);
    }
}
