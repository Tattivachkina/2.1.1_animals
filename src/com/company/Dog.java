package com.company;

public class Dog extends Animals {
   private int weight;
    public Dog (String name, String color , int age, int w){
        super(name, color, age);
        this.weight = w;
    }
    public void eat() {
        System.out.println("Dog eat less than WestWolf");
    }

    public void walk (){
        System.out.println("Dog walk in the morning");
    }
}
