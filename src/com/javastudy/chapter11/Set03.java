package com.javastudy.chapter11;

import java.util.*;

public class Set03 {
    /**
     * HashSet 예제
     */
    public static void main(String args[]){
        Set set1 = new HashSet();

        // set1의 크기가 10이 될 때 까지, 로또 번호 입력
        // 중복값 없애는 것에 초첨
        while(set1.size() < 10){
            int num = (int)(Math.random() * 45) + 1;
            set1.add(num);
        }

        Collection list1 = Arrays.asList(set1.toArray()[0], set1.toArray()[1],
                set1.toArray()[2], set1.toArray()[3], set1.toArray()[4], set1.toArray()[5], set1.toArray()[6],
                set1.toArray()[7], set1.toArray()[8], set1.toArray()[9]);     // asList(c1, c2,,,) 는 c1,c2를 리스트의 요소로
                                                                                // 만들기 때문에 하나하나 지정해줘야 함. 비효율!
        Collection list2 = new LinkedList(set1);        // 생성자로 하는 것이 훨 효율적이다!
        Collection list3 = new ArrayList(set1);         // 생성자로 하는 것이 훨 효율적이다!

        System.out.println("list1 > " + list1);
        System.out.println("list2 > " + list2);
        System.out.println("list3 > " + list3);

        Collections.sort((List)list1);
        Collections.sort((List)list2);
        Collections.sort((List)list3);

        System.out.println("정렬 후 list1 > " + list1);
        System.out.println("정렬 후 list2 > " + list2);
        System.out.println("정렬 후 list3 > " + list3);
    }
}
