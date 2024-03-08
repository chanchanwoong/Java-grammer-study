package com.javastudy.chapter13;

public class Thread11 {
    /**
     * sleep 메서드
     *  sleep() 메서드가 실행되어 지정된 시간이 다 되거나 interrupt()가 호출되면,
     *      InterruptedException 발생하므로 try-catch문을 사용해야 한다.
     *
     *  sleep() 메서드는 호출된 쓰레드를 대기시킨다.
     */
    public static void main(String args[]){
        Runnable r1 = new Thread7();
        Thread t1 = new Thread(r1);

        Runnable r2 = new Thread8();
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();

        try {
            t1.sleep(2000);
        } catch (InterruptedException e) {}

        System.out.println("<<main 종료>>");

        /**
         * 예상
         *  main 종료 -> t2 종료 -> t1 종료
         *
         * 결과
         *  t1 종료 -> t2 종료 -> main 종료
         *
         * 이유가 t1.sleep(2000)은 쓰레드1을 2초 대기하지 않고, sleep() 호출된 쓰레드를 대기시킨다.
         *  main 쓰레드가 대기되어 마지막에 끝난다.
         */
    }
}
class Thread7 implements Runnable{

    @Override
    public void run() {
        for(int i=0; i<300; i++) System.out.print("-");
        System.out.println("<<t1 종료>>");;
    }
}
class Thread8 implements Runnable{

    @Override
    public void run() {
        for(int i=0; i<300; i++) System.out.print("|");
        System.out.println("<<t2 종료>>");
    }
}