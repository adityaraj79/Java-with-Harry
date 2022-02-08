package com.basicsinjava;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter button no...");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        switch(n){
            case 1:System.out.println("Hello!");
            break;
            case 2:System.out.println("Namaste!");
            break;
            case 3:System.out.println("Bonjour!");
            break;
            default:System.out.println("Invalid key!");
            break;
        }
        System.out.println("Thanks for using my code!");

        
    }
}
