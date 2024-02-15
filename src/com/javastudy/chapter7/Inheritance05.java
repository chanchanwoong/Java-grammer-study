package com.javastudy.chapter7;

public class Inheritance05 {
    /**
     * super
     * 상속받은 멤버 변수와 클래스의 멤버 변수 이름이 같을 때 super를 이용해서 구별한다.
     * 상속 변수 구별하는데 사용된다는 점만 제외하면 this와 super는 같다.
     */
    public static void main(String args[]) {
        Child c = new Child();
        c.method();
    }
}

class Parent {
    int x = 10;
}
class Child extends Parent {
    int x = 20;     // 조상 클래스의 멤버 변수와 이름이 같은 상황, 구별을 위해 super가 필요

    void method(){
        System.out.println("x = " + x);     // Child의 멤버변수 x값 20 출력
        System.out.println("this.x = " + this.x);       // Child의 멤버변수 x값 20 출력
        System.out.println("super.x = " + super.x);     // Parent의 멤버변수 x값 10 출력
    }
}
