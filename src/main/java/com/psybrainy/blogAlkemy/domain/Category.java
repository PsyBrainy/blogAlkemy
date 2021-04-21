package com.psybrainy.blogAlkemy.domain;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data @Builder
public class Category {

    private Long id;

    private String name;
}
