package com.api.market.repositories;

import com.api.market.models.CategoryModel;
import com.api.market.models.ProductModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends CrudRepository<ProductModel, Integer> {

    public abstract Optional<List<ProductModel>> getByIdProduct(Integer idProduct);

    public abstract Optional<ProductModel> getByName(String name);
}
