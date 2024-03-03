package com.javastudy.chapter13;

public class Thread05 {
    /**
     * 싱글쓰레드와 멀티쓰레드
     *
     *  상황 : 두 개의 작업을 하나의 쓰레드(th1)로 처리하는 경우와 두 개의 쓰레드(th1, th2)로 처리
     *  작업 과정
     *      상황1은 하나의 작업을 끝내고 나머지 작업을 처리한다.
     *      상황2는 두 가지 작업을 번갈아가면서 수행한다.
     *  결과
     *      두 개의 쓰레드로 작업한 시간이 싱글쓰레드로 작업한 시간보다 더 걸린다!
     *      쓰레드간의 작업 전환 시간이 추가되기 때문이다.
     *  결론
     *      단순히 CPU 사용하는 계산작업에는 싱글 쓰레드가 더 효율적이다!
     */
    static long startTime = 0;
    public static void main(String args[]){
        // 쓰레드 생성
        Runnable r = new Thread3();
        Thread t = new Thread(r);
        t.start();

        startTime = System.currentTimeMillis();


        for(int i=0; i<300; i++){
            System.out.printf("%s", new String("-"));
        }
        System.out.println("소요시간1 : " + (System.currentTimeMillis() - Thread05.startTime));
    }
}
class Thread3 implements Runnable{
    public void run(){
        for(int i=0; i<300; i++){
            System.out.printf("%s", new String("|"));
        }
        System.out.print("소요시간2 : " + (System.currentTimeMillis() - Thread05.startTime));
    }
}