package com.psybrainy.blogAlkemy.domain.service;

import com.psybrainy.blogAlkemy.domain.Post;
import com.psybrainy.blogAlkemy.domain.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public List<Post> getAll(){
        return repo.getAll();
    }

    public Optional<Post> getPostById(long idPost){
        return repo.getPostById(idPost);
    }

    public void save(Post post){
        repo.savePost(post);
    }
}
