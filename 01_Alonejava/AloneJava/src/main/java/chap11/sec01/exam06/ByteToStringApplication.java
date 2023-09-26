package chap11.sec01.exam06;

/**
 * packageName : chap11.sec01.exam06
 * fileName : ByteToStringApplication
 * author : L.DH
 * date : 2023-09-26
 * description : byte 배열 -> 문자열(String) 로 변환하기
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-26         L.DH         최초 생성
 */
public class ByteToStringApplication {
    public static void main(String[] args) {
        byte[] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97};

//      TODO : byte 배열 -> 문자열 변환
//       사용법 : new String(byte배열)
        String str1 = new String(bytes);
        System.out.println(str1);   // Hello Java(72, 101, 108, 108, 111, 32, 74, 97, 118, 97)
//      TODO : (참고) 응용 : 사용법 : new String(byte배열, 인덱스번호, 문자열길이)
        String str2 = new String(bytes, 6, 4); // Java(74, 97, 118, 97)
        System.out.println(str2);
    } // end of main
}   // end of class
