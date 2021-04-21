package com.psybrainy.blogAlkemy.domain.service;

import com.psybrainy.blogAlkemy.domain.Category;
import com.psybrainy.blogAlkemy.domain.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getAll(){
        return categoryRepository.getAll();
    }
}
