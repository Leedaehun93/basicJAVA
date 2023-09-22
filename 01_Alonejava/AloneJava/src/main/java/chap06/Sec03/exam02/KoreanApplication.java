package chap06.Sec03.exam02;

/**
 * packageName : chap06.Sec03.exam02
 * fileName : KoreanApplication
 * author : L.DH
 * date : 2023-09-20
 * description :    실행 클래스 (main())
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-20         L.DH         최초 생성
 */
public class KoreanApplication {
    /**
     * 한국인 객체를 생성하고 매개변수 2개짜리 생성자를 이용해서 속성을 초기화하세요.
     * 초기화 한 결과를 출력하세요
     * TODO: 힌트 : Korean 클래스 속성 : String name, String ssn
     *       객체의 사용 : 객체변수.속성명
     * //        결과 :
     * //            k1.name : 박자바 (문자열)
     * //            k1.ssn : 011225-1234567 (문자열)
     * //            k2.name : 김자바
     * //            k2.ssn : 930525-0654321
     */

    public static void main(String[] args) {
//      객체 생성
//      사용법 : 클래스명 객체변수명 = new 생성자함수(변수1, 변수2);
        Korean k1 = new Korean("박자바", "011225-1234567");
        Korean k2 = new Korean("김자바", "930525-0654321");

//      K1 결과 출력
        System.out.println("k1.name : " + k1.name);
        System.out.println("k1.ssn : " + k1.ssn);
//      K2 결과 출력
        System.out.println("k2.name : " + k2.name);
        System.out.println("k2.ssn : " + k2.ssn);
    }   // end of main

}   // end of class