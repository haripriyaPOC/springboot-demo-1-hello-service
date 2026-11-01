package com.example.helloservice;

import java.util.List;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hello")
public class HelloController {

    @GetMapping
    public Map<String, String> hello() {
        return Map.of("application", "hello-service", "message", "Hello from Spring Boot!");
    }
}
