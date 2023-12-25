package com.example.Project;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class YourEngine implements Engine{
    public YourEngine() {
        System.out.println("Your car engine starting");
    }

    public void go() {
        System.out.println("Driven slowly!");
    }
}
