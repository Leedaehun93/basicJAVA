package chap07.sec01.exam06;

/**
 * packageName : chap07.sec01.exam06
 * fileName : SportsCar
 * author : L.DH
 * date : 2023-09-21
 * description : 자식 클래스
 * 요약 : 함수 재정의 : final void stop() : 재정의 안됨 : final 함수
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-21         L.DH         최초 생성
 */
public class SportsCar extends Car {
// 함수(메소드) 재정의 : speedUp() : alt + insert
    @Override
    public void speedUp() {
        speed += 10;    // 스포츠카 속도
        System.out.println(speed);
    }
// TODO : 함수 재정의 : final void stop() : 재정의 안됨 : final 함수
}
