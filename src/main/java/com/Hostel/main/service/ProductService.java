package com.Hostel.main.service;

import com.Hostel.main.model.Product;
import com.Hostel.main.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;
    public List<Product> getAllProduct(){
        return productRepository.findAll();
    }
}
