package com.cx.dragonnest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class DragonNestApplication {

    public static void main(String[] args) {
        SpringApplication.run(DragonNestApplication.class, args);
    }

}
