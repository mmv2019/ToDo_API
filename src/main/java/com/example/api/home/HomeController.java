package com.example.api.home;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping(value="/")
    public  String greeting(){
        return "Hello ";
    }

    @GetMapping(value="/{name}")
    public  String greetingWithname(@PathVariable String name){
        return String.format("Welcome %s to our spring boot",name);
    }
}
