package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/web")
public class WebDemoController {

    @GetMapping("/greeting")
    public String getGreeting(Model model) {
        model.addAttribute("message", "Hello, World!");
        return "greeting"; // "greeting"はビュー名で、通常はgreeting.htmlまたはgreeting.jspなどのファイル
    }
}
