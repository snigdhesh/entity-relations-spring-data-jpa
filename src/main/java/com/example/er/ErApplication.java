package com.example.er;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class ErApplication {

  public static void main(String[] args) {
    SpringApplication.run(ErApplication.class, args);
  }

}
