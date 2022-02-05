package com.basicsinjava;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int v = sc.nextInt();
        int u = sc.nextInt();
        int x = sc.nextInt();

        int a = (v*v-u*u)/(2*s*x);
        System.out.println(a);
    }
}
