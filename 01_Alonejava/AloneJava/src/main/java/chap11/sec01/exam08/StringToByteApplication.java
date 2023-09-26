package chap11.sec01.exam08;

/**
 * packageName : chap11.sec01.exam08
 * fileName : StringToByteApplication
 * author : L.DH
 * date : 2023-09-26
 * description : 문자 길이 알아보기(문자열(String) -> byte 배열 변환)
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-26         L.DH         최초 생성
 */
public class StringToByteApplication {
    public static void main(String[] args) {
        String str = "안녕하세요";

//  TODO : 문자열 -> byte[] 변환
//   사용법 : 문자열.getBytes() => byte[] 리턴
    byte[] bytes = str.getBytes();
        System.out.println("길이 : " + bytes.length);
    }
}
