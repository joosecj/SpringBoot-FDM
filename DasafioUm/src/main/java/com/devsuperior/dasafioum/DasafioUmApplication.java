package com.devsuperior.dasafioum;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DasafioUmApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DasafioUmApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Olá mundo!");
    }
}
