package com.api.market.services;

import com.api.market.models.CategoryModel;
import com.api.market.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    public ArrayList<CategoryModel> getAll(){
        return (ArrayList<CategoryModel>) categoryRepository.findAll();
    }

    public Optional<CategoryModel> getByIdCategory(Integer idCategory){
        return categoryRepository.findByIdCategory(idCategory);
    }

    public Optional<CategoryModel> getByName(String name){
        return categoryRepository.findByName(name);
    }

    public CategoryModel save(CategoryModel category){
        return categoryRepository.save(category);
    }

    public boolean delete (Integer idCategory){
        try{
            categoryRepository.deleteById(idCategory);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
