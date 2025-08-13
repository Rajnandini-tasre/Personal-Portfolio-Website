package com.example.Portfolio;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class ContactController {

	    @PostMapping("/send-message")
	    public String sendMessage(@RequestParam String name,
	                               @RequestParam String email,
	                               @RequestParam String message) {
	        System.out.println("Name: " + name);
	        System.out.println("Email: " + email);
	        System.out.println("Message: " + message);
	        return "redirect:/thank-you"; 
	    }
	}



