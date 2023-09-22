package chap06.Sec06.exam06;

/**
 * packageName : chap06.Sec06.exam06
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
        Car car = new Car();

//      TODO : 테스트 : 속도 음수 넣기
        car.setSpeed(-50);
//      결과 출력
        System.out.println("현재 속도 : " + car.getSpeed());    // 현재 속도 : 0
//      TODO : 테스트 확인 : 정상

//      TODO : 올바른 속도 변경 : 60
        car.setSpeed(60);
//      결과 출력
        System.out.println("현재 속도 : " + car.getSpeed());    // 현재 속도 : 60
//      TODO : 속도 확인 : 정상

//      멈춤
        if(!car.isStop()) {      // 자동차 상태 읽기    // TODO : 가정 : 자동차 속도가 0이(멈춤) 이 아니라면
            car.setStop(true);   // 자동차 멈춤        // TODO : 가정 :  속도 0으로 만들어라
        }
        System.out.println("현재 속도 : " + car.getSpeed());    // 현재 속도 읽기
    }

}