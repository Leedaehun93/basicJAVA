package chap06.Sec04.exam05;

/**
 * packageName : chap06.Sec04.exam05
 * fileName : CarApplication
 * author : L.DH
 * date : 2023-09-20
 * description :    실행 클래스(main)
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-20         L.DH         최초 생성
 */
public class CarApplication {
    public static void main(String[] args) {
        Car car = new Car();
        car.keyTurnOn(); // 키를 돌립니다. 출력
        car.run(); // 5개의 달립니다.
        int speed = car.getSpeed(); // 현재 속도 값을 리턴 (getter 함수 : get속성명())
        System.out.println("현재속도:" + speed + "km/h");
    } // end of main

}   // end of calss