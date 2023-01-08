package edu.neu.microservices.limitsservice.controller;

import edu.neu.microservices.limitsservice.bean.Limits;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {
    @GetMapping("/limits")
    public Limits retrieLimits() {
        return new Limits(1, 1000);
    }
}
