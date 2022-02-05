package com.basicsinjava;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "Aditya";
        int value = str.length();
        System.out.println(value);

        String lcase = str.toLowerCase();
        System.out.println(lcase);

        String ucase = str.toUpperCase();
        System.out.println(ucase);

        String name = "    Aditya    ";
        System.out.println(name.trim());
           // Output : Aditya
        
        System.out.println(str.substring(1));
        // output: ditya
        System.out.println(str.substring(1,5));
        //output: dity

        System.out.println(str.replace('d','m'));
        //output: Amitya
        System.out.println(str.replace("dit","min"));
        //output: Aminya

        System.out.println(str.startsWith("Adi"));
        //output: true
        System.out.println(str.startsWith("sde"));
        //output: false

        System.out.println(str.endsWith("da"));
        //output: false
        System.out.println(str.endsWith("ya"));
        //output: true

        System.out.println(str.charAt(1));
        //output: d

        System.out.println(str.equals("Aditya"));
        //output: true
        System.out.println(str.equals("djsfkj"));
        //output: false

        System.out.println(str.equalsIgnoreCase("aDitya"));
        //output: true
        



    }
}
