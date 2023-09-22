package chap08.exam01;

/**
 * packageName : chap08.exam01
 * fileName : SmartTelevisionApplication
 * author : L.DH
 * date : 2023-09-22
 * description : 실행클래스
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-22         L.DH         최초 생성
 */
public class SmartTelevisionApplication {
    public static void main(String[] args) {
//      TODO: 인터페이스/추상클래스 객체 생성이 안됨
        SmartTelevision smartTelevision = new SmartTelevision();

//      TODO: 다형성 이용
        RemoteControl remoteControl = smartTelevision;
        Searchable searchable = smartTelevision;

//      기능 이용하기
        remoteControl.turnOn();   // tv 기본기능 이용
        remoteControl.turnOff();
        searchable.search("www.naver.com"); // 검색 이용
    }

}
