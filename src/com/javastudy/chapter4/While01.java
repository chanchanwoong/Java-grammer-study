package com.javastudy.chapter4;

public class While01 {
    public static void main(String args[]){
        /**
         * while문
         *  초기화나 증감식이 필요하지 않은 경우라면 while문이 더 적합하다.
         *
         *  while (조건식){
         *      조건식의 연산결과가 참인 동안, 반복될 문장들
         *  }
         */

        int i = 5;
        while(i--!=0){
            System.out.println(i + " - Java");
        }
    }
}
