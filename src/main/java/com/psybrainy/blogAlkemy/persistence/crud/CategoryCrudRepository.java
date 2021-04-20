package com.psybrainy.blogAlkemy.persistence.crud;

import com.psybrainy.blogAlkemy.persistence.entity.CategoryEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CategoryCrudRepository extends CrudRepository<CategoryEntity, Long> {

    CategoryEntity findByName(String name);
}
