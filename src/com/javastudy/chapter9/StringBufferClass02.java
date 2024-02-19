package com.javastudy.chapter9;

public class StringBufferClass02 {
    /**
     * StringBuffer 변경
     *  String 클래스와 달리 StringBuffer는 내용 변경이 가능하다. (buffer로 인함)
     *  내용 추가로 append() 메서드를 사용할 수 있다.
     *      append() 메서드는 내용이 추가된 StringBuffer를 반환해준다.
     *
     *  append() 메서드로 StringBuffer 내용 추가는 알겠는데 수정은 어떻게 하는거지?
     *      추후에, delete(), insert(), capacity() 등의 메서드 사용법을 학습
     *
     *  그럼 StringBuffer의 경우 문자열 일치는 어떻게 확인할까?
     *      StringBuffer 자체로 비교는 안되고, toString() 메서드를 이용해서 문자열로 변환한다.
     *      후에, 문자열을 equals() 메서드 이용해서 StringBuffer 내용물 비교가 가능하다!
     */
    public static void main(String args[]){
        StringBuffer sb1 = new StringBuffer("abc");
        StringBuffer sb2 = new StringBuffer("abc");

        System.out.println(sb1 == sb2);     // false
        System.out.println(sb1.equals(sb2));        // false
        System.out.println(sb1.toString() == sb2.toString());       // flase
        System.out.println(sb1.toString().equals(sb2.toString()));      // true
    }
}
