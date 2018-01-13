package com.company.Example1a;

//Class declaration
public class Dog {
    //instance variable
    String breed;
    String size;
    int age;
    String colour;

    //method
    public String getInfo(){
        return ("Breed is: "+breed+"Size is: "+size+"Age is: "+age+"Color is: "+colour);
    }

    public static void main(String[] args){
        Dog maltese=new Dog();
        maltese.breed="maltese";
        maltese.size="small";
        maltese.age=2;
        maltese.colour="black";
        System.out.println(maltese.getInfo());
    }
}
