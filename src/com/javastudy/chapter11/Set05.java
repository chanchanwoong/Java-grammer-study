package com.javastudy.chapter11;

import java.util.Set;
import java.util.TreeSet;

public class Set05 {
    /**
     * TreeSet 예제
     */
    public static void main(String args[]){
        TreeSet set1 = new TreeSet();
        String from = "b";
        String to = "e";

        set1.add("abc");
        set1.add("alien");
        set1.add("bat");
        set1.add("car");
        set1.add("Car");
        set1.add("disc");
        set1.add("Dance");
        set1.add("dZZZZ");
        set1.add("dzzzz");
        set1.add("elephant");
        set1.add("elevator");
        set1.add("Elevator");
        set1.add("fan");
        System.out.println("set1 > " + set1);       // 대문자 먼저 저장된다. 아스키 코드 값으로 인함
        System.out.println("range search(subSet(from, to)) > " + set1.subSet(from, to));        // 첫 글자가 b, c, d 인 요소만 반환
        System.out.println("range search(subSet(from, to + \"zzz\")) > " + set1.subSet(from, to+"zzz"));        // 첫 글자가 b, c, d, e에 끝 글자 zzz 안에 포함되는 요소만 반환

        TreeSet set2 = new TreeSet();
        int[] score = {80,95,50,35,45,65,10,100};

        for(int i=0; i<score.length; i++){
            set2.add(score[i]);
        }
        System.out.println("\n50보다 작은 값들(headSet) > " + set2.headSet(50));
        System.out.println("50보다 큰 값들(tailSet) > " + set2.tailSet(50));
    }
}
