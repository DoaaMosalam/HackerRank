package com.company.Animals;

import com.company.Animals.Animal;

public class Bird extends Animal {
    void fly() {
        System.out.println("I am flying");
    }
    void sing(){
        System.out.println("I am singing");
    }

    public static void main(String[] args) {
        Bird bird = new Bird();
//        bird.walk();
//        bird.fly();
//        bird.sing();
    }
}
