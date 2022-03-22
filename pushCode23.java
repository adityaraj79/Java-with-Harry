package com.basicsinjava;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>56){
            System.out.println("Experienced");
        }else if(age>46){
            System.out.println("Semi_experienced");
        }else if(age>36){
            System.out.println("Somewhat_experienced");
        }else{
            System.out.println("Not_much experienced");
        }if(age>5){
            System.out.println("Not a baby");
        }
    }
}
