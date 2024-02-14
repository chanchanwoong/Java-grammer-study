package com.javastudy.chapter6;

import java.util.Arrays;

public class OOP04 {
    /**
     * 객체배열
     *  많은 수의 객체를 생성할 때, 배열을 이용한다.
     *  배열 생성 후에는 객체를 저장해야 한다.
     */
    public static void main(String args[]){
        // 참조변수를 배열로 생성
        Tv[] tvArr = new Tv[3];

        // 객체로 저장
        tvArr[0] = new Tv();
        tvArr[1] = new Tv();
        tvArr[2] = new Tv();

        System.out.println(Arrays.deepToString(tvArr));
    }
}

// 동일 패키지 내 OOP03.java에 Tv 클래스가 있어서 이름을 바꿔줘야 한다.
class Tv2 {
    String color;       // 색
    boolean power;      // 전원상태
    int channel;        // 채널

    void power() {
        power = !power;
    }

    void channelUp() {
        channel++;
    }

    void channelDown() {
        channel--;
    }
}