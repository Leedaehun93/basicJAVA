package chap07.sec01.exam04;

/**
 * packageName : chap07.sec01.exam04
 * fileName : CellPhone
 * author : L.DH
 * date : 2023-09-21
 * description : 부모 클래스(공통속성, 공통함수)
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-21         L.DH         최초 생성
 */
public class CellPhone {
// 속성 : 공통속성(일반적인)
    String model;   // 휴대폰 기종(삼성, 애플)
    String color;   // 색깔

// 함수 : 기능
    /**
     * 전원 켜기 함수
     */
    void powerOn() {
        System.out.println("전원을 켭니다.");
    }
    /**
     * 전원 끄기 함수
     */
    void powerOff() {
        System.out.println("전원을 끕니다.");
    }

    /**
     * 벨을 울리는 함수
     */
    void bell() {
        System.out.println("벨이 울립니다.");
    }

    /**
     * 통화기능 함수 : 보내는 기능(송신)
     */
    void sendVoice(String message) {
        System.out.println("나 : " + message);
    }

    /**
     * 통화기능 함수 : 받는 기능(수신)
     */
    void receiveVoice(String message) {
        System.out.println("상대방 : " + message);
    }

    /**
     * 전화 끊기 기능
     */
    void hangUp() {
        System.out.println("전화를 끊습니다.");
    }
}