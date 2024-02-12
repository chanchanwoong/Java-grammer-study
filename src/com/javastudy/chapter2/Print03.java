package com.javastudy.chapter2;

import java.util.*;

public class Print03 {
    public static void main(String args[]){
        /**
         * Scanner : 화면으로부터 입력받기
         */

        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        int num = sc.nextInt();

        System.out.printf("input >> %s%n", input);
        System.out.printf("num >> %d", num);
    }
}
