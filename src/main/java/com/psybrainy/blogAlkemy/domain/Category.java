package com.psybrainy.blogAlkemy.domain;

import lombok.Data;

import java.util.List;

@Data
public class Category {

    private Long id;

    private String name;

    private List<Post> posts;
}
