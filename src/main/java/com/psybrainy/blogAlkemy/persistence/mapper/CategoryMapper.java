package com.psybrainy.blogAlkemy.persistence.mapper;

import com.psybrainy.blogAlkemy.domain.Category;
import com.psybrainy.blogAlkemy.persistence.entity.CategoryEntity;

public class CategoryMapper {

    public Category toCategory(CategoryEntity categoryEntity){

        return Category
                .builder()
                .id(categoryEntity.getId())
                .name(categoryEntity.getName())
                .build();
    }
}
