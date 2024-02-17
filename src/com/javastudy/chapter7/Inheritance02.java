package com.javastudy.chapter7;

class Tv{
    boolean power;
    int channel;
    void power(){
        power = !power;
    }
    void channelUp(){
        ++channel;
    }
    void chanelDown(){
        --channel;
    }
}
class SmartTv extends Tv{
    boolean caption;        // 자막
    SmartTv(boolean power, int channel, boolean caption){
        this.power = power;
        this.channel = channel;
        this.caption = caption;
    }

    public SmartTv() {

    }

    void displayCaption(String text){
        if (caption){       // 자막이 켜져잇을 때만 text 출력
            System.out.println(text);
        }
    }
}
public class Inheritance02 {
    public static void main(String[] args){
        SmartTv stv = new SmartTv(true, 10, false);     // Tv를 상속받아서 인스턴스 변수로 지정을 안해도 사용 가능
        System.out.println(stv.power + " " + stv.channel + " " + stv.caption);

        stv.channelUp();
        System.out.println(stv.power + " " + stv.channel + " " + stv.caption);
        stv.displayCaption("Caption1 ~~");
        stv.caption = !stv.caption;
        stv.displayCaption("Caption2 ~~");

    }
}
