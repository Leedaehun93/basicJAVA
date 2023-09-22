package chap06.Sec05.exam02;

/**
 * packageName : chap06.Sec05.exam02
 * fileName : CalculatorApplication
 * author : L.DH
 * date : 2023-09-21
 * description :    실행 클래스
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-21         L.DH         최초 생성
 */
public class CalculatorApplication {
    public static void main(String[] args) {
//      정적(공유) 속성/함수를 사용하기
//      TODO : 객체 생성이 필요없음 -> 바로 호출 : 클래스명.함수명, 클래스명.속성명
//             클래스명 : Calculator
        double result1 = 10 * 10 * Calculator.pi;     // 원의 넓이
        int result2 = Calculator.plus(10, 5);    // 덧셈 계산
        int result3 = Calculator.minus(10, 5);   // 뺄셈 계산

//      결과 출력
        System.out.println("result1 : " + result1);
        System.out.println("result2 : " + result2);
        System.out.println("result3 : " + result3);

    }   // end of main
}   // end of class
