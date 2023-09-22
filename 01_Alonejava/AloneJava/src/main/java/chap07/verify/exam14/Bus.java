package chap07.verify.exam14;

/**
 * packageName : chap07.verify.exam14
 * fileName : Bus
 * author : L.DH
 * date : 2023-09-22
 * description :
 * 요약 : 자식 클래스
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-22         L.DH         최초 생성
 */
public class Bus implements Vehicle {

    public void run() {
        System.out.println("버스가 달립니다.");
    }
    void checkFare(){
        System.out.println("승차요금을 체크합니다.");
    }

}