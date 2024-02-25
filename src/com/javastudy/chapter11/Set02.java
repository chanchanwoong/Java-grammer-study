package com.javastudy.chapter11;

import java.util.*;

public class Set02 {
    /**
     * HashSet
     *  Set 인터페이스를 구현한 가장 대표적인 컬렉션이다.
     *  Set 특징대로 순서나 중복을 허용하지 않는다.
     *
     *  HashSet메서드
     *      HashSet() : HashSet객체 생성
     *      HashSet(Collection c) : 주어진 컬렉션을 포함한 HashSet객체 생성
     *      boolean add(Object o) : 새로운 객체를 저장한다.
     *      boolean addAll(Collection c) : 주어진 컬렉션에 저장된 모든 객체들을 합집합으로 추가한다.
     *      void clear() : 저장된 모든 객체를 삭제
     *      boolean contains(Object o) : 지정된 객체를 포함하고 있는지 알려준다.
     *      boolean containsAll(Collection c) : 주어진 컬렉션에 저장된 모든 객체들을 포함하고 있는지 반환
     *      boolean isEmpty() : 빈 HashSet인지 반환
     *      boolean remove(Object o) : 지정된 객체를 HashSet에서 삭제
     *      boolean retainAll(Collection c) : 주어진 컬렉션에 저장된 객체와 동일한 교집합만 남기고 삭제
     *      int size() : 저장된 객체 개수 반환
     *      Object[] toArray() : 저장된 객체들을 객체배열의 형태로 반환
     */
    public static void main(String args[]){
        Object[] arr = {100, "100", 52, "54", "1", 2, new Integer(2), "2", 3, 3, "1", "5", 5};       // Object 요소로 받기 때문에 여러 타입이 가능
        Set set1 = new HashSet();
        Collection listBySet2 = Arrays.asList(arr);
        Set set2 = new HashSet(listBySet2);       // 배열을 바로 못 담으니, 배열을 리스트로 변환(컬렉션 타입)

        for(int i=0; i<arr.length; i++){
            set1.add(arr[i]);
        }

        System.out.println("arr > " + Arrays.toString(arr));
        System.out.println("set1 > " + set1.toString());        // 2, Integer(2), "2" 타입이 세 가지지만, 오토박싱으로 래퍼 클래스를 통과하게 된다.
                                                                // 그렇기에 출력에는 String객체와 Integer 객체 두 가지 2가 나온다.
        System.out.println("set2 > " + set2.toString());

        // 고정된 크기의 List라서 추가가 안된다.
//        listBySet2.add("고정된 크기의 리스트인지 테스트");
//        System.out.println("set2 > " + set2.toString());

        // Iterator을 이용해서 HashSet에 저장된 요소들을 출력
        Iterator it = set1.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        // set1과 set2가 동일한 요소를 가졌는지 확인
        if(set1.containsAll(set2)){
            System.out.println("set1과 set2는 containsAll 메서드를 통해 일치함을 확인");
        }
    }
}
