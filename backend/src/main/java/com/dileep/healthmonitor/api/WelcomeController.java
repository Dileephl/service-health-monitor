package com.dileep.healthmonitor.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/api/welcome")
    public Welcome welcome() {
        return new Welcome("Service Health Monitor deployed through CI/CD");
    }

    public record Welcome(String message) {}
}
