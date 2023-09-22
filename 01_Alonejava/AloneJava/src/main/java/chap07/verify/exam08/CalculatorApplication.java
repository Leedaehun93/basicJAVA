package chap07.verify.exam08;

/**
 * packageName : chap07.verify.exam08
 * fileName : CalculatorApplication
 * author : ds
 * date : 2022-09-30
 * description : 실행 클래스, 연습문제) 다형성
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-30         ds          최초 생성
 */
// 문제 : 실행 클래스의 결과와 Calculator(추상클래스)를 확인해서
//       자식 클래스 GoodCalc 디자인(코딩)하세요.
// 결과 :
//    5
//    -1
//    3.0
public class CalculatorApplication {
    public static void main(String[] args) {
        GoodCalc goodCalc = new GoodCalc();

        System.out.println(goodCalc.add(2,3));
        System.out.println(goodCalc.subtract(2,3));
        System.out.println(goodCalc.average(new int[]{2,3,4}));
    }
}