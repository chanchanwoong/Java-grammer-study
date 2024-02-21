package com.javastudy.chapter10;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TimePackage04 {
    /**
     * 날짜나 시간 변경
     *  LocalDate withYear(int) : 년 변경
     *  LocalDate withMonth(int) : 월 변경
     *  LocalDate withDayOfMonth(int) : 월의 일 변경
     *  LocalDate withDayOfYear(int) : 년의 일 변경
     *  LocalTime withHour(int) : 시간 변경
     *  LocalTime withMinute(int) : 분 변경
     */
    public static void main(String args[]){
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println(date.withYear(1995).getYear() + " " + date.withMonth(4).getMonthValue() + " " + date.withDayOfMonth(15).getDayOfMonth());
        System.out.println(time.withHour(4).getHour() + " " + time.withMinute(15).getMinute());
        System.out.println(dateTime.getDayOfMonth());
    }
}
