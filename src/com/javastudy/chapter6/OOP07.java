package com.javastudy.chapter6;

public class OOP07 {
    /**
     * 메서드_매개변수
     * 매개변수의 타입이 기본형이면 변수 값을 읽기만 하고 원본에 영향을 주지 못한다.
     * 그러나, 참조형 매게변수인 경우 인스턴스의 주소로 연산되기 때문에 원본에도 영향을 끼친다.
     */
    public static void main(String args[]) {
        Data d = new Data();
        d.x = 10;
        System.out.println("main() : x = " + d.x);

        change(d.x);
        System.out.println("After change(d.x)");
        System.out.println("main() : x = " + d.x);      // 기본형 매개변수이기 때문에 원본 값을 영향을 안 받음

        Data2 d2 = new Data2();
        d2.x2 = 10;
        System.out.println("main() : x2 = " + d2.x2);

        change2(d2);
        System.out.println("After change2(d2)");
        System.out.println("main() : x2 = " + d2.x2);   // 참조형 매개변수이기 때문에 원본 값(인스턴스 변수) 변함
    }

    static void change(int x) {
        x = 1000;
        System.out.println("change() : x = " + x);
    }

    static void change2(Data2 d2){
        d2.x2 = 1000;
        System.out.println("change2() : x = " + d2.x2);
    }
}

class Data {
    int x;
}

class Data2{
    int x2;
}