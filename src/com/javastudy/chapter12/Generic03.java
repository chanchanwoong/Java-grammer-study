package com.javastudy.chapter12;

import java.util.HashMap;

/**
 * 제네릭스 예제
 *  HashMap<Key, Value> 를 이용한 예제
 */
public class Generic03 {
    public static void main(String args[]){
        HashMap<String, Product> map = new HashMap<String, Product>();
        map.put("제품", new Product());
        map.put("오디오", new Audio());
        map.put("티비", new Tv());

        System.out.println("제품 > " + map.get("제품"));
        System.out.println("오디오 > " + map.get("오디오"));
        System.out.println("티비 > " + map.get("티비"));

        /*
        제품 > com.javastudy.chapter12.Product@380fb434
        오디오 > com.javastudy.chapter12.Audio@668bc3d5
        티비 > com.javastudy.chapter12.Tv@3cda1055

        출력 결과를 보면 자동으로 Product 타입이나 Audio, Tv 타입으로 변환된다. 형변화가 필요가 없음!
         */
    }
}
