package com.basicsinjava;

import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] flat = new int[2][3];
        flat[0][0]=1;
        flat[0][1]=2;
        flat[0][2]=3;
        flat[1][0]=4;
        flat[1][1]=5;
        flat[1][2]=6;
        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                System.out.print(flat[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
