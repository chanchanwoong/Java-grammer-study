package com.javastudy.chapter13;

import javax.swing.*;

public class Thread06 {
    /**
     * 쓰레드 효율성 확인을 위한 예제
     * 해당 예제는 싱글 쓰레드로 입력을 받을 때 까지 기다린다.
     *      완전히 비효율! 다른 작업을 못 함!!
     */
    public static void main(String args[]){
        String input = JOptionPane.showInputDialog("아무 값이나 입력하세요 : ");
        System.out.println("입력하신 값 > " + input);

        for(int i=10; i>0; i--){
            System.out.println(i);
            try{
                Thread.sleep(1000);     // 1초 시간 지연
            } catch(Exception e){}
        }
    }
}