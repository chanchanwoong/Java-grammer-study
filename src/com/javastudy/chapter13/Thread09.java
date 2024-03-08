package com.javastudy.chapter13;

import javax.swing.*;

public class Thread09 {
    /**
     * 쓰레드의 상태
     *  NEW : 쓰레드가 생성되고 아직 start() 호출되지 않은 상태
     *  RUNNABLE : 실행 중 또는 실행 가능한 상태
     *  BLOCKED : 일시정지된 상태
     *  WAITING, TIMED_WAITING : 작업 종료는 아니지만, 실행가능하지 않은 일시정지상태
     *  TERMINATED : 쓰레드의 작업이 종료된 상태
     *
     *
     *  쓰레드가 생성되어 start() 메서드 실행 전 까지 NEW 상태
     *  start() 메서드가 실행되면 자기 차례가 올 때 까지 RUNNABLE 상태
     *  쓰레드 실행 중 suspend(), sleep(), wait(), join() 메서드가 실행되면 WAITING, BLOCKED 상태
     *  일시정지시간이 끝나거나 notify(), resume(), interrupt() 메서드가 실행되면 RUNNABLE 상태
     *  실행이 모두 끝나거나 stop() 메서드가 실행되면 TERMINATED 상태
     */
    public static void main(String args[]){

    }
}