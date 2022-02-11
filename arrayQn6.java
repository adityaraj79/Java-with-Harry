package com.basicsinjava;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] marks = {96, 95, 91, 832, 61};
        int max=0;
        for(int i=0; i<marks.length; i++){
            if(marks[i]>max){
                max=marks[i];
            }

        }
        System.out.println(max);
    }
}
