package com.basicsinjava;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float S1 = sc.nextFloat();
        int S2 = sc.nextInt();
        int S3 = sc.nextInt();
        float per = (S1+S2+S3)/3;

        if(S1>=33&& S2>=33 && S3>=33 && per>=40){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }
    }
}
