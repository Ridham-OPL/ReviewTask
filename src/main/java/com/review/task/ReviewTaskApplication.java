package com.review.task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@SpringBootApplication
public class ReviewTaskApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReviewTaskApplication.class, args);
    }

}
