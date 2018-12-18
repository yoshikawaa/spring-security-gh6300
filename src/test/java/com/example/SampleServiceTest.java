package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ComponentScan
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SampleServiceTest {

    @Autowired
    private SampleService service;

    @Test
    @WithMockUser(username = "user")
    public void test() {
        service.sample("dep", "user");
    }

}
