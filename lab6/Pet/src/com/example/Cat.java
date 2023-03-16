package com.example;

public class Cat extends Animal implements Pet {
    private String name;

    public Cat(String name) {
        super(4);
        this.name = name;
    }

    public Cat(){
        this("Fluffy");
    }

    @Override
    public void eat() {
        System.out.println("Cats like to eat spiders and fish");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String newName) {
        name = newName;
    }

    @Override
    public void play() {
        System.out.println(name + " likes to play with string.");
    }

}
