package com.example.Project;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Primary
@Profile("local")
public class MyEngine implements Engine{
    public MyEngine() {
        System.out.println("My car engine starting");
    }

    public void go() {
        System.out.println("Driven fast!");
    }
}
