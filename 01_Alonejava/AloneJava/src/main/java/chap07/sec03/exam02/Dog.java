package chap07.sec03.exam02;

/**
 * packageName : chap07.sec03.exam02
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
public class Dog extends Animal {
    // 생성자
    public Dog() {
        this.kind = "포유류";
    }

// 재정의 함수 제작 : alt + insert
    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}
