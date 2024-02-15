package com.javastudy.chapter7;

public class Inheritance06 {
    /**
     * super() 연산자
     *  조상의 생성자를 호출하는데 사용된다.
     */

    public static void main(String args[]){
        Point3D p = new Point3D(1,2,3);
        System.out.println(p.x + " " + p.y + " " + p.z);
    }
}
class Point {
    int x, y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}
class Point3D extends Point {
    int z;

    Point3D(int x, int y, int z){
        super(x,y);     // 조상클래스의 생성자 Point(int x, int y)를 호출
        this.z = z;
    }
}