package com.example.ThymleafPage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @GetMapping("/hello")
    public String home(Model model){
        model.addAttribute("message","Hello world");
        return "helloworld";
    }

    @GetMapping("/style")
    public String style(Model model){
        model.addAttribute("message","Hello world");
        return "css_js_demo";
    }


    @GetMapping("/bootstrap")
    public String bootstrap(Model model){
        model.addAttribute("message","Hello world");
        return "bootstrap";
    }


    @GetMapping("/opertun")
    public String opertun(Model model){
        model.addAttribute("message","Hello world");
        return "opertun";
    }


}
