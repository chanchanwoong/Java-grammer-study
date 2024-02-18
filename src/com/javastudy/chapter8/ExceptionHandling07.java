package com.javastudy.chapter8;

public class ExceptionHandling07 {
    /**
     * finally 블럭
     *  예외와 상관없이 실행되야 할 코드를 지정하는 부분이다.
     *  선택적으로 사용가능하며, try-catch-finally 순서로 구성된다.
     *
     *  try 또는 catch 블럭 안에 return문이 있어 try 블럭이 끝나도 finally 블럭은 실행된다.
     *
     *  try-catch 구문만 사용해도 블럭을 밑의 코드가 실행되는데 finally 구문을 써야 할까?
     *      이는, 예외 발생 여부와 관게없이 특정 코드를 반드시 실행하고 싶을 때 사용한다.
     *      예를 들어서 DB 연결이나 파일 입출력 수행 후 자원을 반드시 해제해야 한다.
     *          이러한 작업에선 finally 코드가 가장 적합하다.
     *          자원 정리 또는 해제에 필수 코드가 된다.
     */
}
