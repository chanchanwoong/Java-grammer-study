package com.javastudy.chapter13;

/**
 * 쓰레드 동기화 예제
 *
 * synchronized 키워드를 이용한 동기화 방법이 있다.
 * 이 키워드는 임계 영역을 설정하는데 사용된다.
 *      임계 영역은 공유 데이터를 사용하는 코드 영역을 말한다.
 *
 * 임계 영역은 하나의 쓰레드만 접근 실행이 가능하다! 일관성을 보장해준다.
 *
 * 개발자는 synchronized 키워드로 임계 영역만 설정해주면 된다!
 *
 * 임계 영역은 최소화하는 것이 효율적이다!
 *
 * 아래 예제를 보면 withdraw 메서드를 임계 영역으로 지정해줘서 임계 영역에서 수행되는 쓰레드가 끝날 때 까지 기다린다.
 */
public class Thread15 {
    public static void main(String args[]){
        Runnable r = new ThreadEx14_1();
        Thread t = new Thread(r);
        t.start();
        t = new Thread(r);
        t.start();
    }
}

class Account2 {
    private int balance = 1000;
    public int getBalance() {
        return balance;
    }
    public synchronized void withdraw(int money) {
        if(balance >= money) {
            try {
                Thread.sleep(1000);
            } catch(InterruptedException e){

            }
            balance -= money;
        }
    }
}
class ThreadEx15_1 implements Runnable {
    Account2 acc = new Account2();
    @Override
    public void run() {
        while(acc.getBalance() > 0) {
            int money = (int)(Math.random() * 3 + 1) * 100;
            acc.withdraw(money);
            System.out.println("잔고 > " +acc.getBalance());
        }
    }
}
