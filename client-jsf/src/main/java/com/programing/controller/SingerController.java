package com.programing.controller;

import com.programing.service.SingerService;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named
@ViewScoped
public class SingerController {

    private String name = "krypton";

    @Inject
    private SingerService singerService;

    public String greating() {
        return singerService.doSomething("dev");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
