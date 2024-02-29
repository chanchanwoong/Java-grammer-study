package com.javastudy.chapter12;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * 와일드 카드
 *  제네릭 타입에 다형성을 적용하는 방법이다.
 *
 * <? extends T> : 와일드 카드의 상한 제한, T와 그 자손들만 가능하다.
 * <? super T> : 와일드 카드의 하한 제한, T와 그 조상들만 가능하다.
 * <?> : 제한이 없다. 모든 타입이 가능하면 <? extends Object> 와 동일하다.
 */
public class Generic04 {
    public static void main(String args[]){
        ArrayList<? extends Product> list1 = new ArrayList<Tv>();       // 가능!
        ArrayList<? extends Product> list2 = new ArrayList<Audio>();    // 가능!
    }
}
