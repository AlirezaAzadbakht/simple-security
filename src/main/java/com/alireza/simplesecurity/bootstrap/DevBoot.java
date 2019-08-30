package com.alireza.simplesecurity.bootstrap;

import com.alireza.simplesecurity.entities.Post;
import com.alireza.simplesecurity.repositories.PostRepo;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBoot implements ApplicationListener<ContextRefreshedEvent> {
    PostRepo postRepo;

    public DevBoot(PostRepo postRepo) {
        this.postRepo = postRepo;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData() {
        Post p1 =new Post("sub1","hello there111");
        Post p2 =new Post("sub2","hello there222");
        Post p3 =new Post("sub3","hello there333");
        Post p4 =new Post("sub4","hello there444");
        Post p5 =new Post("sub5","hello there555");

        postRepo.save(p1);
        postRepo.save(p2);
        postRepo.save(p3);
        postRepo.save(p4);
        postRepo.save(p5);

    }


}
