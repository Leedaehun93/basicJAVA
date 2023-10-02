package chap09.sec01.exam02;

/**
 * packageName : chap09.sec01.exam02
 * fileName : Outer
 * author : L.DH
 * date : 2023-10-02
 * description : 중첩 클래스 정의 후 각 속성/함수 위치에서 사용하기
 * 요약 :
 * 내부 클래스의 공유/일반 클래스 -> 외부 클래스에서 사용하기(일부 사용 제한)
 * => 공유 내부 클래스는 외부 클래스의 일반/공유 속성으로 모두 사용 가능
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-10-02         L.DH         최초 생성
 */
public class Outer {
    //  TODO : 일반 속성 클래스(샘플)
    class Attr {
    }

    //  TODO : 공유 속성 클래스(샘플)
    static class Share {
    }

    //  ---------------- 외부 클래스에서 사용하기
    // TODO : 속성, 생성자, 함수
    Attr attr = new Attr();     // 내부 클래스를 일반 속성으로 정의
    Share share = new Share();  // 공유 내부 클래스를 일반 속성의로 정의

    // TODO : 테스트 #1
//  static Attr attr2 = new Attr();     // 불가 : Attr(일반 속성 내부 클래스)
    static Share Share2 = new Share();      // 가능 : Share(공유 속성 내부 클래스)

    // TODO : 테스트 #2
    void method1() {
        Attr attr = new Attr();             // 가능
        Share share = new Share();          // 가능
    }

    static void method2() {
//        Attr attr2 = new Attr();            // 불가
        Share Share2 = new Share();         // 가능

    }
}
