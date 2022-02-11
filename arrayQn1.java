package com.basicsinjava;

import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float [] m = {23.0f, 43.7f, 65, 45, 43.5f};
        float ans = 0.0f;
        for(int i=0; i<m.length; i++){
            ans += m[i];
        }
        System.out.println(ans);
    }
}
