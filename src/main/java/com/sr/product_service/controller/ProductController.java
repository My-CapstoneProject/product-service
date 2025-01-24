package com.sr.product_service.controller;

import com.sr.product_service.entity.ProductEntity;
import com.sr.product_service.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    ProductService productService;

    // Create a new product
    @PostMapping
    public ResponseEntity<ProductEntity> createProduct(@RequestBody ProductEntity product) {
        ProductEntity savedProduct = productService.addProduct(product);
        return ResponseEntity.ok(savedProduct);
    }

    // Get all products
    @GetMapping
    public ResponseEntity<List<ProductEntity>> getAllProducts() {
        List<ProductEntity> products = productService.getAllProducts();
        return ResponseEntity.ok(products);
    }

    // Get product by ID
    @GetMapping("/{productId}")
    public ResponseEntity<ProductEntity> getProductById(@PathVariable int productId) {
        ProductEntity product = productService.getProductById(productId);
        return ResponseEntity.ok(product);
    }

    // Get products by User ID
//    @GetMapping("/user/{userId}")
//    public ResponseEntity<List<ProductEntity>> getProductsByUserId(@PathVariable int userId) {
//        List<ProductEntity> products = productService.getProductsByUserId(userId);
//        return ResponseEntity.ok(products);
//    }

    // Update product details
    @PutMapping
    public ResponseEntity<ProductEntity> updateProduct(@RequestBody ProductEntity editProduct) {
        ProductEntity updatedProduct = productService.updateProduct(editProduct);
        return ResponseEntity.ok(updatedProduct);
    }

    // Delete product by ID
    @DeleteMapping("/{productId}")
    public ResponseEntity<String> deleteProduct(@PathVariable int productId) {
        productService.deleteProductById(productId);
        return ResponseEntity.ok("Product deleted successfully!");
    }
}

