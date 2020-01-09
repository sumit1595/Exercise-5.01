package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FragmentController {
    @RequestMapping("/")
    public String about() {
        return "about";
    }

    @RequestMapping("/2")
    public String index() {
        return "index";
    }

    @RequestMapping("/3")
    public String contactus() {
        return "contactus";
    }
}