package com.psybrainy.blogAlkemy.web.controller;

import com.psybrainy.blogAlkemy.domain.Post;
import com.psybrainy.blogAlkemy.domain.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/post")
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping
    public String getAll(Model model){
        List<Post> postList = postService.getAll();

        model.addAttribute("posts", postList);

        return "/views/post/homePostList";
    }

    @GetMapping("/{id}")
    public String getPostById(@PathVariable("id") long idPost, Model model){
        Post post = postService.getPostById(idPost).orElseThrow();

        model.addAttribute("post", post);

        return "/views/post/postById";
    }

    @GetMapping("/createPost")
    public String create(Model model){
        Post post = new Post();

        model.addAttribute("title", "Crear nuevo Post");
        model.addAttribute("post", post);

        return "/views/post/createPost";
    }

    @PostMapping("/savePost")
    public String savePost(@ModelAttribute Post post){
        postService.save(post);

        return "rediret:/views/post/homePostList";
    }
}
