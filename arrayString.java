package com.basicsinjava;

import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Types of forming an array...
        // 1) int [] marks = new int[5];
        // 2) int [] marks;
        //    marks = new int[5];
        // 3) int [] marks = {96,95,90,81,63};

        String [] name = {"Aditya", "Harry", "Aman", "Shekhar", "Ayan"};
        System.out.println(name.length);
        for(int i=0; i<name.length; i++){
            System.out.println(name[i]);
        }

    }
}
