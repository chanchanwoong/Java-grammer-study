package com.javastudy.chapter7;

public class Polymorphism01 {
    /**
     * 다형성
     *  여러 가지 형태를 가지는 것을 의미한다.
     *  프로그래밍 관점에서 보면 조상클래스 타입의 참조변수로 자손클래스의 인스턴스를 참조하는 것을 의미
     *
     *  기존에는 인스턴스 생성 시, 인스턴스 타입과 참조변수의 타입이 일치했다.(일반적인 방식)
     *      참조변수는 객체의 메모리 주소를 가리키는 변수이다.
     *  클래스 간에 상속관계에 있을 경우, 다음과 같이 조상 클래스 타입의 참조변수로 자손 클래스의 인스턴스를 참조 가능하다.
     *      조상클래스 타입 참조변수 = new 자손클래스();
     *      Tv t = new SmartTv();
     *
     *  조상타입의 참조변수로 자손타입의 인스턴스를 참조할 수 있지만, 반대는 불가능하다!
     *
     *  이 경우, Tv타입(조상클래스)의 멤버변수만 사용가능하다!
     *      그러면 왜 다형성을 사용하는 거지?? 오히려 인스턴스 기능이 제한되는 것이 아닌가??
     *          1. 유지보수 관점 : 여러 클래스를 하나의 조상클래스로 관리 가능하여 유지보수에 용이하다. 핸들링 용이
     *          2. 유연성 및 확장성 : 자손 클래스가 조상 클래스 메소드를 오버라이드가 가능하다!
     *              오버라이드를 통해 기존 틀에 맞춰서 프로그래밍을 안해도 괜찮아진다.
     *          3.
     *
     */

    public static void main(String args[]){
        SmartTv smartTv = new SmartTv();
        Tv tv = new SmartTv();
        System.out.println(smartTv.caption);   // SmartTv의 cation 멤버 변수 사용 가능
//        System.out.println(tv.caption);     // SmartTv의 cation 멤버 변수는 사용 불가능
    }
}
