package com.javastudy.chapter12;

/**
 * 열거형(enum)
 *  여러 상수를 선언해야 할 때, 편리하게 선언할 수 있는 방법
 *
 * enum 선언 방법
 *  enum 열거형이름 {상수명1, 상수명2, ,,, }
 *
 * enum에 정의된 상수 사용 방법
 *  열거형이름.상수명
 */
enum Direction { EAST, SOUTH, WEST, NORTH }
public class Enum01 {
    public static void main(String args[]){
        Direction d1 = Direction.EAST;
        Direction d2 = Direction.valueOf("WEST");
        Direction d3 = Enum.valueOf(Direction.class, "NORTH");
        Direction d4 = Enum.valueOf(Direction.class, "EAST");

        System.out.println("d1 > " + d1);
        System.out.println("d2 > " + d2);
        System.out.println("d3 > " + d3);
        System.out.println("d4 > " + d4);

        System.out.println("d1 == d2 결과 " + (d1==d2));
        System.out.println("d1 == d3 결과 " + (d1==d3));
        System.out.println("d1 == d4 결과 " + (d1==d4));

        Direction[] dArr = Direction.values();
        for(Direction d : dArr){
            System.out.printf("%s=%d%n", d.name(), d.ordinal());
        }
    }
}
