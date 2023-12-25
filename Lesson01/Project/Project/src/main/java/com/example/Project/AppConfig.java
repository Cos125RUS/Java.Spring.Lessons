package com.example.Project;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Configuration
public class AppConfig {
    @Bean
    public MyService myService() {
        return new MyServiceImpl();
    }
}

@Service
class MyServiceImpl implements MyService {

    @Override
    public void say() {
        System.out.println("Say");
    }
}

interface MyService {
    public void say();
}
