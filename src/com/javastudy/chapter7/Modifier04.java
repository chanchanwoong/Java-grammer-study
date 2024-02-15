package com.javastudy.chapter7;

public class Modifier04 {
    /**
     * abstract
     *  미완성이라는 의미를 가진다.
     *  abstract class는 미완성 설계도이다.
     *  메서드의 선언부만 작성하고 실제 수행내용은 구현하지 않은 추상 메서드를 선언하는데 사용된다.
     *
     *  abstract 사용가능 한 곳
     *      클래스, 메서드
     */
    public static void main(String[] args){
        // abstract 클래스는 미완성 설계도이기 때문에 객체를 생성할 수 없다.
//        AbstractTest at = new AbstractTest();
    }
}
abstract class AbstractTest {
    abstract void test();
}
