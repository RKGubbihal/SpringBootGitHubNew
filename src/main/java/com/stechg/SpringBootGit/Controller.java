package com.stechg.SpringBootGit;

import org.springframework.web.bind.annotation.*;

@RestController
public class Controller
{
    @GetMapping("/hello")
    public String getData()
    {
        return "Message_'SpringBootGit' Spring Boot Application_IntelliJ IDE.....";
    }

    @GetMapping("/gethello")
    public String getHello()
    {
        System.out.println("Displaying  Message from the 'GetMapping' Method ");
        return "<h1> 'GetMapping' Method: Message </h1>";
    }

    @PostMapping("/posthello")
    public String postHello()
    {
        System.out.println("Posting Message from the 'PostMapping' Method ");
        return "<h1> 'PostMapping' Method: Message </h1>";
    }

    @PutMapping("/puthello")
    public String putHello()
    {
        System.out.println("Putting Message from the 'PutMapping' Method ");
        return "<h1> 'PutMapping' Method: Message </h1>";
    }

    @DeleteMapping("/deletehello")
    public String deleteHello()
    {
        System.out.println("Deleting Message from the 'DeleteMapping' Method ");
        return "<h1> 'DeleteMapping' Method: Message </h1>";
    }

}
