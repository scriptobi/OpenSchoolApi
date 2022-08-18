package org.scriptobi.openschoolapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/")
public class MasterControlProgram {
    @GetMapping("")
    public String getHome() {
        return "Welcome to Open School Application";
    }
}
