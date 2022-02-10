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

        int [] marks = new int[5];
        marks[0]=96;
        marks[1]=95;
        marks[2]=90;
        marks[3]=81;
        marks[4]=63;
        System.out.println(marks[3]);

    }
}
