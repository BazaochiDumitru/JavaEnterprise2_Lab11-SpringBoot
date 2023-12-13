package org.example;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @RequestMapping("/")
    public String home() {
        return "test";
    }

    @RequestMapping("/hello")
    public String hello() {
        return "Hello";
    }

    @RequestMapping("numere")
    public String numere() {
        return "<h1>1</h1>" + "<h2>2</h2>" + "<h3>3</h3>";
    }

    @RequestMapping("timpul")
    public String time() {
        return "<h1>" + new Date() + "</h1>";
    }
}

