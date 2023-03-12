package com.Hostel.main.controller;

import com.Hostel.main.service.CategoryService;
import com.Hostel.main.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class HomeController {
    @Autowired
    ProductService productService;
    @Autowired
    CategoryService categoryService;
}
