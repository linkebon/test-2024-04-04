package com.example.test;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.stream.Stream;

@SpringBootApplication
public class TestApplication {
    public static void main(String[] args) {
        Stream.of("1", "2", "3", "4", "5", "6", "7", "8");
    }

}
