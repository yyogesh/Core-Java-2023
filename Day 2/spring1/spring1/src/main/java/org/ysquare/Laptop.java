package org.ysquare;

public class Laptop implements Computer {
//    public  Laptop(){
//        System.out.println("Laptop Object Created");
//    }

    @Override
    public void compile() {
        System.out.println("Laptop Compiling");
    }
}
