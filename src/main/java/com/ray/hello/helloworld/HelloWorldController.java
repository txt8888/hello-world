package com.ray.hello.helloworld;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(description = "Simple hello-world service to demonstrate how Concourse pipeline automates service deployment")
@RequestMapping(value = "/hello",
                produces = { MediaType.TEXT_PLAIN_VALUE })
public class HelloWorldController {
    @GetMapping
    @ApiOperation("Simply say hello!")
    String get() {
        return "hello, world!";
    }
}