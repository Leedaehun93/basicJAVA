package chap06.Sec06.exam06;

/**
 * packageName : chap06.Sec06.exam06
 * fileName : Car
 * author : L.DH
 * date : 2023-09-21
 * description : 객체 지향 코딩 샘플
 * 요약 :
 * 1) 속성 : 외부 객체에서 속성 접근 못하게 막기 : private 자료형 속성;
 * 2) 함수 : 외부 객체에서 함수 2개 제공 : public setter(), public getter() 함수
 * setter 함수 : 속성에 값을 저장하는 함수     ex) set속성명()
 * getter 함수 : 속성에 현재값을 확인하는 함수  ex) get속성명()
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-21         L.DH         최초 생성
 */
public class Car {
    //      TODO : 속성, 생성자, 함수(메소드)
//      속성(필드)
// TODO : private 외부에서 사용불가 내부 클래스에서 적용
    private int speed;  // 속도
    private boolean stop; // 상태
    int defaultValue;   // default 테스트 속성

//  생성자 생략
//  TODO  : 함수 : speed 속성(setter/getter), stop 속성(setter/getter) : alt + insert


    public int getSpeed() {
        return speed;
    }

    /**
     * 자동차의 속도(speed) 를 저장/수정하는 함수
     * 속도계 : 음수가 나오면 안됨(음수가 나오면 0으로 강제 저장)
     *
     * @param speed
     */
//  TODO : this. 이용시 버그의 가능성이 있어 if 문 이용하여 코드 수정
    public void setSpeed(int speed) {
        if (speed < 0) {
            this.speed = 0;
            return; // berak (함수에서)
        }
        // 아니면 그냥 저장
        this.speed = speed;
    }

    // TODO : boolean으로 getter를 생성하면  is로 생성함
    public boolean isStop() {
        return stop;
    }

    /**
     * 자동차 정지하면 속도 = 0 이 되야함
     *
     * @param stop
     */
//  TODO : this. 이용시 버그의 가능성이 있어 if 문 이용하여 코드 수정
    public void setStop(boolean stop) {
        this.stop = stop;
//      속도 = 0
        this.speed = 0;
    }
}