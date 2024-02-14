package com.javastudy.chapter3;

public class Operator04 {
    public static void main(String args[]){
        /**
         * 문자열 비교
         *  문자열 비교에는 비교 연산자 == 를 사용하지 않고 equals() 메서드 사용
         *  비교 연산자 사용 시, 내용이 같아도 다른 객체면 false를 반환하기 때문
         */

        String str = new String("abc");
        String str1 = "abc";

        System.out.println(str == str1);        // 내용은 같아도 다른 객체라 false 반환
        System.out.println(str == "abc");       // 상동
        System.out.println(str1 == "abc");      // ture

        System.out.println(str.equals(str1));       // true
        System.out.println(str.equals("abc"));      // true
        System.out.println(str1.equals("abc"));     // true
    }
}
