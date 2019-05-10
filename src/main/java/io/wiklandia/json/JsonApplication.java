package io.wiklandia.json;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class JsonApplication {

    public static void main(String[] args) {
        SpringApplication.run(JsonApplication.class, args);
    }

}
