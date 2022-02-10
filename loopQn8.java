package com.basicsinjava;

import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 1;
        int i=1;
        while(i<=n){
            ans=ans*i;
            i++;
        }
        System.out.println(ans);

    }
}
