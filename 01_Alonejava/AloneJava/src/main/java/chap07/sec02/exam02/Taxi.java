package chap07.sec02.exam02;

/**
 * packageName : chap07.sec02.exam02
 * fileName : Taxi
 * author : L.DH
 * date : 2023-09-22
 * description : 택시 자식 클래스
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-22         L.DH         최초 생성
 */
public class Taxi extends Vehicle {
    //  run() 오버라이딩하세요 : alt + insert : "택시가 달립니다."
    @Override
    public void run() {
        System.out.println("택시가 달립니다.");
    }
}
