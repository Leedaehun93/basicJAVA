package chap06.Sec05.exam03;

/**
 * packageName : chap06.Sec05.exam03
 * fileName : Car
 * author : L.DH
 * date : 2023-09-21
 * description :    정적(공유) 속성/함수 사용시 주의점(참고)
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-21         L.DH         최초 생성
 */
public class Car {
    // 속성
    int speed;

    // 함수
    void run() {
        System.out.println(speed + "으로 달립니다.");
    }

    public static void main(String[] args) {
//        this.speed; // TODO : 에러 발생(일반 속성을 자유롭게 사용 할 수 없음)
//        TODO : 같은 클래스라도 객체를 생성해서 속성을 사용해야 함
        Car car = new Car();
        car.speed = 60;
        car.run();
    }

} // end of class