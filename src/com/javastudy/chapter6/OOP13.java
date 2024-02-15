package com.javastudy.chapter6;

public class OOP13 {
    /**
     * 변수의 초기화
     *  변수를 선언하고 처음 값을 저장하는 것을 의미한다.
     *  가능하면 선언과 동시에 적절한 값으로 초기화하는 것이 일반적이다.
     *  멤버변수(클래스 영역의 변수)는 타입에 맞게 기본값이 초기화되지만, 지역변수는 사용 전 반드시 초기화 해야 한다. 선언은 가능한 듯!
     */
    public static void main(String[] args){
        InitTest test = new InitTest();
        System.out.println(test.x + " " + test.y);      // 기본 값 0이 할당된다.
        System.out.println();
    }
}

class InitTest{
    int x;
    int y = x;

    void methodTest(){
        int i;
        // 아래 두 문장은 지역변수가 초기화되지 않아서 에러가 뜬다. 선언만 가능하다!
//        int j = i;
//        System.out.println("지역변수 i 값 " + i);
    }
}
