package com.basicsinjava;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String website = sc.nextLine();

        if(website.endsWith(".org")){
            System.out.println("It is an organisational website.");
        }else if(website.endsWith(".com")){
            System.out.println("It is a commercial website.");

        }else if(website.endsWith(".in")){
            System.out.println("It is an Indian website.");
        }
    }
}
