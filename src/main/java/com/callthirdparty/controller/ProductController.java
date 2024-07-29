package com.callthirdparty.controller;

import com.callthirdparty.dao.RequestDTO;
import com.callthirdparty.dao.ResponseDTO;
import com.callthirdparty.model.Category;
import com.callthirdparty.model.Product;
import com.callthirdparty.service.IProductervice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {


    IProductervice iProductervice;

    @Autowired
    public ProductController(IProductervice iProductervice){
        this.iProductervice=iProductervice;
    }


    @GetMapping
    public List<Product> getAllProduct(){

         return iProductervice.getListOfProduct();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable("id") Long id){
        return iProductervice.getProductById(id);
    }

    @GetMapping("/categories")
    public  List<Category> getListOfCategory(){
        return null;
    }

    @GetMapping("/categories/{categoryname}")
    public List<Product> getProductByCategoryName(@PathVariable("categoryname")String categoryname){
        return null;
    }

    @PostMapping
    public Product addProduct(@RequestBody RequestDTO product){
        return null;
    }

}
