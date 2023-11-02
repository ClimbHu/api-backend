package com.api.project.apiinterface;

import com.api.project.client.ApiClient;
import com.api.project.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class ApiInterfaceApplicationTests {


    @Resource
    private ApiClient apiClient;


    @Test
    void contextLoads() {
        String result = apiClient.getNameByGet("haha");
        User user = new User();
        user.setUsername("haha");
        String usernameByPost = apiClient.getUsernameByPost(user);
        System.out.println(result);
        System.out.println(usernameByPost);

    }

}
