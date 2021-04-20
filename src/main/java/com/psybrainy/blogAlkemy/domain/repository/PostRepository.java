package com.psybrainy.blogAlkemy.domain.repository;

import com.psybrainy.blogAlkemy.domain.Post;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PostRepository {

    List<Post> getAll();
    Optional<Post> getPostById(long idPost);
    Post savePost(Post post);
}
