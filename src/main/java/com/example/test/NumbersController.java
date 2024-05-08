package com.example.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Stream;

@RestController
public class NumbersController {

    @GetMapping("/numbers/sum")
    public Sum sum(@RequestParam final String numbers) {
        final Integer sum = Stream.of(numbers.split(","))
                                  .map(Integer::parseInt)
                                  .map(i -> i + 1)
                                  .filter(i -> i % 2 == 0)
                                  .reduce(0, Integer::sum);

        return new Sum(sum);
    }


}
