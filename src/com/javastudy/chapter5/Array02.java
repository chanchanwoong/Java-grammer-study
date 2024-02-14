package com.javastudy.chapter5;

import java.util.Arrays;

public class Array02 {
    public static void main(String args[]) {
        /**
         * 배열의 인덱스
         *  배열의 저장 공간을 배열의 요소라고 한다.
         *  배열이름[인덱스]의 형식으로 배열 요소에 접근 가능
         *  인덱스의 범위는 0부터 배열길이 - 1 까지
         */

        int[] score = new int[5];

        for (int i = 0; i <= 4; i++) {
            score[i] = i * 10;
        }

        System.out.println("배열의 길이 : " + score.length);
        System.out.println(Arrays.toString(score));
    }
}
