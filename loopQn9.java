package com.basicsinjava;

import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int table=1;
        int ans=0;
        for(int i=1; i<=10; i++){
            table=n*i;
            ans=ans+table;
        }
        System.out.println(ans);

    }
}
