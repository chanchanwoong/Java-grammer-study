package com.javastudy.chapter7;

public class Modifier05 {
    /**
     * 접근 제어자(access modifier)
     *  외부에서 접근하지 못하도록 범위를 제한한다.
     *  클래스의 내부에 선언된 데이터를 보호하기 위함이다. (데이터가 유효한 값을 유지하기 위함)
     *      이것이, 객체지향개념의 캡슐화이다!
     *
     *  접근 제어자 사용가능 한 곳
     *      클래스, 멤버변수, 메서드, 생성자
     *
     *  private : 같은 클래스 내에서만 접근 가능하다. 외부에서 접근할 필요가 없는 멤버들을 private로 지정한다.
     *  default : 같은 패키지 내에서만 접근이 가능하다. 실제로 접근 제어자를 안붙히면 default로 지정된다.
     *  protected : 같은 패키지 내에서, 또는 패키지에 관계없이 상속관계에 있는 자손클래스에서 접근 가능하다.
     *  public : 접근 제한이 전혀 없다.
     */
}

class Time {
    // 직접 데이터에 접근하지 못하게 private 접근 제어자로 제한을 뒀다.
    // 조회 또는 변경할려면 getter, setter를 사용한다.
    private int hour;
    private int minute;
    private int second;

    public int getHour(){
        return hour;
    }
    public void setHour(int hour){
        if (hour < 0 || hour > 23) return;
        this.hour = hour;
    }
    public int getMinute() {
        return minute;
    }
    public void setMinute(int minute){
        if (minute < 0 || minute > 59) return;
        this.minute = minute;
    }
    public int getSecond() {
        return second;
    }
    public void setSecond(int second){
        if (second < 0 || second > 59) return;
        this.second = second;
    }
}