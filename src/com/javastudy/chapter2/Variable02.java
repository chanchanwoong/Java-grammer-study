package com.javastudy.chapter2;

public class Variable02 {
    public static void main(String args[]){
        /**
         * 리터럴 타입과 접미사
         *  20억이 넘는 경우 int는 안되고 long 타입을 써야한다.
         *  그럼, long a = 2500000000 으로 선언하면 될까?
         *  안되다. 왜냐하면, 리터럴 값을 변수에 저장하기 전에 리터럴 값을 메모리에 저장하는데
         *      저장 형태가 무조건 int형 이기 때문이다.
         *      실수에서도 비슷하게 저장형태가 double이기 때문에, 접미사를 사용해서 저장해야 한다.
         *
         *  그래서!! 리터럴에 접미사를 붙혀서 진행한다.
         *  접미사의 경우 정수형과 실수형에서만 존재한다.
         *      정수형 : L
         *      실수형 : f, d
         */
//        int intNum = 2500000000L; 사이즈 이슈로 불가능
        long longNum = 2500000000L;
        float floatPi = 3.14f;
        double doublePi  = 3.14;
    }
}
