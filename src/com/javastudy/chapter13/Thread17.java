package com.javastudy.chapter13;

import java.util.ArrayList;
/**
 * wait(), notify() 예제
 *
 * wait() : 동기호된 임계 영역의 코드를 수행하다가 작업을 더 진행 못하면 wait() 메서드로 쓰레드가 락 반납 후 대기한다.
 * notify() : 작업 진행가능한 상황이면 notify() 메서드로 작업 중단했던 쓰레드가 다시 락을 얻어 작업 진행한다.
 */
class Customer2 implements Runnable {
    private Table2 table;
    private String food;

    Customer2(Table2 table, String food) {
        this.table = table;
        this.food = food;
    }

    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {

            }
            String name =Thread.currentThread().getName();

            table.remove(food);
            System.out.println(name + " ate a " + food);
        }
    }
}

class Cook2 implements Runnable {
    private Table2 table;

    Cook2(Table2 table) {
        this.table = table;
    }

    @Override
    public void run() {
        while(true) {
            int idx = (int)(Math.random()*table.dishNum());
            table.add(table.dishNames[idx]);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {}
        }
    }
}
class Table2 {
    String[] dishNames = {"donut", "donut", "burger"};
    final int MAX_FOOD = 6;
    private ArrayList<String> dishes = new ArrayList<>();

    public synchronized void add(String dish) {
        while (dishes.size() >= MAX_FOOD) {
            String name = Thread.currentThread().getName();
            System.out.println(name + " is waiting ");
            try {
                wait();
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }
        dishes.add(dish);
        notify();
        System.out.println("Dishes: " + dishes.toString());
    }

    public void remove(String dishName) {
        synchronized (this) {
            String name = Thread.currentThread().getName();

            while (dishes.size() == 0) {
                System.out.println(name + " is waiting");
                try {
                    wait();
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }

            while (true) {
                for (int i = 0; i < dishes.size(); i++) {
                    if (dishName.equals(dishes.get(i))) {
                        dishes.remove(i);
                        notify();
                        return;
                    }
                }
                try {
                    System.out.println(name + " is waiting");
                    wait();
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }
        }
    }
    public int dishNum() {
        return dishNames.length;
    }
}

class Thread17 {
   public static void main(String args[]) throws InterruptedException {
       Table2 table = new Table2();

       new Thread(new Cook2(table), "COOK").start();
       new Thread(new Customer2(table, "donut"), "CUST1").start();
       new Thread(new Customer2(table, "burger"), "CUST2").start();

       Thread.sleep(2000);
       System.exit(0);
   }
}
