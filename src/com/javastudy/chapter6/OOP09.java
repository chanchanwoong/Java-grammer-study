package com.javastudy.chapter6;

public class OOP09 {
    /**
     * 오버로딩(overloading)
     *  한 클래스 내에 같은 이름의 메서드를 여러 개 정의하는 것을 의미
     *
     *  조건
     *  1. 메서드 이름이 다른 메서드 이름과 동일해야 한다. (동일한 이름의 다른 메서드를 정의하는 거니깐,,)
     *  2. 매개변수의 개수 또는 타입이 달라야 한다.
     *  3. 반환 타입은 관계없다.
     *
     *  예시
     *  int add(int a, int b) {return a+b;}
     *  int add(long x, int y) {return (int)x+y;}
     *      메서드 명 일치하고 매개변수의 타입이 달라서 오버로딩이라고 할 수 있다.
     */
       int add(int a, int b) {return a+b;}
       int add(long x, int y) {return (int)x+y;}
}
