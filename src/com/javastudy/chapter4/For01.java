package com.javastudy.chapter4;

public class For01 {
    public static void main(String args[]) {
        /**
         * for문
         *  for(int i=1; i<=5; i++){
         *      System.out.println("Java Study");
         *  }
         *
         *  위 for문은 i가 1부터 5까지 1씩 증가할 때 "Java Study"를 출력한다는 의미다.
         *  즉, 5번 출력
         */

        for (int i = 1; i <= 5; i++) {
            System.out.printf("%d 번쨰 출력 Java Study\n", i);
        }
    }
}
