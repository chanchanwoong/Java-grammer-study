package com.javastudy.chapter11;

import java.util.*;

public class Set04 {
    /**
     * TreeSet
     *  이진 탐색 트리라는 자료구조 형태로 데이터를 저장하는 컬렉션 클래스
     *  정렬, 검색, 범위검색에 특화!
     *
     * 이진 탐색 트리
     *              중간 값의 부모노드
     *          |                  |
     *          작은 값의 자식노드    큰 값의 자식노드
     *
     *   하나의 부모노드에 두 개의 자식노드를 가지고 있다.
     *   값 크기 : 왼쪽 자식노드 < 부모노드 < 오른쪽 자식노드
     *   중복 값을 가질 수 없다.
     *   왼쪽 자식노드 -> 부모 노드 -> 오른쪽 자식노드 순으로 읽어오면 오름차순이 된다.
     *
     *  TreeSet 메서드
     *      TreeSet() : 기본 생성자
     *      TreeSet(Collection c) : 주어진 컬렉션을 저장하는 TreeSet 생성
     *      boolean add(Object o) : 지정된 객체를 저장
     *      boolean addAll(Collection c) : 지정된 컬렉션의 객체를 저장
     *      Object ceiling(Object o) : 지정된 객체와 같은 객체를 반환, 없으면 큰 값을 가진 객체 중 가장 가까운 객체 반환
     *      Object floor(Object o) : 지정된 객체와 같은 객체를 반환, 없으면 작은 값을 가진 객체 중 가장 가까운 객체 반환
     *      void clear() : 저장된 모든 객체 삭제
     *      boolean contains(Object o) : 지정된 객체 포함 여부 확인
     *      boolean contains(Collection c) : 지정된 컬렉션 포함 여부 확인
     *      NavigableSet descendingSet() : TreeSet에 저장된 요소들을 역순으로 정렬 후 반환
     *      Object first() : 정렬된 순서에서 첫 번째 객체를 반환, 가장 작은 값
     *      Object last() : 정렬된 순서에서 마지막 객체를 반환, 가장 큰 값
     *      SortedSet headSet(Object toElement) : 지정된 객체보다 작은 값의 객체들을 반환
     *      NavigatableSet  headSet(Object toElement, boolean inclusive) : inclusive가 true면 같은 값 포함하여 지정된 객체보다 작은 값의 객체들을 반환
     *      SortedSet tailSet(Object fromElement) : 지정된 객체보다 큰 값의 객체들을 반환
     *      NavigatableSet tailSet(Object fromElement, boolean inclusive) : inclusive가 true면 같은 값 포함하여 지정된 객체보다 큰 값의 객체들을 반환
     *      SortedSet subSet(Object fromElement, Object toElement) : 범위 검색의 결과를 반환
     *      NavigatableSet subSet(Object fromElement, boolean fromInclusive Object toElement, boolean toInclusive) :
     *                                  시작점과 끝점 inclusive를 통해 범위 검색의 결과를 반환
     *      Object highter(Object o) : 지정된 객체보다 큰 값을 가진 객체 중 제일 가까운 값의 객체 반환. ceiling과 같은 값 포함 여부가 다름
     *      Object lower(Object o) : 지정된 객체보다 작은 값을 가진 객체 중 제일 가까운 값의 객체 반환. floor과 같은 값 포함 여부가 다름
     *      Object pollFirst() : TreeSet의 첫번째 요소를 반환. 가장 작은 값. first랑 뭐가 다르지? pollFirst는 반환하고 첫 번째 값을 삭제한다!
     *      Object pollLast() : TreeSet의 마지막 요소 반환. 가장 큰 값. last랑 뭐가 다르지? 같은 듯? pollLast()는 반환하고 마지막 값을 삭제한다!
     *      boolean remove(Object o) : 지정된 객체 삭제
     */
    public static void main(String args[]){
        Set set = new TreeSet();

        while(set.size() < 10){
            int num = (int)(Math.random()*45);
            System.out.println("숫자 > " + num);
            set.add(num);
        }
        System.out.println("TreeSet > " + set);     // 크기에 맞게 정렬되는 것을 확인할 수 있다.
        System.out.println("\nTreeSet에서 가장 작은 값을 찾고 삭제(pollFirst()) > " + ((TreeSet)set).pollFirst());
        System.out.println("TreeSet에서 가장 큰 값을 찾고 삭제(pollLast()) > " + ((TreeSet)set).pollLast());
        System.out.println("TreeSet > " + set);
        System.out.println("\nTreeSet에서 가장 작은 값 단순 찾기(first()) > " + ((TreeSet)set).first());
        System.out.println("TreeSet에서 가장 큰 값 단순 찾기(last()) > " + ((TreeSet)set).last());
        System.out.println("TreeSet > " + set);
    }
}
