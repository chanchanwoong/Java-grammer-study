package com.javastudy.chapter11;

import java.util.HashMap;
import java.util.Scanner;

public class Map02 {
    /**
     * HashMap
     *  Map 인터페이스 구현한 것으로 키(key), 값(value) 쌍 특징을 가져간다.
     *  HashMap은 해싱을 사용해 많은 양의 데이터를 검색하는데 뛰어나다.
     *      해싱 : 키 값을 해시함수로 변환하는 과정
     *
     *  key는 유일해야 하며, value는 중복이 허용된다.
     *
     *  메서드
     *      HashMap() : HashMap 객체 생성
     *      HashMap(Map m) : 지정된 Map의 모든 요소를 포함하는 HashMap 객체 생성
     *      void clear() : HashMap 객체 모든 요소를 제거
     *      boolean containsKey(Object key) : HashMap에 지정된 key가 포함되어있는지 확인
     *      boolean containsValue(Object value) : HashMap에 지정된 value가 포함되어이슨ㄴ지 확인
     *      Set entrySet() : HashMap에 저장된 키와 값을 엔트리 형태로 Set에 저장 및 반환
     *      Object get(Object key) : 지정된 키의 값을 반환
     *      Object getOrDefault(Object key, Object defaultValue) : 지정된 키와 값을 반환하는데, 키가 없으면 기본값 반환
     *      boolean isEmpty() : HashMap이 비었는지 확인
     *      Set keySet() : HashMap에 젖아된 모든 키가 저장된 Set반환
     *      Object put(Object key, Object value) : 지정된 키와 값을 HashMap에 저장
     *      void putAll(Map m) : Map에 저장된 모든 요소를 HashMap에 저장
     *      Object remove(Object key) : HashMap에 지정된 키로 저장된 값 제거
     *      Object replace(Object key, Object value) : 지정된 키의 값을 새로운 value로 대채
     *      int siez() : HashMap에 저장된 요소 개수 반환
     */
    public static void main(String args[]){
        HashMap map = new HashMap();
        map.put("myId","1234");
        map.put("asdf","1111");
        map.put("asdf","새로운 값");        // key 값이 일치한 상태에서 put 메서드를 사용하면 기존 value는 갱신된다.

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("id와 pw를 입력해주세요.");
            System.out.print("id > ");
            String id = sc.next().trim();
            System.out.print("pw > ");
            String pw = sc.next().trim();
            System.out.println();

            if(!map.containsKey(id)){
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
                continue;
            }
            if(!(map.get(id)).equals(pw)){
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
            } else{
                System.out.println("id/pw 일치합니다. 반갑습니다.");
                break;
            }
        }
    }
}
