package com.javastudy.chapter13;

public class Thread03 {
    /**
     * start()와 run() 차이
     *  run() 메서드는 구현한 코드를 실행시키는 메서드의 역할만 진행한다.
     *  start() 메서드는 새로운 쓰레드가 작업을 하는데 필요한 호출스택을 생성하고 run() 메서드를 호출한다.
     *      run()을 통해 독립된 공간에서 쓰레드가 작업을 수행한다.
     *
     * run(), start() 메서드 둘 다 run()안에 구현한 작업이 돌아간다는 것은 일치한다. 차이는 다음과 같다.
     * run() 메서드를 실행하면, 현재 쓰레드에서 작업이 진행된다.
     *      병렬적이지 못 함!
     * 반면에, start() 메서드는 호출 스택을 생성하고 새로운 공간에서 쓰레드가 병렬적으로 동작을 한다.
     *      멀티쓰레딩 작업을 위해 start() 메서드를 써야한다는 것!
     */
    public static void main(String args[]){
    }
}