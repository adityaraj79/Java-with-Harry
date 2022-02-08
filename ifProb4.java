package com.basicsinjava;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%4==0){
            System.out.println("Its a leap year.");
        }else{
            System.out.println("It is not a leap year.");
        }
    }
}
