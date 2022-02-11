package com.basicsinjava;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] a = new int[2][3];
        a[0][0] = 1;
        a[0][1] = 2;
        a[0][2] = 3;
        a[1][0] = 4;        
        a[1][1] = 5;        
        a[1][2] = 6;

        int [][] b = new int[2][3];
        b[0][0]=7;
        b[0][1]=8;
        b[0][2]=9;
        b[1][0]=10;
        b[1][1]=11;
        b[1][2]=12;

        int [][] c = new int[2][3];
        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                c[i][j] =a[i][j]+b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
