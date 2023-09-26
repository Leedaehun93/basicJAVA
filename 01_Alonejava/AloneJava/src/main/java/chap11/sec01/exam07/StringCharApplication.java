package chap11.sec01.exam07;

/**
 * packageName : chap11.sec01.exam07
 * fileName : StringCharApplication
 * author : L.DH
 * date : 2023-09-26
 * description : 1문자 가져오기(주민번호로 성별 구별하기)
 * 요약 : 문자열.charAt(인덱스번호) => 결과 : char 1문자 리턴
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-26         L.DH         최초 생성
 */
public class StringCharApplication {
    public static void main(String[] args) {
//        주민번호
        String ssn = "123456-1234567";
//      TODO: 1문자 가져오기
//        사용법 : 문자열.charAt(인덱스번호) => 결과 : char 1문자 리턴
        char gender = ssn.charAt(7); // '1' 문자를 가져옴
        if(gender == '1' || gender == '3') {
            System.out.println("남자입니다.");
        } else if(gender == '2' || gender == '4') {
            System.out.println("여자입니다.");
        }
    }
}