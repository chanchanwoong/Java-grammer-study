package com.javastudy.chapter10;

import java.time.*;

public class TimePackage06 {
    /**
     * 날짜나 시간 차이
     *  between() : 날짜 또는 시간 간격을 구해준다.
     *  LocalDate 타입이 입력될 때는, Period로 날짜 사이의 간격을 구한다.
     *  LocalTime 타입이 입력될 때는, Duration로 시간 사이의 간격을 구한다.
     */
    public static void main(String args[]){
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.of(1999, 10, 13);
        LocalTime time1 = LocalTime.now();
        LocalTime time2 = LocalTime.of(10, 0, 0);

        System.out.println(Period.between(date1, date2));       // P-24Y-4M-8D 출력. 24년 4월 8일을 의미
        System.out.println(Duration.between(time1, time2));     // PT-12H-2M-16.6960549S 출력. 12시간 2분 16초 의미
    }
}
