package chap07.sec02.exam02;

/**
 * packageName : chap07.sec02.exam02
 * fileName : DriverApplictaion
 * author : L.DH
 * date : 2023-09-22
 * description : 실행 클래스 / 매개변수의(함수) 다형성
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-22         L.DH         최초 생성
 */
public class DriverApplictaion {
    public static void main(String[] args) {
//      전략 클래스 : Driver(운전자) 객체 생성
        Driver driver = new Driver();
        
//      자식 객체 : Bus, Taxi 생성
        Bus bus = new Bus();
        Taxi taxi = new Taxi();

//      TODO : 매개변수의 다형성 이용 : 객체에 따라 결과가 달라짐
        driver.drive(bus);   // bus 자식 객체 ? // 결과 : 버스가 달립니다.
        driver.drive(taxi);  // bus 자식 객체 ? // 결과 : 택시가 달립니다.


    }
}
