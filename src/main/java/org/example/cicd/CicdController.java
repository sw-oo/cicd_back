package org.example.cicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/cicd")
@RestController
public class CicdController {
    @GetMapping("/cicd")
    public String test() {
        return "v7";
    }
}
