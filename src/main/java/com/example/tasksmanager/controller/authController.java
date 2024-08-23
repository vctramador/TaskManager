package com.example.tasksmanager.controller;

import com.example.tasksmanager.domain.User;
import com.example.tasksmanager.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello-world")
public class authController {
    @Autowired
    private Service service;

    public authController(Service service) {
        this.service = service;
    }

    @GetMapping
    public String auth() {
        return service.helloWorld(" Victor");
    }

    @PostMapping("/{id}")
    public String post(@PathVariable("id") String id, @RequestParam(value="filter", defaultValue = "nenhum") String filter, @RequestBody User body) { // anotação para parametros, está recebendo o name de user
        return "Hello! " + body.getName() + filter;
    }


}
