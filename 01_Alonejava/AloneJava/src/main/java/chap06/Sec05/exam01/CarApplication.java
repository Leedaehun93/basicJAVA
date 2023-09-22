package chap06.Sec05.exam01;

/**
 * packageName : chap06.Sec05.exam01
 * fileName : CarApplication
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
public class CarApplication {
    public static void main(String[] args) {
//      객체 생성
        Car car = new Car("포르쉐");
        Car car2 = new Car("벤츠");

//      결과 출력
        car.run();  // 반복문 출력
        car2.run();  // 반복문 출력

    }   // end of main
}   // end of class
