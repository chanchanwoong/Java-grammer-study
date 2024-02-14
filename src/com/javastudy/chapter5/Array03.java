package com.javastudy.chapter5;

import java.util.Arrays;

public class Array03 {
    public static void main(String args[]) {
        /**
         * 배열의 초기화
         *  배열을 선언과 동시에 배열 요소에 값을 초기화 할 수 있다.
         *  int[] array = {1,2,3,4,5};
         *  길이는 초기화하는 값의 길이로 자동 할당된다.
         */

        int[] score = new int[5];
        score[0] = 50;
        score[1] = 60;
        score[2] = 70;
        score[3] = 80;
        score[4] = 90;
        System.out.println("score = " + Arrays.toString(score));

        int[] score2 = {50,60,70,80,90};
        System.out.println("score2 = " + Arrays.toString(score2));
    }
}
