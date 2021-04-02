package com.api.market.repositories;

import com.api.market.models.CategoryModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoryRepository extends CrudRepository<CategoryModel,Integer> {

    public abstract Optional<CategoryModel> findByIdCategory(Integer idCategory);

    public abstract Optional<CategoryModel> findByName(String name);
}
