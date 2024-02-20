package com.javastudy.chapter10;

import java.util.Calendar;
import java.util.Date;

public class CalendarClass01 {
    /**
     * 시간과 날짜를 제공하는 Class는 Date, Calendar, Time 3가지가 있다.
     * 가장 오래된 Date 클래스는 대부분이 Deprecated 상태이다.(자바 API에서 지원하지 않는 메서드를 의미한다.)
     * Calendar 클래스도 잘 사용되지 않고 Time 클래스를 주로 사용한다.
     *      그래도 Calendar 클래스의 경우는 종종 사용되고 있어서 중요한 기능만 학습한다.
     *
     * Calendar 클래스는 추상클래스이기 때문에 직접 객체를 생성할 수 없고, getInstance() 메서드로 객체를 생성한다.
     */
    public static void main(String args[]){
        System.out.println("Date클래스 인스턴스 new Date() = " + new Date());

        Calendar today = Calendar.getInstance();
        System.out.println("현재 년도 = " + today.get(Calendar.YEAR));
        System.out.println("현재 월 = " + (today.get(Calendar.MONTH)+1));
        System.out.println("현재는 이 해의 몇 째 주 = " + today.get(Calendar.WEEK_OF_YEAR));
        System.out.println("현재는 이 달의 몇 째 주 = " + today.get(Calendar.WEEK_OF_MONTH));
        System.out.println("이 달의 몇 일 = " + today.get(Calendar.DATE));
        System.out.println("이 달의 몇 일 = " + today.get(Calendar.DAY_OF_MONTH));
        System.out.println("이 해의 몇 일 = " + today.get(Calendar.DAY_OF_YEAR));
        System.out.println("현재 요일(1~7)로 1은 일요일 = " + today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println("현재 시간(0~11) = " + today.get(Calendar.HOUR));
        System.out.println("현재 시간(0~23) = " + today.get(Calendar.HOUR_OF_DAY));
        System.out.println("현재 분 = " + today.get(Calendar.MINUTE));
        System.out.println("현재 초 = " + today.get(Calendar.SECOND));
    }
}
