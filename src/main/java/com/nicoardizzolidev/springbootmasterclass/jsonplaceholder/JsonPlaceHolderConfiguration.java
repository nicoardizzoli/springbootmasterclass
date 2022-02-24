package com.nicoardizzolidev.springbootmasterclass.jsonplaceholder;

import com.nicoardizzolidev.springbootmasterclass.model.posts.Post;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class JsonPlaceHolderConfiguration {

    @Bean("jsonplaceholder")
    CommandLineRunner runner(JSONPlaceHolderClient jsonPlaceHolderClient){
        return args -> {
            System.out.println("https://jsonplaceholder.typicode.com/posts");
            List<Post> posts = jsonPlaceHolderClient.getPosts();
            System.out.println(posts.size());
            System.out.println("https://jsonplaceholder.typicode.com/posts/2");
            System.out.println(jsonPlaceHolderClient.getPost(2));

        };
    }
}
