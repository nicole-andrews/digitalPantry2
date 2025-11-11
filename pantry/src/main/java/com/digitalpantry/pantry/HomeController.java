package com.digitalpantry.pantry;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// Web controller for reciving web traffic!
@Controller
public class HomeController {
    @RequestMapping("/") // root traffic
    public String index() {
        return "index.html";
    }
    
}
