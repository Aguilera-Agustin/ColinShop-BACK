package com.api.market.controllers;

import com.api.market.models.CategoryModel;
import com.api.market.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @GetMapping("/getAll")
    public ArrayList<CategoryModel> getAll(){
        return categoryService.getAll();
    }

    @GetMapping("/getById/{idCategory}")
    public Optional<CategoryModel> getByIdCategory(@PathVariable("idCategory") Integer idCategory){
        return categoryService.getByIdCategory(idCategory);
    }

    @GetMapping("/getByName/{name}")
    public Optional<CategoryModel> getByName(@PathVariable("name") String name){
        return categoryService.getByName(name);
    }

    @PostMapping("/save")
    public CategoryModel save(@RequestBody CategoryModel category){
        return categoryService.save(category);
    }

    @DeleteMapping("/delete/{idCategory}")
    public boolean delete(@PathVariable("idCategory") Integer idCategory){
        return categoryService.delete(idCategory);
    }
}
