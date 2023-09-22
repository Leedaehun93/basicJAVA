package chap06.Sec04.verify.exam04;

/**
 * packageName : chap06.Sec04.verify.exam04
 * fileName : Printer
 * author : L.DH
 * date : 2023-09-20
 * description :    모델 클래스(static 함수 정의하기)
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-20         L.DH         최초 생성
 */
public class Printer {
// TODO: login 함수 :  id 가  "hong" 이고(&&) password 가 "12345" => true 리턴
// TODO : 속성(필드), 사용자함수, 함수(메소드)
// 속성생략
// 생성자생략

// 함수(메소드)
    static void println(int input) {
        System.out.println("공유함수(int) : " + input);
    }

    static void println(boolean input) {
        System.out.println("공유함수(boolean) : " + input);
    }

    static void println(double input) {
        System.out.println("공유함수(double) : " + input);
    }

    static void println(String input) {
        System.out.println("공유함수(String) : " + input);
    }

}   // end of class