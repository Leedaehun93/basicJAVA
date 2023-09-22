package chap06.Sec03.exam03;

/**
 * packageName : chap06.Sec03.exam03
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
//      객체 생성 : 모든 생성자 이용하기
        Car car1 = new Car();   // 기본 생성자
        Car car2 = new Car("자가용");   // 매개변수 1개짜리 생성자
        Car car3 = new Car("자가용", "빨강");   // 매개변수 2개짜리 생성자
        // 매개변수 3개짜리 생성자
        Car car4 = new Car("자가용", "빨강", 200);

//      결과 출력 : 2개 , 기본생성자 vs 4개 생성자
        System.out.println(car1.color);     // null
        System.out.println(car1.company);   // 현대자동차
        System.out.println(car1.maxSpeed);  // 0
        System.out.println(car1.model);     // null
        System.out.println("============");
        System.out.println(car4.color);     // 빨강
        System.out.println(car4.company);   // 현대자동차
        System.out.println(car4.maxSpeed);  // 200
        System.out.println(car4.model);     // 자가용
    }   // end of main

} // end of class