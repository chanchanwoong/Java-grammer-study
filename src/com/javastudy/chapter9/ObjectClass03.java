package com.javastudy.chapter9;

public class ObjectClass03 {
    /**
     * hashCode() 메서드
     *  해시함수를 구현한 메서드
     *  다량의 데이터를 저장하고 검색하는데 사용된다.
     *  찾고자 하는 값을 입력하면, 값이 저장된 위치를 알려주는 해시코드를 반환한다.
     *
     *  객체의 주소값을 이용해서 해시코드를 만들어 반환하기 때문에 서로 다른 두 객체는 같은 해시코드를 가질 수 없다.
     *      그러나, JVM 주소 64bit에서 32bit 변환하면 중복 값이 나올 수 있다.
     *
     *  hashCode() 메서드는 인스턴스 변수(내용물)을 가지고 변환하기 때문에 다른 객체도 문자열이 같으면 해시코드가 같다.
     *
     *  인스턴스 변수를 이용해서 같은 객체 확인(동등성) 판단에는 equals() 메서드 뿐 아니라, hashCode() 또한 같아야 한다.
     *      그러나, 동일 주소를 가지는 지 확인(동일성)할려면 System.identityHashCode() 메서드를 이용한다.
     */
    public static void main(String args[]){
        String str1 = new String("abc");
        String str2 = new String("abc");
        String str3 = str2;

        System.out.println(str1.equals(str2));  // 동등성 확인
        System.out.println(str1.hashCode());    // 동등성 확인
        System.out.println(str2.hashCode());    // 동등성 확인
        System.out.println(str3.hashCode());    // 동등성 확인
        System.out.println(System.identityHashCode(str1));      // 동일성 확인
        System.out.println(System.identityHashCode(str2));      // 동일성 확인
        System.out.println(System.identityHashCode(str3));      // 동일성 확인
    }
}

