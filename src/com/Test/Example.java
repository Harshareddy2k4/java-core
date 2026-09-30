package com.Test;

class Animal {

   static void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

   static void sound() {
        System.out.println("Dog barks");
    }
}

public class Example {

    public static void main(String[] args) {

        Dog d = new Dog();

        Dog.sound();
    }
}
