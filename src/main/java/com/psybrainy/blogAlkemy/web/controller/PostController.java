package com.psybrainy.blogAlkemy.web.controller;

import com.psybrainy.blogAlkemy.domain.Post;
import com.psybrainy.blogAlkemy.domain.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
