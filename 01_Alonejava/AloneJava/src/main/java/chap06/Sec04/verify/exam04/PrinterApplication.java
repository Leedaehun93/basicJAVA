package chap06.Sec04.verify.exam04;

/**
 * packageName : chap06.Sec04.verify.exam04
 * fileName : PrinterApplication
 * author : L.DH
 * date : 2023-09-20
 * description :    실행 클래스(main)
 * 요약 :
 *          static 함수 정의하기
 *          사용법 : static void 함수명(자료형 매개변수) { sout + 매개변수 ; }
 *          공유함수 오버로딩 예제
 *          공유함수 호출하는 방법
 *
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-20         L.DH         최초 생성
 */

/**
 * TODO: 힌트 : static 함수 정의하기
 *      static void 함수명(자료형 매개변수) { sout + 매개변수 ; }
 * 결과 :
 *       공유함수(int) :10
 *       공유함수(boolean) :true
 *       공유함수(double) :5.7
 *       공유함수(String) :홍길동
 */
public class PrinterApplication {
    public static void main(String[] args) {
//        공유함수 오버로딩 예제
//        공유함수 호출하는 방법
//        사용법 : 클래스명.공유함수명();
        Printer.println(10);
        Printer.println(true);
        Printer.println(5.7);
        Printer.println("홍길동");
    }   // end of main

}   // end of class