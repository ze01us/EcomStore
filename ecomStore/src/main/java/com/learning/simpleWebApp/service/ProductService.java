package com.learning.simpleWebApp.service;

import com.learning.simpleWebApp.model.Product;
import com.learning.simpleWebApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService
{

   @Autowired
   private ProductRepo productRepo;

   //List<Product> products= new ArrayList<>(Arrays.asList(new Product(101,"IPhone",79999),new Product(102,"S24",89999)));

   public List<Product> getProducts(){
      return productRepo.findAll();
   }

   public Optional<Product> getProductById(int prodId)
   {
      return productRepo.findById(prodId);
   }

   public void addProduct(Product prod){
      productRepo.save(prod);
   }

   public void updateProduct(Product prod)
   {
     productRepo.save(prod);
   }

   public void deleteProduct(int prodId)
   {
     productRepo.deleteById(prodId);
   }
}
