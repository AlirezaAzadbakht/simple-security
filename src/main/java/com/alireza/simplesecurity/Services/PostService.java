package com.alireza.simplesecurity.Services;

import com.alireza.simplesecurity.entities.Post;

import java.util.Optional;

public interface PostService {
    Iterable<Post> getAllPosts ();

    Post savePost(Post newPost);

    void deletePostById(Long id);

    Post saveOrUpdatePost(Post newPost, Long id);
}
