package com.example;

public class Fish extends Animal implements Pet {

    private Nameable nameable_current = new NameableImpl();

    private String name = getName();

    public Fish() {
        super(0);
    }

    @Override
    public void eat() {
        System.out.println("Fish eat pond scum.");
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
        System.out.println("Just keep swimming.");
    }

    @Override
    public void setName(String name) {
        nameable_current.setName(name);
    }

    @Override
    public String getName() {
        return nameable_current.getName();
    }
}