package com.example.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Stream;

@RestController
public class NumbersController {

    @GetMapping("/numbers/sum")
    public Sum sum(@RequestParam final String numbers) {
        return null;
    }


}
