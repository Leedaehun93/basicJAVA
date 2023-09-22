package chap07.sec01.exam02;

/**
 * packageName : chap07.sec01.exam02
 * fileName : CalculatorApplication
 * author : L.DH
 * date : 2023-09-21
 * description : 함수 = 메소드 재정의(오버라이딩)
 * 요약 :
 *
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-21         L.DH         최초 생성
 */
public class CalculatorApplication {
    public static void main(String[] args) {
        int r = 10; // 반지름
//          객체 생성 : 부모 : Calculator
        Calculator calculator = new Calculator();
        System.out.println("원면적 : " + calculator.areaCircle(r));    // 부모 함수 Calculator 의 areaCircle 실행
        System.out.println("------------------------");
//      객체 생성 : 자식 : Computer
        Computer computer = new Computer();
        // TODO : 부모 함수 .areaCircle() VS 자식 함수 .areaCircle()    (win)
        //        결과 : 오버라이딩한 자식 함수가 우선이 되어 출력됨
        System.out.println("원면적 : " + computer.areaCircle(r));  // Computer(자식) 객체의 areaCircle 실행
    }
}
