package com.javastudy.chapter3;

public class Operator01 {
    public static void main(String args[]) {
        /**
         * 연산자의 우선순위
         *  1. () 괄호 연산자
         *  2. ++, -- 증감연산자, +, - 부호, ~ 비트, ! 논리
         *  3. 산술연산자
         *  4. 쉬프트 연산자
         *  5. 비교 연산자
         *  6. 논리 연산자
         *  7. 삼항 연산자
         *  8. 대입 연산자
         */

        int x = 5;
        int y = 10;

        System.out.print("x+3 > y-2 의 결과 ");
        System.out.println(x+3 > y-2);      // false

        System.out.print("x>3 && x<5 의 결과 ");
        System.out.println(x>3 && x<5);     // false
    }
}
