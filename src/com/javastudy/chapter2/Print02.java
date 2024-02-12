package com.javastudy.chapter2;

public class Print02 {
    public static void main(String args[]){
        /**
         * printf : 지시자를 통해 변수의 값을 여러 가지 형식으로 변환하여 출력 가능하다.
         * 지시자 종류 : %d(10진수), %x(16진수), %f(부동 소수점), %c(문자), %s(문자열), %n(줄바꿈)
         */

        String url = "www.code.com";
        float f1 = .10f;
        float f2 = 1e1f;
        float f3 = 3.14e4f;
        double d = 1.23456789;

        System.out.printf("f1=%f, %e, %g%n", f1, f1, f1);
        System.out.printf("f2=%f, %e, %g%n", f2, f2, f2);
        System.out.printf("f3=%f, %e, %g%n", f3, f3, f3);
        System.out.printf("d=%f%n", d);
        System.out.printf("d=%14.10f%n", d);    // %전체자리.소수점아래자리f 형식으로 전체 14자리 중 소수점 아래 10자리 출력
        System.out.printf("[%s]%n", url);
        System.out.printf("[%20s]%n", url);     // [        www.code.com]
        System.out.printf("[%-20s]%n", url);    // [www.code.com        ]
        System.out.printf("[%.8s]%n", url);     // [www.code]
    }
}
