package com.javastudy.chapter7;

public class Interface03 {
    /**
     * 인터페이스의 구현
     *  인터페이스는 추상클래스처럼 자체로 인스턴스 생성이 불가능하다.
     *  인터페이스도 몸통을 만들어주는 클래스를 작성해야 하는데 이 클래스를 구현체라고 한다.
     *  implements 키워드를 붙혀서 제작한다.
     *      추상클래스는 상속의 extends를 사용했었다.
     *
     *  인터페이스의 메서드 중 일부만 구현할 때는, abstract를 붙여서 추상클래스로 선언해야 한다.
     */
}
class Fighter1 implements Fightable {
    @Override
    public void move(int x, int y) {
        // 구현 내용
    }

    @Override
    public void attack(String unit) {
        // 구현 내용
    }
}

abstract class Fighter2 implements Fightable {
    public void move(int x, int y){
        // 구현 내용
    }
    // attack 메서드는 생략했으므로 추상클래스로 제작해야 한다.
    // 추상클래스에서 일반 메서드 부분으로 인터페이스 구현체를 만들어 두고, 나머지 미완성 부분은 추상 메서드로 남겨둔다.
    // 추상클래스의 미완성 부분은 추후 일반 클래스에서 구현을 해야 한다.
}

