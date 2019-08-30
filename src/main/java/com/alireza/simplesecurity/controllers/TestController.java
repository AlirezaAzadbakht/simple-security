package com.alireza.simplesecurity.controllers;

import com.alireza.simplesecurity.Services.PostService;
import com.alireza.simplesecurity.entities.Post;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {
    PostService postService;

    public TestController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/posts")
    public Iterable<Post> getPosts() {
        return postService.getAllPosts();
    }

    @PostMapping("/posts")
    @ResponseStatus(HttpStatus.CREATED)
    Post newPost(@RequestBody Post newPost) {
        return postService.savePost(newPost);
    }

    @PutMapping("/posts/{id}")
    Post saveOrUpdate(@RequestBody Post newPost, @PathVariable Long id) {
        return postService.saveOrUpdatePost(newPost, id);
    }

    @DeleteMapping("/posts/{id}")
    void deleteBook(@PathVariable Long id) {
        postService.deletePostById(id);
    }
}