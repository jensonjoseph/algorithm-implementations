package com.jensonjo.algorithmimplementations;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AlgorithmImplementationsApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(AlgorithmImplementationsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Welcome welcome = new Welcome();
        welcome.greet();
    }
}
