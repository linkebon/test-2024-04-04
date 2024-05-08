package com.example.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.test.context.TestPropertySource;
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestPropertySource(properties = {"management.port=0"})
class NumbersControllerTest {

        @LocalServerPort
        private int port;

        @Autowired
        private RestTemplateBuilder restTemplateBuilder;

        @Test
        public void test() {
            // write test here that uses /numbers/sum and checks the result
        }

}