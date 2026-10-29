
package com.skilllab.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {

        // ---- Hero Section ----
        model.addAttribute("name", "Astha Yadav");
        model.addAttribute("title", "Java Backend Developer");
        model.addAttribute("tagline",
                "I build web applications with Java and Spring Boot - "
                + "and I'm looking for my first role as a backend developer.");

        // ---- About Section ----
        model.addAttribute("about",
                "I'm a final-year B.Tech (CSE) student at SHEAT College of "
                + "Engineering, Varanasi. I like building things that actually run, "
                + "and I've spent the last year learning Java and Spring Boot properly.");

        // ---- Contact Details ----
        model.addAttribute("location", "Varanasi, India");
        model.addAttribute("email", "asthayadav2305@gmail.com");
        model.addAttribute("github", "https://github.com/ASTHA021");
        model.addAttribute("linkedin", "https://www.linkedin.com/in/astha-yadav-549b20435");
        model.addAttribute("resumeUrl", "https://drive.google.com/");

        return "index";
    }
}
