package com.springboot.camel.rest.springboot_camel_rest_base;

import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Service("helloBean")
public class HelloController {

//    @GetMapping(value="/sayhello/greeting/{msg}")
//    public String greetingWorld(@PathVariable("msg")String msg){
//        return "Hello" + msg;
//    }

    public String greetingWorld(String msg){
        return "Hello " + msg;
    }
}
