package org.mykola.eurrekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")
public class TestController {

//    ( " ${ expression here } " )
    @Value( " ${eureka.instance.instance-id} " )
    private String id;


    @GetMapping("/test")
    public String test(){
        return "testblablabla";
    }

    @GetMapping("/test2")
    public String test2(){
        return "Test 2aaa";
    }
    
    @GetMapping("/port")
    public String port(){
        return "Instance Number is " + id;
    }
}
