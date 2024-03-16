package com.javastudy.chapter13;

/**
 * 쓰레드 동기화
 *
 *  쓰레드 동기화는 한 쓰레드가 진행중인 작업을 다른 쓰레드가 간섭하지 못하게 막는 것 이다!
 *
 *  아래 코드를 보면 잔고가 출금 금액보다 큰 경우에만 출금하게 코드를 작성했는데 잔고가 음수인 결과가 나왔다.
 *  이는 쓰레드가 if문의 조건식을 통과하고 출금 전에 다른 쓰레드가 작업하면서 출금 작업을 하면서 겹쳤기 때문이다.
 *
 *  자원이 공유된 것을 알 수 있다!
 *
 *  이를 막기위해선 동기화 작업이 필요하다!
 */
public class Thread14 {
    public static void main(String args[]){
        Runnable r = new ThreadEx14_1();
        Thread t = new Thread(r);
        t.start();
        t = new Thread(r);
        t.start();
    }
}

class Account {
    private int balance = 1000;
    public int getBalance() {
        return balance;
    }
    public void withdraw(int money) {
        if(balance >= money) {
            try {
                Thread.sleep(1000);
            } catch(InterruptedException e){

            }
            balance -= money;
        }
    }
}
class ThreadEx14_1 implements Runnable {
    Account acc = new Account();
    @Override
    public void run() {
        while(acc.getBalance() > 0) {
            int money = (int)(Math.random() * 3 + 1) * 100;
            acc.withdraw(money);
            System.out.println("잔고 > " +acc.getBalance());
        }
    }
}
