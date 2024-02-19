package com.javastudy.chapter9;

import java.util.*;

public class StringClass03 {
    /**
     * String 클래스의 메서드
     *  char charAt(int index) : 지정된 위치에 있는 문자를 반환
     *  String concat(String str) : 문자열을 뒤에 덧붙인다.
     *  boolean contains(CharSequence s) : 지정된 문자열이 포함되었는지 확인한다.
     *  boolean endsWith(String suffix) : 지정된 문자열로 끝나는지 확인한다.
     *  boolean equalsIgnoreCase(String str) : 문자열을 대소문자 구분없이 비교한다.
     *  int indexOf(int ch) : 주어진 문자의 위치를 반환한다. 없으면 -1 반환한다.
     *                          ch로 문자를 입력받는다. 그러나, 유니코드로 해석되기 때문에 int 타입인 것!
     *  int indexOf(int ch, int pos) : ch문자가 문자열에 존재하는지 지정된 pos 위치부터 확인하여 위치를 반환한다.
     *  int indexOf(String str) : str문자열의 위치를 반환한다.
     *  int lastIndexof(int ch) : 지정된 문자를 오른쪽 부터 찾아 위치를 반환한다.
     *  int lastIndexOf(String str) : str문자열을 오른쪽 부터 찾아 위치를 반환한다.
     *  int length() : 문자열의 길이를 반환
     *  String replace(char old, char nw) : old 문자를 새로운 문자 nw로 바꿔 반환한다.
     *  String replace(CharSequence old, CharSequence nw) : old 문자열을 새로운 문자열 nw로 바꿔 반환한다.
     *  String replaceAll(String regex, String replacement) : 지정된 문자열 regex와 일치하는 것을 새로운 문자열 replacement로 모두 변경한다.
     *  String relaceFirst(String regex, String replacement) : regex 문자열과 일치하는 것 중 첫 번째 것만 새로운 문자열로 변경한다.
     *  String[] split(String regex) : 분리자 regex로 나눠 문자열 배열로 반환한다.
     *  String[] split(String regex, int limit) : 분리자 regex로 나눠 총 limit 크기의 문자열배열에 담아 반환한다.
     *  boolean startWith(String prefix) : 주어진 prefix 문자열로 시작하는지 검사한다.
     *  String substring(int begin, int end) : 시작위치부터 끝 위치 범위의 문자열을 반환한다. end가 없으면 끝까지 반환한다.
     *  String toLowerCase() : 문자열을 소문자로 변환하여 반환한다.
     *  String toUpperCase() : 문자열을 대문자로 변환하여 반환한다.
     *  String trim() : 왼쪽 긑과 오른쪽 끝에 있는 공백을 없애고 반환한다.
     *  static String valuesOf(기본타입) : 기본 값을 문자열로 변환하여 반환한다.
     */
    public static void main(String args[]){
        // charAt
        String s = "012345";
        System.out.println("s.charAt(1) = " + s.charAt(1));

        // concat
        System.out.println("s.concat(\"는 숫자입니다.\") = " + s.concat("는 숫자입니다.") );

        // contains
        System.out.println("s.contains(\"34\") = " + s.contains("34"));

        // endsWith
        String s1 = "Hello.txt";
        System.out.println("s1.endsWith(\".txt\") = " + s1.endsWith("txt"));

        // equalsIgnoreCase
        System.out.println("s1.equalsIgnoreCase(\"hELLO.TXT\") = " + s1.equalsIgnoreCase("hELLO.TXT"));

        // indexOf
        System.out.println("s1.indexOf('t') = " + s1.indexOf('t'));
        System.out.println("s1.indexOf('t', int 7) = " + s1.indexOf('t', 7));
        System.out.println("s1.indexOf(\"txt\") = " + s1.indexOf("txt"));

        // lastIndexOf
        String s2 = "java.lang.java";
        System.out.println("s2.lastIndexOf(\"java\") = " + s2.lastIndexOf("java"));

        // length
        System.out.println("s2.length() = " + s2.length());

        // replace
        System.out.println("s2.replace('.', '!') = " + s2.replace('.', '!'));

        // replaceAll
        System.out.println("s2.replaceAll(\"va\", \"to\") = " + s2.replaceAll("va", "to"));

        // split
        System.out.println("s2.split(\".\") = " + Arrays.toString(s2.split("\\.")));        // .은 정규식으로 표현해야 한다.
        System.out.println("s2.split(\".\", 2) = " + Arrays.toString(s2.split("\\.", 2)));

        // startsWith
        System.out.println("s2.startsWith(\"ja\") = " + s2.startsWith("ja"));

        // substring
        System.out.println("s2.substring(10) = " + s2.substring(10));
        System.out.println("s2.substring(10, 12) = " + s2.substring(10,12));

        // valueOf
        System.out.println("String.valueOf(true) = " + String.valueOf(true));
        System.out.println("String.valueOf('a') = " + String.valueOf('a'));
        System.out.println("String.valueOf(100) = " + String.valueOf(100));
        System.out.println("String.valueOf(100L) = " + String.valueOf(100L));
        System.out.println("String.valueOf(10.0) = " + String.valueOf(10.0));
        System.out.println("String.valueOf(new java.tuil.Date()) = " + String.valueOf(new java.util.Date()));
    }
}
