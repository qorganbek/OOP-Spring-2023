package com.example;

public class Fish extends Animal implements Pet {

    private String name;

    public Fish(){
        super(0);
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public void setName(String newName){
        name = newName;
    }

    @Override
    public void play(){
        System.out.println("Just keep swimming.");
    }

    @Override
    public void eat(){
        System.out.println("Fish eat pond scum.");
    }

    @Override
    public void walk() {
        super.walk();
        System.out.println("Fish, of course, can't walk; they swim.");
    }

}
