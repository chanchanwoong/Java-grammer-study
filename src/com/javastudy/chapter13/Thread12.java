package com.javastudy.chapter13;

import javax.swing.*;

public class Thread12 {
    /**
     * interrupt 메서드
     *  일시정지 상태에 있을 때, interrupt() 실행하면 실행대기 상태로 바뀐다.
     *  작업을 멈추라는 행동
     */
    public static void main(String args[]){
        Runnable r1 = new Thread9();
        Thread t1 = new Thread(r1);
        t1.start();

        String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
        System.out.println("입력하신 값은 " + input + " 입니다.");
        t1.interrupt();
        System.out.println("isInterrupted(): " + t1.isInterrupted());

    }
}
class Thread9 extends Thread implements Runnable {

    @Override
    public void run() {
        int i = 10;

        while(i!=0 && !isInterrupted()) {
            System.out.println(i--);
            for(long x=0; x<2500000000L; x++);
        }
        System.out.println("카운트 종료");
    }
}