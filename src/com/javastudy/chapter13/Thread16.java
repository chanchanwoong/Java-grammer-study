package com.javastudy.chapter13;

import java.util.ArrayList;
/**
 * wait(), notify() 메서드
 *
 * synchronized 키워드로 동기화 후 공유 데이터 보호가 가능하다.
 *  그러나, 특정 쓰레드가 임계 영역을 오래 가지고 있으면 안된다.
 *
 *  아래 코드를 보면 손님 쓰레드가 계속해서 기다리고 있다.
 *
 *  이 부분을 해결하기 위해 wait(), notify() 메서드가 나왔다.
 */
class Customer implements Runnable {
    private Table table;
    private String food;

    Customer(Table table, String food) {
        this.table = table;
        this.food = food;
    }

    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {

            }
            String name =Thread.currentThread().getName();

            if(eatFood()){
                System.out.println(name + " ate a " + food);
            } else {
                System.out.println(name + " failed to eat.");
            }
        }
    }
    boolean eatFood() {
        return table.remove(food);
    }
}
class Cook implements Runnable {
    private Table table;

    Cook(Table table) {
        this.table = table;
    }

    @Override
    public void run() {
        while(true) {
            int idx = (int)(Math.random()*table.dishNum());
            table.add(table.dishNames[idx]);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {}
        }
    }
}
class Table {
    String[] dishNames = {"donut", "donut", "burger"};
    final int MAX_FOOD = 6;
    private ArrayList<String> dishes = new ArrayList<>();

    public synchronized void add(String dish) {
        if(dishes.size() >= MAX_FOOD){
            return;
        }
        dishes.add(dish);
        System.out.println("Dishes : " + dish.toString());
    }
    public boolean remove(String dishName) {
        synchronized (this) {
            while(dishes.size() == 0){
                String name = Thread.currentThread().getName();
                System.out.println(name + " is waiting");
                try {
                    Thread.sleep(500);
                }catch(InterruptedException e) {}
            }

            for(int i=0; i< dishes.size(); i++){
                if(dishName.equals(dishes.get(i))) {
                    dishes.remove(i);
                    return true;
                }
            }
        }
        return false;
    }
    public int dishNum() {
        return dishNames.length;
    }
}

class Thread16 {
   public static void main(String args[]) throws InterruptedException {
       Table table = new Table();

       new Thread(new Cook(table), "COOK").start();
       new Thread(new Customer(table, "donut"), "CUST1").start();
       new Thread(new Customer(table, "burger"), "CUST2").start();

       Thread.sleep(5000);
       System.exit(0);
   }
}
