package com.javastudy.chapter13;

public class Thread02 {
    /**
     * 쓰레드 구현
     *  쓰레드 구현은 Thread클래스 상속과 Runnable인터페이스 구현, 두 가지 방법이 있다.
     *  재사용성과 코드 일관성, 타 클래스 상속을 고려하면 Runnable인터페이스 구현이 일반적이다.
     *
     *  쓰레드 구현을 위해 개발자가 해야하는 것은 하고자 하는 행위를 추상메서드인 run() 메서드의 몸통에 넣기만 하면 된다!
     *  쓰레드 구현 = run 추상메서드 구현(Thread클래스 상속으로 구현하면 run 오버라이딩)
     *
     *  Thread 클래스 상속한 쓰레드는 바로 인스턴스를 만들어 사용가능하지만,
     *      Runnable 구현 쓰레드는 인스턴스 만든 후 Thread 클래스의 생성자 입력으로 해야지 사용가능하다!
     *
     *  쓰레드 생성 후 사용할려면 start() 메서드를 사용해야 한다.
     *      바로 진행하지는 않고, 실행대기 상태로 진입하여 차례를 기다린다.
     *
     *  한번 사용된 쓰레드는 다시 사용할 수 없으며, 재실행이 필요하면 쓰레드를 다시 만들고 호출한다.
     *
     */
    public static void main(String args[]){
        Thread1 t1 = new Thread1();

//        Thread2 t2 = new Thread2();       // Runnable로 구현한 클래스는 바로 실행이 안된다.
        Runnable r = new Thread2();
        Thread t2 = new Thread(r);

        t1.start();
        t2.start();
//        t1.start();       // 한번 사용된 쓰레드는 재사용 불가
        t1 = new Thread1();
        t2 = new Thread(r);
        t1.start();
        t2.start();
    }
}
class Thread1 extends Thread{
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println(getName());
        }
    }
}
class Thread2 implements Runnable{
    @Override
    public void run() {
        for(int i=0; i<5; i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
