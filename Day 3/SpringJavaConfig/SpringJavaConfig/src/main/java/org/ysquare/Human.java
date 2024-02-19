package org.ysquare;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Human {
    @Value("30")
    private int age;
//    @Autowired
//   // @Qualifier("car")
//    @Qualifier("BMW")
    private Vehicle vehicle;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
    @Autowired
// @Qualifier("car")
// @Qualifier("BMW")
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Human() {
        System.out.println("Human object created....");
    }


    public void travel() {
        vehicle.drive();
        System.out.println("Travel by vehicle");
    }
}
