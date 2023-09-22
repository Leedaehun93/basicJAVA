package chap08.exam02;

/**
 * packageName : chap08.exam02
 * fileName : Dog
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
public class Dog implements Soundable {
//  메소드 구현 : alt + insert : 멍멍
    @Override
    public String sound() {
        return "멍멍";
    }


}
