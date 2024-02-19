package org.ysquare;

import org.springframework.stereotype.Component;

@Component("BMW")
public class Car implements Vehicle{
    public Car() {
        System.out.println("Car object created....");
    }
    @Override
    public void drive() {
        System.out.println("Car Driving");
    }
}
