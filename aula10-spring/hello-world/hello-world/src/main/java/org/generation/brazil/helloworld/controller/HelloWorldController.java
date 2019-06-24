package org.generation.brazil.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HelloWorldController {


    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("title", "Hello World será que vai?");
        return "index";
    }

}
