package com.programing.service;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class SingerServiceImpl implements SingerService {

    @Override
    public String doSomething(String anything) {
        return "I see you stranger" + anything;
    }

}
