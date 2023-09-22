package chap07.verify.exam13;

/**
 * packageName : chap07.verify.exam13
 * fileName : Taxi
 * author : L.DH
 * date : 2023-09-22
 * description : 자식 클래스
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-22         L.DH         최초 생성
 */
public class Taxi implements Vehicle {
    @Override
    public void run() {
        System.out.println("택시가 달립니다.");
    }
}