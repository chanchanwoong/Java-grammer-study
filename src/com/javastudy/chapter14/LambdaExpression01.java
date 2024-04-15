package com.javastudy.chapter14;

import java.util.Arrays;

/**
 * 람다식
 *  메서드를 하나의 식으로 표현한 것(익명함수)
 *  자바는 함수라는 말이 없는데 왜 함수라고 하냐? -> 자바는 객체지향 언어지만, 함수형 언어의 기능이 추가되어서 이렇게 표현이 된 것!
 *  람다식은 사실 객체다! -> 함수가 아님! 자바에는 함수가 없으니깐!
 *      그래서 람다식은 참조변수가 필요하다. 객체니깐!
 *
 * 람다식 만드는 방법
 *  메서드에서 이름과 반환타입을 제거하고 매게변수 선언부와 몸통 사이에 "->"를 추가한다.
 *  반환값이 있는 경우, 식이나 값만 적고 return문 생략이 가능하며 ";"을 붙히지 않는다.
 *  return문은 대부분 생략 가능하다.
 *  매개변수 타입이 추론 가능하면 생략한다.
 *
 * 왜 람다식을 쓰는가?
 *  코드가 간결해진다.
 *  연산을 최소화해서 메모리 사용을 최소화한다.
 *  병렬처리가 가능하다.
 */


public class LambdaExpression01 {


    public static void main(String[] args) {
//        Object obj = (a, b) -> a > b ? a : b;
        Object obj = new Object() {
            int max(int a, int b) {
                return a > b ? a : b;
            }
        };
        int value = obj.max(3, 5);
    }
}