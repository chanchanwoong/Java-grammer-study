package com.javastudy.chapter8;

public class ExceptionHandling04 {
    /**
     * 예외 발생
     *  1. 연산자 new를 이용해서 발생시키려는 예외 클래스의 객체를 생성
     *  2. throw 키워드를 이용해 예외를 발생
     *
     *  Exception 생성자에 String을 넣으면 에러 관련 메시지를 넣을 수 있다.
     */
    public static void main(String args[]){
        try {
            Exception e = new Exception("에러 발생!!");
            throw e;
        }
        catch (Exception e){
            System.out.println("Exception 클래스 도달");
            System.out.println("에러 메시지 : " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램 정상 종료");
    }
}
