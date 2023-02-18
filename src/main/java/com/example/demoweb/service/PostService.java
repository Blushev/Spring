package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Service
public class PostService {
    public List<Post> listAllPosts(){
        Date date1 = new Date();
        Date date2 = new Date();
        Date date3 = new Date();
        date1.getTime();
        date2.getTime();
        date3.getTime();

        ArrayList<Post> list = new ArrayList<Post>();
        list.add(new Post("Пост№1", 12, date1));
        list.add(new Post("Пост№2", 10, date2));
        list.add(new Post("Пост№3", 9, date3));

        return list;
    }
}
