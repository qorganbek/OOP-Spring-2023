package com.example.generics;

public class Print <P>{
    P[] array;

    public Print(P[] array){
        this.array = array;
    }


    public void printArray(){
        for(P i: array){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Character[] array = {'D', 'I', 'M', 'A'};
        Print<Character> p = new Print(array);
        p.printArray();
    }

}
