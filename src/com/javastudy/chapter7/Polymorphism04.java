package com.javastudy.chapter7;

public class Polymorphism04 {
    /**
     * 매개변수의 다형성
     *  상속관계에서 메서드의 매개변수에 다형성을 적용하면 간단히 처리 가능한 경우가 많다.
     */

    public static void main(String args[]){
        Buyer b = new Buyer();
        b.buy(new Tv1());
        b.buy(new Computer());
        /*
        b.buy(new Tv1()); 와 동일 코드
        Tv1 t = new Tv1;
        b.buy(t);
         */
        System.out.println("현재 남은 돈 > " + b.money);
        System.out.println("현재 보너스 > " + b.bonusPoint);
    }
}
class Product {
    int price;
    int bonusPoint;

    // 생성자
    Product(int price){
        this.price = price;
        bonusPoint = (int)(price/10.0);     // 보너스는 제품 가격의 10%
    }
}
class Tv1 extends Product {
    Tv1() {
        super(100);
    }
    public String toString(){
        return "Tv";
    }
}
class Computer extends Product {
    Computer(){
        super(200);
    }
    public String toString(){
        return "Computer";
    }
}

// 고객 정보
class Buyer {
    int money = 300;
    int bonusPoint = 0;
    void buy(Product p){        // Product 타입으로 다형성을 이용해 간단하게 표기했다.
                                // 딱 맞췄을 경우에, buy(Tv1 tv1), buy(Computer computer) 같이 하나하나 만들어줘야 했을 것!
        if(money < p.price){
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        System.out.println(p + " 을/를 구입하셨습니다.");
        // 참조변수 + 문자열" 의 경우 참조변수.toString() + 문자열 로 처리된다.
    }
}

