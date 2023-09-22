package chap07.verify.exam09;

/**
 * packageName : chap07.verify.exam09
 * fileName : LaserPrinter
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
public class LaserPrinter extends Printer {
    @Override
    public void print() {
        System.out.println("레이저프린터로 업그레이드 했습니다.");
    }

}
