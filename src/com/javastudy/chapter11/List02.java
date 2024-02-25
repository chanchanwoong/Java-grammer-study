package com.javastudy.chapter11;

import java.util.ArrayList;
import java.util.Collections;

public class List02 {
    /**
     * ArrayList
     *  Vector를 개선한 것으로 Vector보다는 ArrayList를 사용해야 한다.
     *  배열에 더 이상 저장할 공간이 없으면 보다 큰 새로운 배열을 생성해 기존의 배열에 저장된 내용을 새로운 배열로 복사한 다음 저장한다.
     *  여러 타입을 저장할 수 있다.(Array는 하나의 타입만 가능하다.)
     *
     *  메서드
     *      ArrayList() : 크기가 10인 ArrayList 생성
     *      ArrayList(Collection c) : 주어진 컬렉션이 저장된 ArrayList 생성
     *      ArrayList(int initialCapacity) : 초기용량을 가지는 ArrayList 생성
     *      boolean add(Object o) : ArrayList의 마지막에 객체를 추가한다.
     *      void add(int index, Object element) : 지정된 위치에 객체를 저장
     *      void clear() : ArrayList를 완전히 비운다.
     *      boolean contains(Object o) : 지정된 객체가 ArrayList에 포함되어 있는지 확인
     *      Object get(int index) : 지정된 위치에 저장된 객체를 반환한다.
     *      boolean isEmpty() : ArrayList가 비어있는지 확인한다.
     *      Object remove(int index) : 지정된 위치에 있는 객체를 제거한다.
     *      boolean remove(Object o) : 지정한 객체를 제거한다.
     *      boolean retainAll(Collection c) : ArrayList에 젖아된 객체 중에서 주어진 컬렉션과 공통된 것들만을 남기고 나머지는 삭제한다.
     *      Object set(int index, Object element) : 주어진 객체를 지정된 위치에 저장한다.
     *      int size() : ArrayList에 저장된 객체의 개수를 반환한다. capacity 반환이 아님!
     *      void sort(List<T> list, Comparator c) : 지정된 정렬기준으로 ArrayList 정렬(c 없으면 오름차순, Collections.reverseOrder() 이면 내림차순)
     *      List subList(int fromIndex, int toIndex) : from 인덱스부터 to 인덱스 사이에 저장된 객체를 반환한다.
     *      Object[] toArray() : ArrayList에 저자된 모든 객체들을 객체배열로 반환한다.
     */
    public static void main(String args[]){
        ArrayList list1 = new ArrayList();
        list1.add(60);
        list1.add(new Integer(20));
        list1.add(new Integer(40));
        list1.add(new Integer(30));
        list1.add(new Integer(10));
        list1.add(new Integer(50));
        ArrayList list2 = new ArrayList(list1.subList(1,4));
        print(list1,list2);

        Collections.sort(list1);
        Collections.sort(list2);
        print(list1,list2);

        Collections.sort(list1, Collections.reverseOrder());
        Collections.sort(list2, Collections.reverseOrder());
        print(list1,list2);

        list1.add("B");
        list1.add("S");
        list1.add(3, "as");     // 추가된 자리에 있던 것들은 뒤로 밀려남
        print(list1, list2);

        list2.set(2, "three");
        list2.set(2, "new three");      // 기존에 있던 값은 삭제되고 그 자리를 대신한다.
        print(list1,list2);

        System.out.println("list1.retainAll(list2): " + list1.retainAll(list2));        // list1에 list2와 일치하는 것만 남기고 삭제
        print(list1,list2);
        System.out.println("list2.retainAll(list1): " + list2.retainAll(list1));        // list2에 list1와 일치하는 것만 남기고 삭제
        print(list1,list2);

        for(int i=list2.size()-1; i>=0; i--){
            if(list1.contains(list2.get(i))){
                list2.remove(i);
            }
        }
        print(list1,list2);
    }
    static void print(ArrayList list1, ArrayList list2){
        System.out.println("list1 : " + list1);
        System.out.println("list2 : " + list2);
        System.out.println();
    }
}
