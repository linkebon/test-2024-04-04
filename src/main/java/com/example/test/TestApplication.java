package com.example.test;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.stream.Stream;

@SpringBootApplication
public class TestApplication {
    public static void main(String[] args) {
        System.out.println(Stream.of("1", "2", "3", "4", "5", "6", "7", "8")
              .map(Integer::parseInt)
              .map(i -> i + 1)
              //.filter(i -> (i & 1) == 0)
              .filter(i -> i % 2 == 0)
              .reduce((a, b) -> a + b).get()
        );
    }

}
