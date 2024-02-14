package com.javastudy.chapter4;

public class Continue01 {
    public static void main(String args[]){
        /**
         * continue문
         *  반복문 내에서만 사용된다.
         *  continue문 수행 시, 현재 반복을 끝내고 다음 반복 순서로 진행된다.
         */

        for(int i=0; i<=10; i++){
            if(i%3==0){
                continue;
            }
            System.out.println(i);
        }
    }
}
