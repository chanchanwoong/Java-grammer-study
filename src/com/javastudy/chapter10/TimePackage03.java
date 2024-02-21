package com.javastudy.chapter10;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TimePackage03 {
    /**
     * 날짜나 시간 연산
     *  LocalDate minusYear(long)
     *  LocalDate plusYears(long)
     *  LocalDate minusMonth(long)
     *  LocalDate plusMonth(long)
     *
     *  LocalTime minusHours(long)
     *  LocalTime plusHours(long)
     *  LocalTime minusMinutes(long)
     *  LocalTime plusMinutes(long)
     */
    public static void main(String args[]){
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println(date.minusYears(1).getYear());
        System.out.println(date.plusYears(1).getYear());
        System.out.println(date.plusMonths(1).getMonthValue());
        System.out.println(time.plusHours(4).getHour());
        System.out.println(time.minusHours(1).getHour());
        System.out.println(time.plusMinutes(23).getMinute());
        System.out.println(time.minusMinutes(12).getMinute());
        System.out.println(dateTime.getDayOfMonth());
    }
}
