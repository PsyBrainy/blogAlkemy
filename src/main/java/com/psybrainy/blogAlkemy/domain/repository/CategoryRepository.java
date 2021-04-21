package com.psybrainy.blogAlkemy.domain.repository;

import com.psybrainy.blogAlkemy.domain.Category;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository {

    List<Category> getAll();
}
