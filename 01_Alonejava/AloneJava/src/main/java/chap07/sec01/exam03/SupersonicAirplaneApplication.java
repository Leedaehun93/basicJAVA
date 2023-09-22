package chap07.sec01.exam03;

/**
 * packageName : chap07.sec01.exam03
 * fileName : SupersonicAirplaneApplication
 * author : L.DH
 * date : 2023-09-21
 * description :    실행 클래스
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-21         L.DH         최초 생성
 */
public class SupersonicAirplaneApplication {
    public static void main(String[] args) {
//      자식 객체 생성
        SupersonicAirplane supersonicAirplane = new SupersonicAirplane();

//      비행기 이륙
        supersonicAirplane.takeOff();   // 부모 이륙 함수
        supersonicAirplane.fly();       // 부모 비행 함수

//      TODO : 모드 변경 기본 -> 슈퍼소닉 모드(초음속 비행)
        supersonicAirplane.flyMode = SupersonicAirplane.SUPRESONIC;
        supersonicAirplane.fly();   // 부모 fly() vs 자식 fly() (win)
        supersonicAirplane.land();  //  부모 착륙 함수

    }
}
