package com.javastudy.chapter8;

public class ExceptionHandling02 {
    /**
     * 예외 클래스 계층구조
     *  Object
     *  |
     *  Throwable
     *  |              |
     *  Exception      Error (코드로 해결이 안됨)
     *  |
     *  RuntimeException
     *
     *  Exception : 사용자 실수로 외적인 요인에 발생(입력 관련)
     *  RuntimeException : 프로그래머의 실수로 발생하는 예외
     *
     *  RuntimeException 종류
     *      ArithmeticExcetion : 어떤 수를 0으로 나눌 때 발생
     *      NullPointerException : 널 객체를 참조한 경우 발생
     *      ClassCastException : 적절치 못하게 클래스를 형변환 경우 발생
     *      NegativeArraySizeException : 배열 크기가 음수인 경우 발생
     *      OutOfMemoryException : 사용 가능한 메모리 없는 경우 발생
     *      NoClassDefFoundException : 원하는 클래스를 찾지 못한 경우 발생
     *      ArrayIndexOutOfBoundsException : 배열 참조하는 인덱스가 잘못된 경우 발생
     */
}
