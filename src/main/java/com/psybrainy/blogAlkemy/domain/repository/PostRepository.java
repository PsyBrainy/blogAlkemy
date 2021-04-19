package com.psybrainy.blogAlkemy.domain.repository;

import com.psybrainy.blogAlkemy.domain.Post;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository {

    List<Post> getAll();
    Post getPostById(long idPost);
}
