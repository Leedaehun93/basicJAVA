package chap07.sec03.exam02;

/**
 * packageName : chap07.sec03.exam02
 * fileName : Animal
 * author : L.DH
 * date : 2023-09-22
 * description : 추상클래스 / 추상함수(메소드)
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-22         L.DH         최초 생성
 */
public abstract class Animal {
    public String kind; // 종류(종)

    public void breathe() {
        System.out.println("숨을 쉽니다.");
    }

//  TODO: 추상 함수 만들기
//   사용법 : 접근제한자 abstract 리턴자료형 함수명();
//   함수의 선언부(정의부)만 있고, 실행블럭 {} 이 없음
//   특징 : 자식클래스에서 무조건 오버라이딩 함수를 만들어야함
    public abstract void sound();
}
