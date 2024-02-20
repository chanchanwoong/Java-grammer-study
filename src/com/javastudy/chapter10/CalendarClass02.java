package com.javastudy.chapter10;

import java.util.Calendar;

public class CalendarClass02 {
    /**
     * Calendar 인스턴스에 원하는 날짜나 시간으로 설정하려면 set메서드를 이용한다.
     */
    public static void main(String args[]){
        final String[] DAY_OF_WEEK = {"", "일", "월", "화", "수", "목", "금", "토"};       // 1부터 일요일이라는 값을 가져서 첫 값은 빈 문자열 설정

        Calendar date1 = Calendar.getInstance();
        Calendar date2 = Calendar.getInstance();

        date1.set(2023, 1, 20);     // 2023년 2월 20일로 셋팅
        System.out.println("date1은 " + toString(date1) + DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)] + "요일입니다.");
        System.out.println("date2은 " + toString(date2) + DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)] + "요일입니다.");

    }

    public static String toString(Calendar date){
        return date.get(Calendar.YEAR)+"년 " + (date.get(Calendar.MONTH) + 1) + "월 " + date.get(Calendar.DATE) + "일 ";
    }
}
