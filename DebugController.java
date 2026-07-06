package com.amari.character_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DebugController {

    @GetMapping("/debug")
    public String debug() {
        return "WORKS";
    }
}