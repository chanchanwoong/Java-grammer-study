package com.javastudy.chapter7;

public class Polymorphism02 {
    /**
     * 참조변수의 형변환
     *  부모 자식간의 클래스에서만 가능하다!
     *  서로 상속관게에 있는 클래스 사이에서 자손타입의 참조변수를 조상타입의 참조변수로,
     *      조상타입의 참조변수를 자손타이브이 참조변수로 형변환이 가능하다.
     *
     *  직계만 가능하지, 방계는 형변환이 불가능하다.
     *
     *  이는 사용할 수 있는 멤버의 개수를 조절하는 것 이다! 줄이는 것이 안전하긴 하다..
     *      Down-cating의 경우, 조상클래스의 멤버만 사용가능해진다. 멤버 개수 줄어듬!
     *      Up-cating의 경우, 자손클래스의 멤버들도 사용가능해진다. 멤버 개수 늘어남!
     *      기존 주소값이나 객체는 변하지 않는다.
     *
     *  자식에서 부모타입으로 Up-casting 경우, 형변환 생략이 가능하다.
     *  부모에서 자식으로 Down-casting 경우, 형변환 생략이 불가능하다.
     */

    public static void main(String args[]){
        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();
        car = (Car)fe;      // Down-casting 이므로 형변환 생략 가능하다.
                            // car 참조변수가 null 주소를 가지다가 fe참조변수 주소와 동일 값을 가진다.(FireEngine 인스턴스)

//        car.water();      // 사용가능한 멤버가 줄어들었다.
        fe2 = (FireEngine)car;      // Up-casting
                            // fe2 참조변수가 null 주소를 가지다가 car참조변수 주소와 동일 값을 가진다.(FireEngine 인스턴스)

        // car, fe, fe2 모두 같은 주소를 참조한다. 여기서 사용가능한 멤버의 차이만 있을 뿐이다.

        fe2.water();        // 사용가능한 멤버가 늘어났다.
    }
}
class Car {
    String color;
    int door;

    void drive() {
        System.out.println("drive~~");
    }
    void stop() {
        System.out.println("stop!!");
    }
}
class FireEngine extends Car {
    void water() {
        System.out.println("watering!!");
    }
}

