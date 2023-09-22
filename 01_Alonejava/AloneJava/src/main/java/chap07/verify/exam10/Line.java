package chap07.verify.exam10;

/**
 * packageName : chap07.verify.exam10
 * fileName : Line
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
public class Line extends Shape {
    @Override
    public void draw() {
        System.out.println("Line");
    }
}
