package chap09.sec01.exam03;

/**
 * packageName : chap09.sec01.exam03
 * fileName : Outer
 * author : L.DH
 * date : 2023-10-02
 * description : 외부 클래스의 일반/공유 속성 -> 내부 클래스 안에서 사용하기(일부 사용 제한)
 * 요약 : => 공유 내부 클래스 안에서는 공유 속성/함수만 사용가능(일반속성/함수 안됨)
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-10-02         L.DH         최초 생성
 */
public class Outer {
    int field1; // 일반 속성
    static int field2; // 공유 속성

    void method1() {
    } // 일반 함수

    static void method2() {
    } // 공유 함수

    //  TODO: 일반 내부 클래스
    class Attr {
        void method() {
//            TODO: 외부 클래스의 일반 속성/함수 호출
            field1 = 10;  // 가능
            method1();    // 가능
//            TODO: 외부 클래스의 공유 속성/함수 호출
            field2 = 10;  // 가능
            method2();    // 가능
        }
    }

    //  TODO: 공유 내부 클래스
    static class Share {
        void method() {
//            TODO: 외부 클래스의 일반 속성/함수 호출 : x
//            field1 = 10;  // 불가
//            method1();    // 불가
//            TODO: 외부 클래스의 공유 속성/함수 호출
            field2 = 10;  // 가능
            method2();    // 가능
        }
    }
}