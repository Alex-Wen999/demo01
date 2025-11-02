package com.code.springbootdemo01;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: hello
 * @Author:
 * @date: 2025.10.20
 */

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello spring!";
    }
}
