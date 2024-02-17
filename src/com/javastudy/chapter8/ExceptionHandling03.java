package com.javastudy.chapter8;

public class ExceptionHandling03 {
    /**
     * 예외 처리하기
     *  프로그램 실행 시 발생할 수 있는 예기치 못한 예외 발생에 대비한 코드로 비정상 종료를 막고,
     *      정상적인 실행상태를 유지한다.
     *
     *  try-catch문을 사용하여 예외를 처리한다.
     *  try 블럭 내에서 예외가 발생한 경우
     *      1. 발생한 예외와 일치하는 catch블럭이 있는지 확인한다.
     *      2. 일치하는 catch블럭을 찾게 되면, 그 catch블럭 내의 문장들을 수행하고 try-catch문을 빠져나간다.
     *      3. 다음 문장을 계속해서 진행한다.
     *
     *  모든 예외 클래스는 Exception클래스의 자손 클래스이므로, catch문에 Exception두면 모든 예외가 처리된다.
     *      그러나, Exception 클래스 뒤에 catch 예외클래스가 오게 되면 절대 도달하지 못해 에러가 발생한다.
     */
    public static void main(String args[]){
        System.out.println("try 전");
        try {
            System.out.println(0/0);    // 에러 발생으로 바로 catch문으로 간다.
            System.out.println("에러 밑 코드");      // 실행안됨
        }
        catch (ArithmeticException ae){
            System.out.println("ArithmeticException 클래스 도달");
        }
        catch (Exception e){
            System.out.println("Exception 클래스 도달");
        }
        // Exception 'java.lang.ArithmeticException' has already been caught 에러 발생
//        catch (ArithmeticException ae){
//            System.out.println("ArithmeticException 클래스 도달");
//        }
        System.out.println("try-catch문 탈출함");
    }
}
