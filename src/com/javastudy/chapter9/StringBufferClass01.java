package com.javastudy.chapter9;

public class StringBufferClass01 {
    /**
     * StringBuffer 클래스
     *  String 클래스는 인스턴스 생성 시, 지정된 문자열을 변경할 수 없다.
     *      수정 시에는 계속 생성해줘야 한다.
     *  그러나, StringBuffer 클래스는 편집을 위한 buffer를 가지고 있어 편집이 가능하다.
     *      문자열 길이를 고려해 버퍼의 길이를 조절해야 한다.
     *      문자열의 길이는 StringBuffer의 생성자를 이용하여 조절한다.
     *          StringBuffer() : 기본 생성자로 16의 크기 버퍼
     *          StringBuffer(int n) : n의 크기 버퍼
     *          StringBuffer(String str) : str보다 16 더 큰 크기 버퍼
     *
     *  StringBuffer의 buffer 크기를 늘리고 싶으면, 새로운 StringBuffer 인스턴스를 만들고
     *      기존의 내용물을 복사해서 넣어줘야 한다.
     *
     *  StringBuffer를 사용하는게 문자열보다 빠르고 효율적이다!!
     */

}
