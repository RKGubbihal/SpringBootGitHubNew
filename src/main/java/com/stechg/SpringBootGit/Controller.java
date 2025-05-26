package com.stechg.SpringBootGit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller
{
    @GetMapping("/hello")
    public String getData()
    {
        return "Message_'SpringBootGit' Spring Boot Application_IntelliJ IDE.....";
    }
}
