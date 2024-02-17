package org.ysquare;

import java.beans.ConstructorProperties;

public class Developer {
    private Computer computer;
    private int age;
    public  Developer() {
      //  System.out.println("Object Created");
    }

//    @ConstructorProperties({"age", "laptop"})
//    public Developer(int age, Laptop laptop) {
//        this.laptop = laptop;
//        this.age = age;
//    }


    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void code() {
        System.out.println("Coding");
        computer.compile();
    }
}
