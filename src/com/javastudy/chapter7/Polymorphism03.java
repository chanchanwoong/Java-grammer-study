package com.javastudy.chapter7;

public class Polymorphism03 {
    /**
     * instanceof 연산자
     *  참조변수가 참조하고 있는 인스턴스의 실제 타입을 알아보기 위해 사용가능하다.
     *  결과로 true를 얻은 경우, 참조변수가 검사한 타입으로 형변환이 가능하다는 것을 의미한다.
     */

    public static void main(String args[]){
        Car c = new FireEngine();
        check(c);
    }
    static void check(Car c){
        if (c instanceof FireEngine){
            System.out.println("FireEngine 타입이 맞습니다.");
            FireEngine fe = (FireEngine)c;
            fe.water();
        }else{
            System.out.println("FireEngine 타입이 아닙니다.");
        }
    }
}
