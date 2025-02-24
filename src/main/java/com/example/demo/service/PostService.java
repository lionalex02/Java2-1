package com.example.demo.service;

import com.example.demo.model.Post;
import com.example.demo.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.stream.StreamSupport;

@Service
public class PostService {
    //    List<Post> posts = new ArrayList<>();
    @Autowired
    PostRepository postRepository;

    public List<Post> listAllPosts(){
        return StreamSupport.stream(postRepository.findAll().spliterator(), false).toList();
    }
//    public void AddPosts(int number){
//        List<Post> Posts = new ArrayList<>();
//        for (int i = 0; i < number; i++) {
//            Post Post = new Post(Long.valueOf(i),"Lorem Post " + i);
//            posts.add(Post);
//        }
//    }

    public void create(String text) {
        Post post = new Post(null, text, new Date());
        postRepository.save(post);
    }

    public static long generateRandomLong() {
        Random random = new Random();
        return random.nextLong(100);
    }
}