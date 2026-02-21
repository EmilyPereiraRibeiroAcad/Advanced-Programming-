package com.fiap.ec.api.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping
    public String sayhello() {
        return  "Hello word blá blá blá";
    }
}
