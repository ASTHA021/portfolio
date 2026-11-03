
package com.skilllab.portfolio.controller;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.skilllab.portfolio.model.Skill;

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
                "I'm a final-year BCA student at SHEAT College of "
                + "Engineering, Varanasi. I like building things that actually run, "
                + "and I've spent the last year learning Java and Spring Boot properly.");

        // ---- Contact Details ----
        model.addAttribute("location", "Varanasi, India");
        model.addAttribute("email", "asthayadav2305@gmail.com");
        model.addAttribute("github", "https://github.com/ASTHA021");
        model.addAttribute("linkedin",
                "https://www.linkedin.com/in/astha-yadav-549b20435");
        model.addAttribute("resumeUrl", "https://drive.google.com/");

        // ---- Skills List ----
        List<Skill> skills = new ArrayList<>();

        // Frontend Skills
        skills.add(new Skill("HTML", "Frontend"));
        skills.add(new Skill("CSS", "Frontend"));
        skills.add(new Skill("JavaScript", "Frontend"));
        skills.add(new Skill("Thymeleaf", "Frontend"));

        // Backend Skills
        skills.add(new Skill("Java", "Backend"));
        skills.add(new Skill("Spring Boot", "Backend"));
        skills.add(new Skill("Spring MVC", "Backend"));

        // Tools
        skills.add(new Skill("Git & GitHub", "Tools"));
        skills.add(new Skill("IntelliJ IDEA", "Tools"));
        skills.add(new Skill("Maven", "Tools"));
        skills.add(new Skill("Postman", "Tools"));

        // ---- Group Skills by Category ----
        Map<String, List<Skill>> skillsByCategory =
                new LinkedHashMap<>();

        for (Skill skill : skills) {

            skillsByCategory.putIfAbsent(
                    skill.getCategory(),
                    new ArrayList<>());

            skillsByCategory.get(skill.getCategory()).add(skill);
        }

        // ---- Send Skills to HTML ----
        model.addAttribute("skillsByCategory", skillsByCategory);

        // ---- Open index.html ----
        return "index";
    }
}
