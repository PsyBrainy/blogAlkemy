package com.psybrainy.blogAlkemy.domain;

import lombok.Builder;
import lombok.Data;

import java.sql.Timestamp;

@Data @Builder
public class Post {

    private String idPost;

    private String title;

    private String content;

    private String category;

    private String image;

    private Timestamp date;
}
