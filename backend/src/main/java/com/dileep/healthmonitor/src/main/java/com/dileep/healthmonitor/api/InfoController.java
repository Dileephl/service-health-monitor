package com.dileep.healthmonitor.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {

    private final String version;

    public InfoController(@Value("${app.version:local}") String version) {
        this.version = version;
    }

    @GetMapping("/api/info")
    public AppInfo info() {
        return new AppInfo("service-health-monitor", version);
    }

    public record AppInfo(String name, String version) {}
}
