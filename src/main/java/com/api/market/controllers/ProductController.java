package com.api.market.controllers;

import com.api.market.models.CategoryModel;
import com.api.market.models.ProductModel;
import com.api.market.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/getAll")
    public ArrayList<ProductModel> getAll(){
        return productService.getAll();
    }

    @GetMapping("/getById/{idProduct}")
    Optional<List<ProductModel>> getByIdProduct(@PathVariable("idProduct") Integer idProduct){
        return productService.getByIdProduct(idProduct);
    }

    @GetMapping("/getByName/{name}")
    public Optional<ProductModel> getByName(@PathVariable("name")  String name){
        return productService.getByName(name);
    }

    @PostMapping("/save")
    public ProductModel save(@RequestBody ProductModel product){
        return productService.save(product);
    }

    @DeleteMapping("/delete/{idProduct}")
    public boolean delete(@PathVariable("idProduct") Integer idProduct){
        return productService.delete(idProduct);
    }
}
