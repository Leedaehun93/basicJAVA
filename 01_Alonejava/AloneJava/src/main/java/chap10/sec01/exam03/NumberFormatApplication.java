package chap10.sec01.exam03;

/**
 * packageName : chap10.sec01.exam03
 * fileName : NumberFormatApplication
 * author : L.DH
 * date : 2023-09-26
 * description :
 * Number Format 에러[예외](Exception) :
 * 문자열 -> 숫자로 변경했는데 그 숫자 형태가 잘못되었을 경우 발생
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-26         L.DH         최초 생성
 */
public class NumberFormatApplication {
    public static void main(String[] args) {
//  TODO : 강제로 Number Format 에러 발생 예제
        String data1 = "100";
        String data2 = "a100";

//  TODO : 문자열 -> 숫자로 변경 : Integer.parseInt()
        int value1 = Integer.parseInt(data1);
        int value2 = Integer.parseInt(data2);
        System.out.println(data1 + " " + data2);
    } // end of main
} // end of class
