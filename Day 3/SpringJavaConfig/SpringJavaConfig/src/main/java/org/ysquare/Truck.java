package org.ysquare;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
@Scope("prototype")
public class Truck implements Vehicle{
    public Truck(){
        System.out.println("Truck Object created...");
    }
    @Override
    public void drive() {
        System.out.println("Truck driving");
    }
}
