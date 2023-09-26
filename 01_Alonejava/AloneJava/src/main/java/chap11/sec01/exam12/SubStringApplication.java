package chap11.sec01.exam12;

/**
 * packageName : chap11.sec01.exam12
 * fileName : SubStringApplication
 * author : L.DH
 * date : 2023-09-26
 * description : String 클래스 함수 : 문자열 자르기 : substring()
 * 요약 :
 * 문자열 자르기 : 문자열.substring(시작인덱스위치, 마지막인덱스위치)
 * (시작인덱스위치 ~ 마지막인덱스위치 -1)
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-26         L.DH         최초 생성
 */
public class SubStringApplication {
    public static void main(String[] args) {
        String ssn = "123456-1234567";

//  TODO : 문자열 자르기 : 문자열.substring(시작인덱스위치, 마지막인덱스위치)
//  TODO :               (시작인덱스위치 ~ 마지막인덱스위치 -1)
        String firstNum = ssn.substring(0, 6);
//      결과 출력 : 123456
        System.out.println(firstNum);   // 주민번호 앞자리 숫자

//  TODO : (참고) 응용 사용법 : 문자열,substring(시작인덱스번호);
//  TODO :                   (시작인덱스위치 ~ 끝까지 잘림)
        String lastNum = ssn.substring(7);
//      결과 출력 : 1234567
        System.out.println(lastNum);   // 주민번호 뒷자리 숫자
    }
}
