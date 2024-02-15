package com.javastudy.chapter6;

public class OOP12 {
    /**
     * this
     *  객체 자신을 가리키는 참조변수이다.
     *  생성자에서 인스턴스 변수와 매개변수의 이름이 같은 경우 구별을 위해 사용된다.
     *  this.인스턴스 변수명 = 매개변수명
     *
     * this와 this() 구별
     *  this : 인스턴스 자신을 가리키는 참조변수, 인스턴스 주소가 저장되어 있다.
     *  this() : 생성자, 같은 클래스의 다른 생성자를 호출할 때 사용한다.
     */

    public static void main(String[] args){
        Car2 c = new Car2("white", "auto", 4);
        System.out.println(c.color + " " + c.gearType + " " + c.door);
    }
}

class Car2{
    String color;
    String gearType;
    int door;

    Car2(String colorInput, String gearTypeInput, int doorInput){
        color = colorInput;
        gearType = gearTypeInput;
        door = doorInput;
    }

    // 아래처럼 생성자를 써버리면 인스턴스변수에 접근하지 않고 지역변수로 만들어져서 처리된다.
//    Car2(String color, String gearType, int door){
//        color = color;
//        gearType = gearType;
//        door = door;
//    }
}