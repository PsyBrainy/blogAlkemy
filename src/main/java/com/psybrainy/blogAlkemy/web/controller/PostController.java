package com.psybrainy.blogAlkemy.web.controller;

import com.psybrainy.blogAlkemy.domain.Post;
import com.psybrainy.blogAlkemy.domain.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/post")
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping
    List<Post> getAll(){
        return postService.getAll();
    }
}
