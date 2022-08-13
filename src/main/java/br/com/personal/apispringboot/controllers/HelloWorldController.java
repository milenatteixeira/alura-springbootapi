package br.com.personal.apispringboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/helloWorld")
public class HelloWorldController {

    @ResponseBody
    @GetMapping
    public String helloWorld(){
        return "Hello World!";
    }
}
