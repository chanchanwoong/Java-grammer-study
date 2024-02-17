package com.javastudy.chapter7;

public class Interface01 {
    /**
     * 인터페이스
     *  추상클래스와 유사하나 추상화 정도가 더 높다.
     *  구현부의 메서드와 멤버변수를 가질 수 없다.
     *
     *  interface 키워드를 이용해서 선언한다.
     *  또한, 접근제어자를 클래스와 같이 public 또는 default만 가능하다.
     *
     *  조건
     *  1. 모든 멤버변수는 public static final 이어야 하며, 생략할 수 있다.
     *  2. 모든 메서드는 public abstract 이어야 하며, 이를 생략할 수 있다.
     */
}

interface PlayingCard {
    public static final int SPADE = 4;      // 멤버변수의 기본 형태이나 아래 멤버변수들처럼 생략 가능하다.
    final int DAIMOND = 3;
    static int HEART = 2;
    int CLOVER = 1;

    public abstract String getCardNumber();     // 메서드의 기본 형태이나 아래 메서드처럼 생략 가능하다.
    String getCardKind();
}
