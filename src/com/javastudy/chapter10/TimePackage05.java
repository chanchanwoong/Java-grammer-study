package com.javastudy.chapter10;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TimePackage05 {
    /**
     * 날짜나 시간 비교
     *  boolean isAfter(ChronoLocalDate other) : 이후 날짜인지 비교
     *  boolean isBefore(ChronoLocalDate other) : 이전 날짜인지 비교
     *  boolean isAfter(LocalTime other) : 이후 시간인지 비교
     *  boolean isBefore(LocalTime other) : 이전 시간인지 비교
     */
    public static void main(String args[]){
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println(date.isAfter(LocalDate.of(2023,12,2)));
        System.out.println(time.isBefore(LocalTime.of(20, 15)));
    }
}
