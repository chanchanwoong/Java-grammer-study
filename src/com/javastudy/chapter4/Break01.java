package com.javastudy.chapter4;

public class Break01 {
    public static void main(String argsp[]) {
        /**
         * break문
         *  반복문 중에서 break를 수행하면 가장 가까운 반복문을 탈출한다.
         */

        int sum = 0;
        int i = 0;

        while (true) {
            if (sum > 100) {
                break;
            }
            ++i;
            sum += i;
        }
        System.out.println("i=" + i);
        System.out.println("sum=" + sum);
    }
}
