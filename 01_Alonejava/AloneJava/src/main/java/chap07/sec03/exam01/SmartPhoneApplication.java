package chap07.sec03.exam01;

/**
 * packageName : chap07.sec03.exam01
 * fileName : SmartPhoneApplication
 * author : L.DH
 * date : 2023-09-22
 * description : 실행 클래스
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-22         L.DH         최초 생성
 */
public class SmartPhoneApplication {
    public static void main(String[] args) {
//    객체 생성
//    TODO : Phone 추상클래스 : 생성 못함
//    Phone phone = new Phone("홍길동");
        SmartPhone smartPhone = new SmartPhone("홍길동");
//      TODO : 활용 : 자식 클래스를 만들어서 상속받아 사용해야함
//      TODO : 목적 : 프로젝트에서 개발자 많을 떄 함수이름과 속성이름을 통일시킬 목적으로 사용함
        smartPhone.turnOn();            // 전원켜기
        smartPhone.internetSearch();    // 인터넷 검색
        smartPhone.turnOff();           // 전원끄기
    }
}
