package com.company;

public class WestWolf extends Animals{
    public WestWolf (String name, String color , int age){
        super(name, color, age);
    }

    public void eat() {
        System.out.println("Wolf eat a lot");
    }

    public void hunt (WestWolf change){
        change.life();
    }
}
