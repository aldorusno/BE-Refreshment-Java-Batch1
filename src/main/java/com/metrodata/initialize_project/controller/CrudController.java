package com.metrodata.initialize_project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/welcome")
public class CrudController {

    @GetMapping
    public String welcome() {
        return "Hello World";
    }
}
