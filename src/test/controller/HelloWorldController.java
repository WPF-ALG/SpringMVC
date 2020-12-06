package test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mvc")
public class HelloWorldController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello11";
    }

}
