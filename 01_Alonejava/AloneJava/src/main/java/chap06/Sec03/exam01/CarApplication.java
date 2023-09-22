package chap06.Sec03.exam01;

/**
 * packageName : chap06.Sec03.exam01
 * fileName : CarApplication
 * author : L.DH
 * date : 2023-09-20
 * description :    실행 클래스 (main())
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-20         L.DH         최초 생성
 */
public class CarApplication {
    public static void main(String[] args) {
//  객체 생성 :
//  사용법 : 클래스명 객체명 = new 생성자함수();
//  2nd 생성자 함수 : Car(String color, int cc)
    Car car = new Car("검정", 3000);
    Car car2 = new Car("흰색", 2000);
    Car car3 = new Car("파랑", 2500);
//  결과 출력 : 1st 자동차(car)
    System.out.println(car.col);
    System.out.println(car.ccNum);

//  결과 출력 : 2nd 자동차(car2)
    System.out.println(car2.col);
    System.out.println(car2.ccNum);

//  결과 출력 : 3rd 자동차(car3)
    System.out.println(car3.col);
    System.out.println(car3.ccNum);

    } // end of main
} // end of class
