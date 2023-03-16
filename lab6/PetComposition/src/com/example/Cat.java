package com.example;

public class Cat extends Animal implements Pet {
    private Ambulatory ambulatory;
//    private String name;
    private Nameable nameable_current = new NameableImpl();

    private String name = getName();

    public Cat() {
        this("Fluffy");
    }
    
    public Cat(String name) {
        super(4);
        ambulatory = new AmbulatoryImpl(4);
        setName(name);
    }

    @Override
    public void eat() {
        System.out.println("Cats like to eat spiders and fish.");
    }

//    @Override
//    public String getName() {
//        return name;
//    }
//
//    @Override
//    public void setName(String name) {
//        this.name = name;
//    }

    @Override
    public void play() {
        System.out.println(getName() + " likes to play with string.");
    }

    @Override
    public void setName(String name) {
        nameable_current.setName(name);
    }

    @Override
    public String getName() {
        return nameable_current.getName();
    }


    @Override
    public void walk() {
        ambulatory.walk();
    }
}