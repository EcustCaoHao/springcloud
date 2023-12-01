package com.example.resttemplate;

import com.example.resttemplate.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
class RestTemplateApplicationTests {

    @Test
    void testGet(){
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8080/rest/get?name=cao";
        String result = restTemplate.getForObject(url, String.class);
        System.out.println(result);
    }

    @Test
    void testPostByJson(){
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8080/rest/post1";
        String result = restTemplate.postForObject(url, new User("h", 12), String.class);
        System.out.println(result);
    }

    @Test
    void testPostByCode(){
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8080/rest/post2";
        LinkedMultiValueMap<String,Object> map = new LinkedMultiValueMap<>();
        map.add("name","hei");
        map.add("age",12);
        String result = restTemplate.postForObject(url, map, String.class);
        System.out.println(result);
    }



}
