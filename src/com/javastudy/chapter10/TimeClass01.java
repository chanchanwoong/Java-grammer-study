package com.javastudy.chapter10;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TimeClass01 {
    /**
     * 기존 Calendar, Date 클래스에는 다음과 같은 문제점이 있었다.
     *  1. 불변객체가 아님
     *      객체가 공유되면 바꾼 값이 공유될 수 있다.
     *  2. 월이나 요일이 헷갈린다.
     *  3. 클래스명이 일치하는 경우도 있다.
     *      java.util.Date 와 java.sql.Date 는 클래스명이 겹침!
     *
     *  해당 문제점을 보완하기 위해 java.time 패키지가 나왔다.
     *  java.time 패키지 안의 클래스들은 String클래스처럼 불변 클래스이다.
     *      LocalDate : 날짜 표현 클래스
     *      LocalTime : 시간 표현 클래스
     *      LocalDateTime : 날짜, 시간 모두 표현 클래스
     *      Period : 두 날짜간 차이 표현 클래스
     *      Duration : 두 시간 차이 표현 클래스
     *
     *  현재에 관한 것은 now 메서드를 사용해서 인스턴스를 생성한다.
     *  특정 날은 of메서드를 이용
     *  문자열은 parse메서드를 이용한다.
     */
    public static void main(String args[]){
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);

        LocalDate date2 = LocalDate.of(2023,2,20);
        LocalTime time2 = LocalTime.of(23,33,30);
        LocalDateTime dateTime2 = LocalDateTime.of(date2,time2);

        System.out.println(date2);
        System.out.println(time2);
        System.out.println(dateTime2);
    }
}
