package com.psybrainy.blogAlkemy.persistence;

import com.psybrainy.blogAlkemy.domain.Category;
import com.psybrainy.blogAlkemy.domain.repository.CategoryRepository;
import com.psybrainy.blogAlkemy.persistence.crud.CategoryCrudRepository;
import com.psybrainy.blogAlkemy.persistence.entity.CategoryEntity;
import com.psybrainy.blogAlkemy.persistence.mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CategoryImplRepo implements CategoryRepository {

    @Autowired
    private CategoryCrudRepository repo;

    @Autowired
    private CategoryMapper mapper;


    @Override
    public List<Category> getAll() {

        List<CategoryEntity> categoryEntities = (List<CategoryEntity>) repo.findAll();

        return categoryEntities
                .stream()
                .map(categoryEntity -> mapper.toCategory(categoryEntity))
                .collect(Collectors.toList());
    }
}
