package com.company;

public class Animals {
    private String name;
    private String color;
    private double age;
    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    Animals(String n, String c, int a) {
        this.name = n;
        this.color = c;
        this.age= a;
    }
    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public double getAge() {
        return age;
    }
    public void life(){
        this.age = 0;
    }
    public void eat() {
        System.out.println("eat");
    }
}
