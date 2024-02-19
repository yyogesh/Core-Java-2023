package com.ysquare.SpringServiceRepository.model;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer{

    @Override
    public void compile() {
        System.out.println("compiling on Laptop");
    }
}
