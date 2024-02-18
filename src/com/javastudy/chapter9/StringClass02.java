package com.javastudy.chapter9;

public class StringClass02 {
    /**
     * 문자열 비교
     *  문자열 생성에는 리터럴 지정 방식과 String 클래스의 생성자 이용 방식이 있다.
     *
     *  리터럴 방식은 이미 존재하는 메모리 주소를 사용하는 것
     *  생성자 방식은 메모리 할당을 하여 새로운 인스턴스를 만드는 것
     */
    public static void main(String args[]){
        String str1 = "abc";
        String str2 = "abc";
        System.out.println("String str1 = \"abc\";");       // \"는 "abc"의 "를 표현하기 위해서 사용
        System.out.println("String str2 = \"abc\";");

        System.out.println("str1 == str2 ? " + (str1 == str2));     // 리터럴 방식이라 주소값이 같음
        System.out.println("str1.equals(str2) ? " + str1.equals(str2));
        System.out.println();

        String str3 = new String("abc");
        String str4 = new String("abc");

        System.out.println("String str3 = \"abc\";");       // \"는 "abc"의 "를 표현하기 위해서 사용
        System.out.println("String str4 = \"abc\";");

        System.out.println("str3 == str4 ? " + (str3 == str4));     // 생성자 방식이라 인스턴스 주소값이 다름
        System.out.println("str3.equals(str4) ? " + str3.equals(str4));     // 내용물은 같아서 true
    }
}
