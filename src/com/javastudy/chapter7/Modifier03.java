package com.javastudy.chapter7;

public class Modifier03 {
    /**
     * final
     *  변경될 수 없다는 의미를 가진다.
     *  변수에 사용되면 값을 변경 못하는 상수가 되고, 메서ㅓ드에 사용되면 오버라이딩을 할 수 없어진다.
     *  클래스에 사용하면 자신을 확장하는 자손클래스를 정의 못 한다.
     *
     *  final 사용가능 한 곳
     *      클래스, 메서드, 멤버변수, 지역변수
     */
}
final class test1{
    int x = 3;
}

// test1은 조상클래스가 될 수 없어졌다.
//class test2 extends test1{
//    int y = 5;
//}