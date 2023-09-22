package chap07.verify.exam12;

/**
 * packageName : chap07.verify.exam12
 * fileName : DeskTop
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
public class DeskTop extends Computer {
    @Override
    public void display() {
        System.out.println("DeskTop Display()");
    }

    @Override
    public void typing() {
        System.out.println("DeskTop Typing()");
    }

}
