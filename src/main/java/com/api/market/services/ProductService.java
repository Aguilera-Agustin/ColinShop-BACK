package com.api.market.services;

import com.api.market.models.CategoryModel;
import com.api.market.models.ProductModel;
import com.api.market.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public ArrayList<ProductModel> getAll(){
        return (ArrayList<ProductModel>) productRepository.findAll();
    }

    public Optional<List<ProductModel>> getByIdProduct(Integer idProduct){
        return productRepository.getByIdProduct(idProduct);
    }

    public Optional<ProductModel> getByName(String name){
        return productRepository.getByName(name);
    }

    public ProductModel save (ProductModel product){
        return productRepository.save(product);
    }

    public boolean delete (Integer idProduct){
        try{
            productRepository.deleteById(idProduct);
            return true;
        } catch (Exception e){
            return false;
        }
    }
}
