package com.marshad.portfolio;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PortfolioController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("name", "Marshad Ahamed");
        model.addAttribute("bio", "Hi, I’m Marshad Ahamed Majeed, a second-year student at SLIIT (Sri Lanka Institute of Information Technology). I’m passionate about cybersecurity and currently exploring the field while building my foundation in programming—starting with Java as my first skill.\n" +
                "\n" +
                "I enjoy learning new things, especially in tech, and spend my free time playing football or cooking. I’m still early in my journey, but I’m excited to keep growing and take on new challenges in the world of cybersecurity.");
        model.addAttribute("skills", new String[]{"Java"});
        return "index";
    }

    @GetMapping("/projects")
    public String projects(Model model) {
        String[][] projects = {
                {"Simple Calculator", "A basic Java calculator with arithmetic operations.", "https://github.com/marshadmajeedh/Java-Calculator"},
                {"Online course portal", "Java console app to manage courses implemented with OOP concept.", "https://github.com/marshadmajeedh/online-course-portal"},
                // Add more projects as needed
        };
        model.addAttribute("projects", projects);
        return "projects";
    }

}
