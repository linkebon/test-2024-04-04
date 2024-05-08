package com.example.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.test.context.TestPropertySource;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Map;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestPropertySource(properties = {"management.port=0"})
class NumbersControllerTest {

    @LocalServerPort
    private int port;

    @Autowired
    private RestTemplateBuilder restTemplateBuilder;

    @Test
    public void test() {
        final RestTemplate restTemplate = restTemplateBuilder.build();

        final UriComponentsBuilder uriComponentsBuilder = UriComponentsBuilder.fromUriString("http://localhost:" + port + "/numbers/sum")
                                                                              .queryParam("numbers", "1,2,3,4,5");
        final String body = restTemplate.getForEntity(uriComponentsBuilder.toUriString(),
                                                      String.class,
                                                      Map.of("numbers", "1,2,3,4,5"))
                                        .getBody();
        Assertions.assertEquals("{\"sum\":12}", body);
    }

}