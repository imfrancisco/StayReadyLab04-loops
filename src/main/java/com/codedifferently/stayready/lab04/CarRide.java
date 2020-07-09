package com.codedifferently.stayready.lab04;


import java.util.Scanner;

public class CarRide{

    public static Boolean areWeThereYet(){
//        Scanner in = new Scanner(System.in);
//        System.out.println("Are we there yet?");
//        boolean answer = in.nextBoolean();

        Boolean answer = true;
            if (answer.equals("No")) {
                System.out.println("No, not yet!");
                return false;
            }
            System.out.println("Good!");
            return true;
    }


    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Are we there yet?");
        //boolean input = in.nextLine();
        boolean input = in.nextBoolean();
        System.out.println(input);
        areWeThereYet();
//        if (input.equals(false)) {
//            System.out.println("Are we there yet?");
//            input = in.nextBoolean();
//        } else {
//
//        }
    }
}
