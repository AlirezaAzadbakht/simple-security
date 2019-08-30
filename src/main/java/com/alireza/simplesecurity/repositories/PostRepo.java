package com.alireza.simplesecurity.repositories;

import com.alireza.simplesecurity.entities.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepo extends CrudRepository<Post,Long> {
}
