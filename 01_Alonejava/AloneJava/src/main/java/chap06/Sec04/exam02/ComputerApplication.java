package chap06.Sec04.exam02;

/**
 * packageName : chap06.Sec04.exam02
 * fileName : ComputerApplication
 * author : L.DH
 * date : 2023-09-20
 * description :    실행 클래스(main)
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-20         L.DH         최초 생성
 */
public class ComputerApplication {
    public static void main(String[] args) {
//  객체 생성
        Computer computer = new Computer();

//  배열 정의
//  TODO: 더하기 함수 실행
        int[] value1 = {1,2,3};
        int result1 = computer.sum1(value1);
        System.out.println("result1 : " + result1); // 6

        int[] value2 = {1,2,3,4,5};
        int result2 = computer.sum1(value2);
        System.out.println("result2 : " + result2); // 15

//  TODO: 곱하기 함수 실행
        int[] value3 = {1, 2, 3};
        int result3 = computer.multi(value3);
        System.out.println("result3 : " + result3); // 6

//  TODO: 자바의 새로운 기능 : ... 연산자
        int result4 = computer.sum2(1,2,3);
        System.out.println("result4 : " + result4); // 6

        int result5 = computer.sum2(1,2,3,4,5);
        System.out.println("result5 : " + result5); // 15

    }   // end of main

}   // end of class