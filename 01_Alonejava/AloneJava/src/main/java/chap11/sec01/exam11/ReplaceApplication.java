package chap11.sec01.exam11;

/**
 * packageName : chap11.sec01.exam11
 * fileName : ReplaceApplication
 * author : L.DH
 * date : 2023-09-26
 * description : String 클래스 함수 : 문자열 바꾸기 함수 : replace()
 * 요약 : 문자열 바꾸기 : 문자열.replace(이전문자, 바꿀문자);
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-26         L.DH         최초 생성
 */
public class ReplaceApplication {
    public static void main(String[] args) {
//      자바 API : 자바의 유용한 함수 묶음
        String oldStr = "자바는 객체지향언어입니다. 자바는 풍부한 API도 지원합니다.";
//      TODO: 문자열 바꾸기 : 문자열.replace(이전문자, 바꿀문자);
        String newStr = oldStr.replace("자바", "Java");
        System.out.println(newStr);
    }
}