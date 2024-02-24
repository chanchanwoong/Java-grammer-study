package com.javastudy.chapter11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class List03 {
    /**
     * Stack과 Queue
     *  Stack
     *      마지막에 들어온 것이 우선으로 나간다.(후입선출)
     *      push로 저장, pop으로 추출한다.
     *      ArrayList로 구현되어있다. 객체 생성할 때는 Stack 클래스를 사용
 *      Queue
     *      먼저 들어온 것이 우선으로 나간다.(선입선출)
     *      offer로 저장, poll로 추출한다.
     *      LinkedList로 구현되어있다.
     *
     * Stack 메서드
     *  boolean empty() : Stack이 비어있는지 확인
     *  Object peek() : Stack의 맨 위, 최근에 넣은 값 반환. stack에서 꺼내는 것은 아님
     *  Object pop() : Stack의 맨 위, 최근에 넣은 값 반환. stack에서 꺼냄
     *  Object push(Object item) : Stack에 객체를 저장한다.
     *  int search(Object o) : Stack에서 주어진 객체를 찾아 위치를 반환
     *
     * Queue 메서드
     *  boolean add(object o) : 지정된 객체를 Queue에 추가한다.
     *  Object remove() : Queue에서 객체를 꺼내 반환
     *  Object element() : 삭제없이 요소를 반환
     *  boolean offer(Object o) : Queue에 객체를 저장
     *  Object poll() : Queue에서 객체를 꺼내서 반환
     *  Object peek() : 삭제없이 요소를 읽어 온다.
     */
    public static void main(String args[]){
        Stack st = new Stack();
        Queue q = new LinkedList();

        st.push("0");
        st.push("1");
        st.push("2");

        q.offer("0");
        q.offer("1");
        q.offer("2");

        System.out.println("stack 요소");
        while(!st.empty()){
            System.out.println(st.pop());
        }
        System.out.println("pop 후 남은 요소 > " + st.toString());

        System.out.println("queue 요소");
        while(!q.isEmpty()){
            System.out.println(q.poll());
        }
        System.out.println("poll 후 남은 요소 > " + q.toString());
    }
}
