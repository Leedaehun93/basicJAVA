package chap07.verify.exam14;

/**
 * packageName : chap07.verify.exam14
 * fileName : VehicleApplication
 * author : ds
 * date : 2022-09-30
 * description : 실행 클래스, 연습문제)다형성 예제(인터페이스 이용)
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-30         ds          최초 생성
 */
// TODO: 연습문제) 아래 결과를 보고 Bus 클래스를 완성하세요.
// 결과 :
//    버스가 달립니다.
//    승차요금을 체크합니다.
public class VehicleApplication {
    public static void main(String[] args) {
        Vehicle vehicle = new Bus();

        vehicle.run(); // 버스가 달립니다.

        Bus bus = (Bus)vehicle; // 강제 타입 변환 (원복)

//        bus객체의 고유 함수 : checkFare()
        bus.checkFare();  // 승차요금을 체크합니다.
    }
}