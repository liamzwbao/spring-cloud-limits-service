package edu.neu.microservices.limitsservice.controller;

import edu.neu.microservices.limitsservice.bean.Limits;
import edu.neu.microservices.limitsservice.configuration.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {
    private final Configuration configuration;

    public LimitsController(Configuration configuration) {
        this.configuration = configuration;
    }

    @GetMapping("/limits")
    public Limits retrieLimits() {
        return new Limits(configuration.getMinimum(), configuration.getMaximum());
    }
}
