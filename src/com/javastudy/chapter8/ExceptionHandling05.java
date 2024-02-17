package com.javastudy.chapter8;

public class ExceptionHandling05 {
    /**
     * 메서드에 예외 선언
     *  try-catch문이 아닌 예외를 메서드에 선언할 수 있다.
     *  throws를 이용하여 메서드에 예외 선언을 한다.
     *
     *  그러나, 이 행위는 단순 예외를 호출스택에 따라 자기를 호출한 메서드로 돌아갈 때 예외를 넘기는 것 뿐이다.
     *      결국! 정상 종료를 위해 try-catch문이 최소 1개는 필요하다!
     */
    public static void main(String args[]) throws Exception {
        method1();
    }
    static void method1() throws Exception{
        method2();
    }
    static void method2() throws Exception{
        throw new Exception("에러 발생!");
    }
}
