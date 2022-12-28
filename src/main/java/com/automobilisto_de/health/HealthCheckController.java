package com.automobilisto_de.health;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(("health"))
@AllArgsConstructor
public class HealthCheckController {

    private final HealthCheckService healthCheckService;

    @GetMapping(value = "/status")
    public String checkStatus () {
        return healthCheckService.getStatus();
    }
}
