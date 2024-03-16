package com.javastudy.chapter13;

public class Thread13 {
    /**
     * join 메서드
     *  void join()
     *  void join(long millis)
     *
     *  작업 중에 다른 쓰레드가 먼저 수행되야 할 때, 지저된 시간동안 작업을 수행한다.
     *  try-catch문이 같이 사용되야 한다.
     *
     *  sleep() 메서드와 유사하지만 sleep() 메서드는 호출된 쓰레드가 대기하지만 join() 메서드는 특정 쓰레드에 대해 동작한다.
     */

    static long startTime = 0;
    public static void main (String args[]) {
        System.out.println("메인 스레드 시작");
        Runnable r1 = new ThreadEx13_1();
        Thread t1 = new Thread(r1);

        Runnable r2 = new ThreadEx13_2();
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();

        startTime = System.currentTimeMillis();

        try{
            t1.join();      // main 스레드는 t1이 끝날 때 까지 기다려야 한다.
            t2.join();      // main 스레드는 t2가 끝날 때 까지 기다려야 한다.
        } catch(InterruptedException e){

        }

        System.out.println("소요 시간 : " + (System.currentTimeMillis() - Thread13.startTime));
    }
}
class ThreadEx13_1 implements Runnable {
    @Override
    public void run() {
        System.out.println("t1 시작");
        for(int i=0; i<300; i++){
            System.out.print(new String("-"));
        }
    }
}
class ThreadEx13_2 implements Runnable {
    @Override
    public void run() {
        System.out.println("t2 시작");
        for(int i=0; i<300; i++){
            System.out.print(new String("|"));
        }
    }
}