package com.javastudy.chapter3;

public class Operator03 {
    public static void main(String args[]){
        /**
         * 증감 연산자
         *  증가연산자(++), 감소연산자(--) 두 가지가 있다.
         *
         *  전위형(++i), 후위형(i++) 존재
         */

        int i = 5, j = 5;
        System.out.println("i++ 의 값 " + i++);
        System.out.println("i 값 표출 후 증감과 같다.");

        System.out.println("++j의 값 " + ++j);
        System.out.println("j 값 더하고 표출과 같다.");
    }
}
