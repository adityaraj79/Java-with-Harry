package com.basicsinjava;

import java.util.*;

import javax.lang.model.element.Element;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float [] marks = {23, 34, 45, 48, 41};
        float sum=0;
        for(float element:marks){
            sum = sum + element;
            
        }
        float avg = sum/5;
        System.out.println("The average value is:"+ avg);
    }
}
