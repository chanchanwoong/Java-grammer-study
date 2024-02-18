package com.javastudy.chapter9;

public class ObjectClass01 {
    /**
     * Object 클래스
     *  모든 클래스의 최고 조상 클래스이다.
     *  멤버변수는 없고, 11개의 메서드를 가지고 있다.
     *
     *  protected Object clone() : 객체 자신의 복사본을 반환
     *  public boolean equals(Object obj) : 객체 자신과 obj가 같은 객체이면 true 반환
     *  protected void finalize() : 객체 소멸될 때 가비지 컬렉터에 의해 자동적으로 호출되지만, 수행되야 할 코드가 있을 때 오버라이딩
     *  public Class getClass() : 클래스 정보를 담고 있는 Class인스턴스를 반환
     *  public int hashCode() : 객체 자신의 해시코드를 반환
     *  public String toString() : 객체 자신의 정보를 문자열로 반환
     *  public void notify() : 객체 자신을 사용하려고 기다리는 쓰레드를 하나만 깨운다.
     *  public void notifyAll() : 객체 자신을 사용하려고 기다리는 모든 쓰레드를 깨운다.
     *  public void wait(), public void wait(long timeout), public void wait(long timeout, int nanos)
     *      : 다른 쓰레드가 notify()나 notifyAll()을 호출할 때까지 현재 쓰레드를 무한히 또는 지정된 시간동안 기다리게 한다.
     */
}
