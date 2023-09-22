package chap07.verify.exam13;

/**
 * packageName : chap07.verify.exam13
 * fileName : DriverApplication
 * author : ds
 * date : 2022-09-30
 * description : 실행 클래스, 연습문제)인터페이스
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-30         ds          최초 생성
 */
// TODO: 연습문제) 매개변수의 다형성 예제(인터페이스 이용)
//      아래 결과를 보고
//      Driver(전략클래스) 클래스, Bus 클래스 , Taxi 클래스를 완성하세요
// 결과 :
//    버스가 달립니다.
//    택시가 달립니다.
public class DriverApplication {
    public static void main(String[] args) {
        Driver driver = new Driver();

        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        driver.drive(bus); // 버스가 달립니다.
        driver.drive(taxi);// 택시가 달립니다.
    }
}