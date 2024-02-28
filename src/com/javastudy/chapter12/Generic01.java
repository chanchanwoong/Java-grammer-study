package com.javastudy.chapter12;

/**
 * 제네릭스
 *  다양한 타입의 객체들을 다루는 메서드나 컬렉션 클래스에 컴파일 시의 타입 체크를 해주는 기능
 *  기존에는 여러 타입쓸 때는, Object를 사용해서 형변환을 필수로 해야했다.
 *      그러나, 제네릭을 사용하면 원하는 타입을 지정하기만 하면 된다.
 *
 * 제네릭스의 장점
 *  1. 타입 안정성을 제공한다.
 *      의도치 않은 타입의 객체 저장을 막는다.
 *  2. 타입체크와 형변환을 생략할 수 있으므로 코드가 간결해진다.
 *
 * 제네릭 사용해서 클래스 선언 방법
 *  class BOX<T> {}     // BOX라는 원시타입 클래스에 T라는 타입 변수를 선언한다.
 *
 * 제네릭 클래스 사용 방법
 *  Box<String> b = new Box<String>();
 *  Box<Integer> b = new Box<Integer>();
 *  Box<Boolean> b = new Box<Boolean>();
 *  등 제네릭 안에 여러 타입을 대입할 수 있다.
 */
public class Generic01 {
}
