package com.basicsinjava;

import java.util.*;


public class Main {

    public static void main(String[] args) {
        System.out.println("Enter the nth Number.");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        do {
            System.out.println(i);
            i++;
            
        } while (i<=n);
        // this loop first print the statement and then check the condition.
    }
}
