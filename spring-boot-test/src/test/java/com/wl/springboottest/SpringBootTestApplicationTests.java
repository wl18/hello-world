package com.wl.springboottest;

import com.wl.springboottest.entity.User;
import com.wl.springboottest.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringBootTestApplicationTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    void contextLoads() {
    }

    @Test
    public void test1() {
        List<User> all = userRepository.findAll();
        System.out.println(all);
    }

}
