package chap07.sec03.exam02;

/**
 * packageName : chap07.sec03.exam02
 * fileName : Cat
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
public class Cat extends Animal {
//  생성자 : alt + insert
    public Cat() {
        this.kind = "포유류";
    }

// 재정의 함수 제작 : alt + insert
// TODO : 메소드 구현(구현할 메서드 선택) : 필수적으로 재정의를 해야할 함수를 알려줌
    @Override
    public void sound() {
        System.out.println("야옹");
    }
}


