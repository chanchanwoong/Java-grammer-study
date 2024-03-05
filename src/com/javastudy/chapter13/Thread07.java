package com.javastudy.chapter13;

import javax.swing.*;

public class Thread07 {
    /**
     * 쓰레드 효율성 확인을 위한 예제
     * 해당 예제는 멀티 쓰레드로 입력을 받을 때 까지 기다리지 않고 독립적으로 업무를 수행한다.
     *      효율성 향상! 다른 작업을 병렬 진행!!
     */
    static long startTime = 0;
    public static void main(String args[]){
        // 쓰레드 생성
        Runnable r = new Thread4();
        Thread t = new Thread(r);
        t.start();

        String input = JOptionPane.showInputDialog("아무 값이나 입력하세요 : ");
        System.out.println("\n입력하신 값 > " + input);
        System.out.println();
    }
}
class Thread4 implements Runnable{
    public void run(){
        for(int i=10; i>0; i--){
            System.out.println(i);
            try{
                Thread.sleep(1000);
            }catch (Exception e){}
        }
    }
}