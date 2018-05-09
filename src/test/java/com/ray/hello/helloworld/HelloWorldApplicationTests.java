package com.ray.hello.helloworld;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HelloWorldApplicationTests {
    private String urlTemplate;

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Before
    public void setUp() {
        this.urlTemplate = "http://localhost:" + this.port + "/hello";
    }

    @Test
    public void testHelloWorld() throws Exception {
        ResponseEntity<String> res = this.testRestTemplate.getForEntity(this.urlTemplate, String.class);

        assertThat(res.getStatusCode()).isEqualTo(HttpStatus.OK);
        System.out.println(res.getHeaders().getContentType());
        assertThat(res.getHeaders().getContentType().toString()).isEqualTo(MediaType.TEXT_PLAIN_VALUE + ";charset=UTF-8");
        assertThat(res.getBody()).isEqualTo("hello, world!");
    }
}
