package com.learning.simpleWebApp.controller;

import com.learning.simpleWebApp.model.Product;
import com.learning.simpleWebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController
{
   @Autowired
   private ProductService productService;

   @RequestMapping("/products")
   public List<Product> getProducts(){
      return productService.getProducts();
   }

   @GetMapping("/products/{prodId}")
   public Optional<Product> getProductById(@PathVariable int prodId){
      return productService.getProductById(prodId);
   }

   @PostMapping("/products")
   public void addProduct(@RequestBody Product prod){
      productService.addProduct(prod);
   }

   @PutMapping("/products")
   public void updateProduct(@RequestBody Product prod){
      productService.updateProduct(prod);
   }

   @DeleteMapping("/products/{prodId}")
   public void deleteProduct(@PathVariable int prodId){
      productService.deleteProduct(prodId);
   }

}
