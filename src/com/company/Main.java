package com.company;
//import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<Animal>();
        Scanner keyboard = new Scanner(System.in);

        String answer = "y";

        //add a book
        while(answer.equalsIgnoreCase("y")){
            System.out.println("Do you want to enter an animal? ");
            answer = keyboard.nextLine();

            if(answer.equalsIgnoreCase("y")){
                Animal animal = new Animal();
                System.out.print("enter number of leg: ");
                animal.setLeg(keyboard.nextInt());
                System.out.print("Enter number of horn: ");
                animal.setHorn(keyboard.nextInt());
                animals.add(animal);


            }
//            System.out.println("Do you want to enter a book? ");
//            answer = keyboard.nextLine();
        }

//        System.out.println("Do you want to enter an animal? ");
//        answer = keyboard.nextLine();

        //print all the books in the array list

        System.out.println("All animals body: ");

        //enhanced for loops
        for(Animal animal: animals){
            System.out.print(animal.getLeg());
            System.out.println(" ");
            System.out.print(animal.getHorn());
            System.out.println();
        }
    }
}
