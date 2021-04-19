package com.psybrainy.blogAlkemy.domain;

import lombok.Builder;
import lombok.Data;

import java.sql.Timestamp;

@Data @Builder
public class Post {

    private Long id_post;

    private String title;

    private String category;

    private Timestamp date;
}
