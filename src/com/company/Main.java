package com.company;

public class Main {

    public static void main(String[] args) {
        Animals predator = new Animals("Sam", "mixed", 8);
        WestWolf wolf = new WestWolf("John","grey", 5);
        Dog husky = new Dog ("Logic", "white", 1, 12);
        husky.eat();
    }
}
