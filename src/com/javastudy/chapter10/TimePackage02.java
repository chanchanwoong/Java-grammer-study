package com.javastudy.chapter10;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TimePackage02 {
    /**
     * 특정 필드 값 가져올 때는 get메서드를 사용하면 된다.
     *
     * LocalDate
     *  int getYear() : 년도 반환
     *  int getMonthValue() : 숫자 월 반환
     *  Month getMonth() : 문자열 월 반환
     *  int getDayOfMonth() : 일 반환
     *  int getDayOfYear() : 같은 해의 1월 1일부터 몇번째 일인지 반환
     *  DayOfWeek getDayOfWeek() : 요일 반환
     *
     * LocalTime
     *  int getHour() : 시간 반환
     *  int getMinute() : 분 반환
     *  int getSecond()  :초 반환
     *
     * LocalDateTime은 위 두 가지 클래스의 메서드를 포함한다.
     */
    public static void main(String args[]){
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println(date.getDayOfYear());
        System.out.println(time.getHour());
        System.out.println(dateTime.getDayOfMonth());
    }
}
