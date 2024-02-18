package com.javastudy.chapter8;

public class ExceptionHandling08 {
    /**
     * 사용자 정의 예외
     *  필요에 따라 새로운 예외 클래스를 정의할 수 있다.
     *  Exception클래스로부터 상속받아서 예외 클래스를 만들 수 있다.
     */
    public static void main(String args[]){
        try{
            startInstall();     // 프로그램 설치 진행, 추후 필수로 삭제해야 한다.
            copyFiles();
        }catch(SpaceException se){
            System.out.println("에러 메세지 : " + se.getMessage());
            se.printStackTrace();
            System.out.println("공간 확보 후 다시 설치바랍니다.");
        }catch(MemoryException me){
            System.out.println("에러 메세지 : " + me.getMessage());
            me.printStackTrace();
            System.gc();        // Garbage Collection을 수행해서 메모리를 확보한다.
            System.out.println("다시 설치를 시도하시기 바랍니다.");
        }finally {
            deleteTempFiles();      // 필수로 임시파일을 삭제한다.
        }
    }
    static void startInstall() throws SpaceException, MemoryException{
        if(!enoughSpace()){     // 충분한 설치 공간이 없은 경우
            throw new SpaceException("설치할 공간이 부족합니다.");
        }
        if(!enoughMemory()){    // 충분한 메모리가 없는 경우
            throw new MemoryException("메모리가 부족합니다.");
        }
        // 설치 코드~
    }
    static void copyFiles(){
        // 파일 복사 코드
    }
    static void deleteTempFiles(){
        // 임시파일 삭제 코드
    }
    static boolean enoughSpace(){
        return false;
    }
    static boolean enoughMemory(){
        return true;
    }
}
// 공간 부족 예외 클래스
class SpaceException extends Exception{
    SpaceException(String msg){
        super(msg);
    }
}
// 메모리 부족 예외 클래스
class MemoryException extends Exception{
    MemoryException(String msg){
        super(msg);
    }
}
