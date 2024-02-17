package com.javastudy.chapter7;

public class Interface02 {
    /**
     * 인터페이스의 상속
     *  인터페이스는 인터페이스끼리 상속이 가능하며, 클래스와 다르게 다중상속이 가능하다.
     */
}
interface Movable {
    void move(int x, int y);
}
interface Attackable {
    void attack(String unit);
}
interface Fightable extends Movable, Attackable {
    /**
     * Movable과 Attackable 인터페이스의 메서드들을 멤버로 가진다. (상속받는다.)
     */
}