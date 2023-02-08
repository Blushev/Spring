package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class PostService {
    public List<Post> listAllPosts(){
        ArrayList<Post> list = new ArrayList<Post>();
        list.add(new Post("Пост№1", 12));
        list.add(new Post("Пост№2", 10));
        list.add(new Post("Пост№3", 9));

        return list;
    }
}
