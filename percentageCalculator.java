package com.basicsinjava;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Taking the Marks");
        System.out.println("Subject1");
        int m1 = sc.nextInt();
        System.out.println("Subject2");
        int m2 = sc.nextInt();
        System.out.println("Subject3");
        int m3 = sc.nextInt();
        System.out.println("Subject4");
        int m4 = sc.nextInt();
        System.out.println("Subject5");
        int m5 = sc.nextInt();

        float per = (m1+m2+m3+m4+m5)/5f;
        System.out.println("Your percentage is :"+ per );
                
    }
}
