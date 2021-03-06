package com.example.kokogymfinaleproject.web;

import com.example.kokogymfinaleproject.model.KokoGymUserDetails;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(@AuthenticationPrincipal KokoGymUserDetails user) {

        if (user != null) {
            return "home";
        }

        return "index";
    }


}
