package com.javastudy.chapter5;

import java.util.Arrays;

public class Array04 {
    public static void main(String args[]) {
        /**
         * 2차원 배열
         *  타입[][] 변수이름 = new 타입[행][열];
         *  int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}}; 로 바로 초기화 가능
         *
         *  만일 타입[][] 변수이름 = new 타입[행][열]; 로 선언하면
         *      행과 열을 딱 맞춰줘야 한다.
         *  그러나, int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}}; 로 선언하면
         *      행과 열에 크기에 국한되지 않는다. 요소에 개수가 차이나도 무관
         */

        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9,10}
        };

        System.out.println(Arrays.deepToString(arr));
    }
}
