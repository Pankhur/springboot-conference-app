package com.pluralsight.conference.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

import java.util.*;

@Controller
public class GreetingController {

    @GetMapping("greeting")
    public String greeting(Map<String,Object> model) {

        model.put("message", "bruab");
        return "greeting";
    }
}
