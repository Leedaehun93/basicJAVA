package chap02;

/**
 * packageName : chap02
 * fileName : Sec0203
 * author : GGG
 * date : 2023-09-18
 * description : 자료형 변환
 *
 * 요약 :
 *       자동 타입 변환 : 자동으로 자료형이 변환되는 것 : 작은(byte) 자료형 -> 큰 자료형
 *       강제 타입 변환 : 강제로 자료형 변환 : 사용법 : (자료형)변수명, 큰자료형- > 작은자료형
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-09-18         GGG          최초 생성
 */
public class Sec0203 {
    public void exam01() {
        byte byteValue = 10; // 1byte 정수형
//      TODO: 자동 자료형 변환 : int(4byte)
        int intValue = byteValue;
//      결과 출력 : sout, 줄복사 : ctrl + d
        System.out.println("intValue : " + intValue); //  intValue : 10

//      TODO: 실수 자동 형변환 : double(8byte) <- float(4byte)
        float floatValue = 100.5F;
        double doubleValue = floatValue;
//      결과 출력
        System.out.println("doubleValue : " + doubleValue); //  doubleValue : 100.5
    }

    /**
     * TODO: 강제 형변환 예제
     * 참고) 아스키 코드 변환 : char 변수 <- int 값 : 아스키코드 -> 문자로 변환
     * int 값 <- char     : 아스키코드 변환 <- 문자
     */
    public void exam02() {
        //  TODO: 아스키 코드(숫자) 변환 : 아스키코드(숫자) -> 문자로 변환
        char alpha = 65;
        int beta = 'A';
//      결과 출력
        System.out.println(alpha);  // A
        System.out.println(beta);  // 65

        int intValue = 44032; // int(4byte), char(2byte)
        char charValue = (char) intValue; // 강제 형변환
//      결과 출력
        System.out.println(charValue);  // 가

//      double(8) -> int(4) 강제 형변환
        double doubleValue = 3.14;
        int intValut2 = (int) doubleValue;
        System.out.println(intValut2);  // 3
    }
    /**
     * TODO: 문자열 + 숫자 = 문자열
     */
    public void exam03() {
//     TODO: 결합 연산 : 우선 순위 연산으로 결과 값이 상이할 수 있음
        String str1 = 10 + 2 + "8";
        System.out.println(str1);   // 128

        String str2 = 10 + "2" + 8;
        System.out.println(str2);   // 1028

        String str3 = "10" + (2 + 8);
        System.out.println(str3);   // 1010
    }
    /**
    * TODO: 문자열 -> int 자료형 변경 : Integer.parseInt("값")
    * TODO: int -> 문자열 변경 :
    */
    public void exam04() {
//      TODO: 문자열 -> int 자료형 변경
        int value1 = Integer.parseInt("10");          // 문자열 -> 정수
        double value2 = Double.parseDouble("3.14");   // 문자열 -> 실수
        boolean value3 = Boolean.parseBoolean("true");// 문자열 -> 참/거짓

        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);

//      TODO: int -> 문자열 변경 :
        String str1 = String.valueOf(10); // 속도 빠름
        String str2 = "" + 10;
        String str3 = String.valueOf(3.14);
        String str4 = String.valueOf(true);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
    }
}