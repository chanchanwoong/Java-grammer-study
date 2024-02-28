package com.javastudy.chapter12;

import java.util.ArrayList;
import java.util.List;

/**
 * 제네릭스 다형성
 *  참조변수의 제네릭 타입과 생성자에 지정해준 제네릭 타입은 일치해야 한다.
 *  상속관게에 있어도 일치해야 한다.
 */

class Product {}
class Tv extends Product {}
class Audio extends Product {}
public class Generic02 {
    public static void main(String args[]){
        ArrayList<Product> productList = new ArrayList<Product>();
        ArrayList<Tv> tvList1 = new ArrayList<Tv>();
//        ArrayList<Product> tvList2 = new ArrayList<Tv>();     // 참조변수의 제네릭 타입 일치하지 않아서 에러발생
        List<Tv> tvList3 = new ArrayList<Tv>();         // 다형성으로 문제 없음

        productList.add(new Tv());
        productList.add(new Audio());

        tvList1.add(new Tv());
        tvList3.add(new Tv());

        printAll(productList);
//        printAll(tvList1);        //printAll의 타입 변수가 다르기 때문에 에러발생

    }
    private static void printAll(ArrayList<Product> list){
        for (Product p : list){
            System.out.println(p);
        }
    }
}
