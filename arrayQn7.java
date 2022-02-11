package com.basicsinjava;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] marks = {96, 95, 91, 832, 6};
        int min=Integer.MAX_VALUE;
        for(int i=0; i<marks.length; i++){
            if(marks[i]<min){
                min=marks[i];
            }

        }
        System.out.println("The minimum value of element this array is: "+min);
    }
}
