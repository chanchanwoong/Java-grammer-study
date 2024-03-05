package com.javastudy.chapter13;

import javax.swing.*;

public class Thread08 {
    /**
     * 쓰레드 우선순위
     *  쓰레드는 우선순위 멤버변수가 있다.
     *  작업의 중요도에 따라 우선순위를 다르게 지정하여 특정 쓰레드를 우선 처리할 수 있다.
     *      시각적인 부분, 사용자에게 빠르게 반응해야하는 작업을 우선순위를 높인다.
     *
     *  void setPriority(int 우선순위 입력값) : 쓰레드 우선순위를 지정값으로 갱신
     *  int getPriority() : 해당 쓰레드의 우선순위를 반환한다.
     *
     *
     *  우선순위가 상대적으로 높은 쓰레드가 작업 끝나고 낮은 쓰레드가 작업하는 것이 아니다.
     *      단지, 더 많은 실행시간과 실행기회를 갖는 것 뿐이다!
     */
    public static void main(String args[]){
        Runnable r1 = new Thread5();
        Thread t1 = new Thread(r1);

        Runnable r2 = new Thread6();
        Thread t2 = new Thread(r2);

        System.out.println("t1의 우선순위 값 > " + t1.getPriority());
        System.out.println("t2의 우선순위 값 > " + t2.getPriority());

        // 우선순위 지정
        t1.setPriority(3);
        t2.setPriority(7);

        System.out.println("변경 후 t1의 우선순위 값 > " + t1.getPriority());
        System.out.println("변경 후 t2의 우선순위 값 > " + t2.getPriority());

        t1.start();
        t2.start();
    }
}
class Thread5 implements Runnable{

    @Override
    public void run() {
        for(int i=0; i<300; i++){
            System.out.print("<쓰레드 1> ");
            for(int j=0; j<10000000; j++){

            }
        }
    }
}
class Thread6 implements Runnable{
    @Override
    public void run() {
        for(int i=0; i<300; i++){
            System.out.print("<쓰레드 2> ");
            for(int j=0; j<10000000; j++){

            }
        }
    }
}