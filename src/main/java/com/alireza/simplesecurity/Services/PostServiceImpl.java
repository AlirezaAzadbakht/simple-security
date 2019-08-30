package com.alireza.simplesecurity.Services;

import com.alireza.simplesecurity.entities.Post;
import com.alireza.simplesecurity.repositories.PostRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class PostServiceImpl implements PostService {
    PostRepo postRepo;

    public PostServiceImpl(PostRepo postRepo) {
        this.postRepo = postRepo;
    }

    @Override
    public ArrayList<Post> getAllPosts() {
        return (ArrayList<Post>) postRepo.findAll();
    }

    @Override
    public Post savePost(Post newPost) {
        return postRepo.save(newPost);
    }

    @Override
    public void deletePostById(Long id) {
        postRepo.deleteById(id);
    }

    @Override
    public Post saveOrUpdatePost(Post newPost, Long id) {
        return postRepo.findById(id)
                .map(x -> {
                    x.setSubject(newPost.getSubject());
                    x.setText(newPost.getText());
                    return postRepo.save(x);
                })
                .orElseGet(() -> {
                    newPost.setId(id);
                    return postRepo.save(newPost);
                });
    }
}
