package chap07.sec02.exam02;

/**
 * packageName : chap07.sec02.exam02
 * fileName : Driver
 * author : L.DH
 * date : 2023-09-22
 * description : 전략 클래스 : 디자인 패턴(23)_행위(11)_전략 패턴 1
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-22         L.DH         최초 생성
 */
public class Driver {
//  TODO : 부모 객체 = 자식 객체(다형성)
//       정의 : drive(부모 클래스 부모객체) {} => drive(자식객체); (실행시에)
//             => 부모 객체 = 자식 객체(형태)
    public void drive(Vehicle vehicle) {
        vehicle.run();  // 부모 클래스의 run() 실행 : 오버라이딩에 의해 자식 run() 실행됨
    }

}
