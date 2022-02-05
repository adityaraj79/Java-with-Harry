package com.basicsinjava;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String letter = "Dear <|Name|>, thanks a lot.";
        System.out.println(letter.replace("<|Name|>","Aditya")); 
    }
}
