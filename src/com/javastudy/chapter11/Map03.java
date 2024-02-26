package com.javastudy.chapter11;

import java.util.*;

public class Map03 {
    /**
     * HashMap 예제
     */
    public static void main(String args[]){
        HashMap map = new HashMap();
        map.put("A",90);
        map.put("B",100);
        map.put("C",100);
        map.put("D",80);
        map.put("E",90);

        Set set = map.entrySet();       // [A=90, B=100, C=100, D=80, E=90] 이렇게 출력된다.
        Iterator it = set.iterator();

        // entry 안에 내용물을 개별 처리하기 위한 코드
        while(it.hasNext()){
            Map.Entry e = (Map.Entry)it.next();
            System.out.println("이름 : " + e.getKey() + ", 점수 : " + e.getValue());
        }

        set = map.keySet();
        System.out.println("참가자 명단 > " + set);

        Collection values = map.values();
        System.out.println("점수 명단 > " + values);
        Set valuesSet = new HashSet(values);
        System.out.println("점수 set > " + valuesSet);
        System.out.println("점수 set > " + (Collection)valuesSet);

        it = values.iterator();
        int total = 0;

        while(it.hasNext()){
//            int i = Integer.parseInt(String.valueOf(it.next()));
            int i = (int)it.next();
            total += i;
        }
        System.out.println("총점 : " + total);
        System.out.println("평균 : " + (float)total/set.size());
        System.out.println("최고점수 : " + Collections.max(values));
        System.out.println("최저점수 : " + Collections.min(values));
    }
}
