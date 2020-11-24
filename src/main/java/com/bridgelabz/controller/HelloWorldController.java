package com.bridgelabz.controller;

import com.bridgelabz.pojo.Student;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWorldController {
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/hello")
    @ResponseBody
    public Student sayHello(@RequestParam(name="name", required=false, defaultValue="Stranger") String name) {
        return new Student(name,"CG");
    }
    @PostMapping("/batch")
    @ResponseBody
    public Student newBatch(@RequestParam(name="name", required=false, defaultValue="Stranger") String name) {
        return new Student(name,"TCS");
    }

}
