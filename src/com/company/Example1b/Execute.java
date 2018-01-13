package com.company.Example1b;

public class Execute {
    public static void main(String[] args) {
        Dog maltese= new Dog();
        maltese.breed="maltese";
        maltese.size="small";
        maltese.age=2;
        maltese.colour="white";
        System.out.println(maltese.getInfo());
    }
}
