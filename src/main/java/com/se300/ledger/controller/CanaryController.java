package com.se300.ledger.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
public class CanaryController {
    @GetMapping("/html")
    // This ensures the method is only accessible via GET requests, which are generally safer for serving HTML content.
    public String sayHello(Model model) {
        model.addAttribute("date", new Date());
        return "example";
    }
}
