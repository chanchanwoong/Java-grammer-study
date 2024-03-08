package com.javastudy.chapter13;

public class Thread10 {
    /**
     * 쓰레드의 실행 제어
     *  static void sleep(long milis) : 지정된 시간 동안 쓰레드를 일시정지 시킨다. 시간이 지나면 다시 실행대기 상태가 된다.
     *  void join(long milis) : 지정된 시간동안 쓰레드가 실행되도록 한다.
     *  void interrupt() : sleep()이나 join()에 의해 일시정지상태인 쓰레드를 깨우 실행대기상태로 만든다.
     *  void stop() : 쓰레드를 즉시 종료한다.
     *  void suspend() : 쓰레드를 일시정지한다.
     *  void resume() : suspend()에 의해 일시정지된 쓰레드를 실행대기상태로 만든다.
     *  static void yield() : 실행 중 자신에게 주어진 실행시간ㅇ르 다른 쓰레드에게 양보하고 자신은 실행대기상태가 된다.
     *
     *  resume(), stop(), suspend()는 deprecated 상태로, 사용하면 안된다.
     */
    public static void main(String args[]){

    }
}