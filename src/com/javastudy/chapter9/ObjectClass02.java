package com.javastudy.chapter9;

public class ObjectClass02 {
    /**
     * equals() 메서드
     *  주소값을 이용해서 두 객체를 비교한다. 즉, 멤버변수의 값이나 이런것들은 상관이 없다.
     *  서로 다른 두 개의 객체가 같은 주소를 갖는 일은 없다.
     *      그러나, 두 개의 참조변수가 같은 주소값을 갖는 것은 가능하다.
     */
    public static void main(String args[]){
        Value v1 = new Value(10);
        Value v2 = new Value(10);

        if(v1.equals(v2)){      // 인스턴스의 주소값이 다르므로 항상 다르다.
            System.out.println("v1과 v2는 같습니다.");
        }else{
            System.out.println("v1과 v2는 다릅니다.");
        }
    }
}
class Value{
    int value;
    Value(int value){
        this.value = value;
    }
}
