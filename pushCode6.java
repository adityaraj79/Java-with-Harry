package com.basicsinjava;

import java.util.*;

public class GithubPush {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type your name here!");
        String name = sc.nextLine();
        for(int c=0; c<10; c++){
            System.out.println(name);
        }
        System.out.println("Thanks for using this Code..");
    }
}