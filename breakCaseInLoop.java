package com.basicsinjava;

import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            System.out.println(i);
            System.out.println("Java is Interesting for me!");
            if(i==3){
                System.out.println("End the Code!");
                break;
            }
        }
    }
}
