package com.javastudy.chapter9;

public class StringBufferClass03 {
    /**
     * StringBuffer 메서드
     *  StringBuffer append(boolean b) : b를 문자열로 추가한다.
     *  StringBuffer append(char c) : c를 문자열로 추가한다.
     *  StringBuffer append(char[] str) : str를 문자열로 추가한다.
     *  StringBuffer append(double d) : d를 문자열로 추가한다.
     *  StringBuffer append(float f) : f를 문자열로 추가한다.
     *  StringBuffer append(int i) : i를 문자열로 추가한다.
     *  StringBuffer append(long l) : l를 문자열로 추가한다.
     *  StringBuffer append(Object obj) : obj를 문자열로 추가한다.
     *  StringBuffer append(String str) : str를 문자열로 추가한다.
     *  int capacity() : StringBuffer 인스턴스의 버퍼크기를 반환
     *  StringBuffer delete(int start, int end) : start부터 end 사이에 있는 문자를 제거한다. end는 포함안된다.
     *  StringBuffer deleteCharAt(int index) : 지정된 index의 문자를 제거한다.
     *  StringBuffer insert(int pos, boolean b) : pos 위치에 두번째 매개변수 값을 문자로 추가한다.
     *  StringBuffer insert(int pos, char c) : pos 위치에 두번째 매개변수 값을 문자로 추가한다.
     *  StringBuffer insert(int pos, char[] str) : pos 위치에 두번째 매개변수 값을 문자로 추가한다.
     *  StringBuffer insert(int pos, double d) : pos 위치에 두번째 매개변수 값을 문자로 추가한다.
     *  StringBuffer insert(int pos, float f) : pos 위치에 두번째 매개변수 값을 문자로 추가한다.
     *  StringBuffer insert(int pos, int i) : pos 위치에 두번째 매개변수 값을 문자로 추가한다.
     *  StringBuffer insert(int pos, long l) : pos 위치에 두번째 매개변수 값을 문자로 추가한다.
     *  StringBuffer insert(int pos, Object obj) : pos 위치에 두번째 매개변수 값을 문자로 추가한다.
     *  StringBuffer insert(int pos, String str) : pos 위치에 두번째 매개변수 값을 문자로 추가한다.
     *  int length() : StringBuffer에 저장된 문자열의 길이를 반환한다.
     *  StringBuffer replace(int start, int end, String str) : 지정된 범위의 문자들을 주어진 문자열로 바꾼다. end는 포함안된다.
     *  StringBuffer reverse() : StringBuffer에 저장된 문자열의 순서를 거꾸로 나열한다.
     *  String substring(int start) : start부터 문자열 끝까지 뽑아서 반환한다.
     *  String substring(int start, int end) : 지정된 범위 내의 문자열을 반환한다.
     */
    public static void main(String args[]){
        // append (추가)
        StringBuffer sb1 = new StringBuffer("abc");
        sb1.append(true);
        sb1.append("ABC");
        sb1.append(123).append('b');
        System.out.println(sb1);
        sb1.append(new Value(1000));        // 객체 추가하면 주소가 추가된다.
        System.out.println(sb1);

        // capacity
        System.out.println(sb1.capacity());

        // length
        System.out.println(sb1.length());

        // delete (삭제)
        sb1.delete(0,3);
        System.out.println(sb1);

        // deleteCharAt
        sb1.deleteCharAt(0);
        System.out.println(sb1);

        // insert (추가)
        sb1.insert(0, false);
        sb1.insert(1, 'q').insert(1, "insert");
        System.out.println(sb1);

        // replace
        sb1.replace(0, 1, "replace");
        System.out.println(sb1);

        // reverse
        System.out.println(sb1.reverse());

        // substring
        System.out.println(sb1.substring(3));
        System.out.println(sb1.substring(3,5));
    }
}
