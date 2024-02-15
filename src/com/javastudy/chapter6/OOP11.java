package com.javastudy.chapter6;

public class OOP11 {
    /**
     * this
     *  생성자 간에도 서로 호출이 가능하다.
     *  여러 가지 생성자가 있을텐데 어떻게 특정 생성자를 찾아갈까?
     *      this(매개변수1, 매개변수2,,) 처럼 매개변수 종류들로 생성자를 특정한다.
     *
     *  조건
     *  1. 생성자의 이름으로 클래스이름 대신 this를 사용한다.
     *  2. 한 생성자에서 다른 생성자를 호출할 때는 반드시 첫 줄에서만 호출이 가능하다.
     */

    public static void main(String[] args){
        Car c1 = new Car();
        Car c2 = new Car("blue");

        System.out.println("c1의 색은 " + c1.color + ", 기어는 " + c1.gearType + ", 문의 수는 " + c1.door + "개 입니다.");
        System.out.println("c2의 색은 " + c2.color + ", 기어는 " + c2.gearType + ", 문의 수는 " + c2.door + "개 입니다.");
    }
}

class Car{
    String color;
    String gearType;
    int door;

    // 생성자1
    Car(){
        this("white", "auto", 4);
    }
    // 생성자2
    Car(String color){
        this(color, "auto", 4);
    }
    // 생성자3
    Car(String color, String gearType, int door){
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
    // 생성자4, 같은 타입이며 어떻게 될까?
    // 아래는 같은 타입으로 이루어진 생성자가 있어서 안됨.
    // 오버로딩 조건 부적합
//    Car(String gearType){
//        this("white", gearType, 4);
//    }
}
