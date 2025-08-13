package com.example.Portfolio;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/resume")
    public String resume() {
        return "resume";
    }

    @GetMapping("/projects")
    public String projects() {
        return "project";
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }

}
