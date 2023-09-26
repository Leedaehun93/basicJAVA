package chap10.sec02.exam02;

/**
 * packageName : chap10.sec02.exam02
 * fileName : TrtCatch2Application
 * author : L.DH
 * date : 2023-09-26
 * description : 예외처리(에러처리) 2
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-26         L.DH         최초 생성
 */
public class TrtCatch2Application {
    public static void main(String[] args) {
//  TODO : Out Of Bound 에러 발생시키는 코드
//   현재 main 의 매개변수는 기본적으로 없음
//   try ~ catch(){}
        String data1 = null;
        String data2 = null;
        try {
            data1 = args[0];
            data2 = args[1];

            System.out.println(data1); // TODO : 에러 발생 -> catch 로 이동함
            System.out.println(data2);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("실행 매개변수 값이 없습니다.");
        }

//  TODO : 강제로 Number Format 에러 발생 예제
//  TODO : 문자열 -> 숫자로 변경 : Integer.parseInt()
        try {
            int value1 = Integer.parseInt(data1);
            int value2 = Integer.parseInt(data2);   // a100 숫자 변환 안됨
            System.out.println(data1 + " " + data2);
        } catch (NumberFormatException e){
            System.out.println("숫자로 변환할 수 없습니다.");
        } finally {
//          TODO : finally : 에러 유무와 상관없이 무조건 실행되는 블럭
            System.out.println("다시 실행하세요");
        }
    } // end of main
}   // end of class
