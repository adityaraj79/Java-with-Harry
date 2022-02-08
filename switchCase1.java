package com.basicsinjava;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter Your Age...");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        switch(age){
            case 18:System.out.println("You are going to be an Adult!");
            break;
            case 23:System.out.println("You should do a Job!");
            break;
            case 60:System.out.println("You are goimg to be Retired!");
            break;
            default:System.out.println("Enjoy your Life!");
            break;
        }
        System.out.println("Thanks for using my code!");

        
    }
}
