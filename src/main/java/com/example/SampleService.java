package com.example;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Service;

@Service
public class SampleService {

    @PreAuthorize("#username == principal.username")
    String sample(String depertment, @P("username") String username) {
        return "success";
    }
}
