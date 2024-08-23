package com.example.tasksmanager.service;
//classes com as regras de negócios


@org.springframework.stereotype.Service //indica que é uma classe de serviços
public class Service {
    public String helloWorld(String name) {
        return "Hello " + name;
    }


}
