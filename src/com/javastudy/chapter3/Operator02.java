package com.javastudy.chapter3;

public class Operator02 {
    public static void main(String args[]){
        /**
         * 연산자의 결합 규칙
         *  산술 > 비교 > 논리 > 대입 순으로 진행된다.
         *  
         *  단항연산자, 대입연산자의 경우 오른쪽부터 결합 순서를 가짐
         *  나머지는 왼쪽에서 오른쪽으로 결합 순서를 가짐
         */

        int x, y;
        x = y = 3;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
