package chap06.sec02.exam02;

/**
 * packageName : chap06.sec02.exam02
 * fileName : FieldApplication
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
public class FieldApplication {
    public static void main(String[] args) {
//      TODO : 객체 생성 : new 연산자(힙방에 해당 객체를 생성함)
//      TODO : 클래스명 명명법 : 첫글자 대문자 나머지 소문자, 단어 사이는 대문자(파스칼표기법)
//      사용법 : 클래스명 객체변수명 = new 생성자함수();
        FieldInit fieldInit = new FieldInit();

//      TODO: 예제 : fieldInit 객체변수의 모든 속성 출력하세요.
//      TODO : 힌트 : sout
        System.out.println("byte : " + fieldInit.bField);   // 0
        System.out.println("short : " + fieldInit.sField);   // 0
        System.out.println("int : " + fieldInit.iField);   // 0
        System.out.println("long : " + fieldInit.lField);   // 0
        System.out.println("==================");
        System.out.println("float : " + fieldInit.fField);   // 0.0
        System.out.println("double : " + fieldInit.dField);   // 0.0
        System.out.println("==================");
        System.out.println("char : " + fieldInit.cField);   // "\"u(유니코드(숫자)로 떠서 결과가 출력이 안됨)
        System.out.println("boolean : " + fieldInit.boField);   // false
        System.out.println("==================");
        System.out.println("String : " + fieldInit.strField);   // null
        System.out.println("int[] : " + fieldInit.arrField);   // null
    } // end of main

} // end of class
