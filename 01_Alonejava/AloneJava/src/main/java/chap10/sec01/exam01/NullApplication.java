package chap10.sec01.exam01;

/**
 * packageName : chap10.sec01.exam01
 * fileName : NullApplication
 * author : L.DH
 * date : 2023-09-26
 * description : TODO : 예외처리(에러처리), null pointer exception(널 에러)
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-26         L.DH         최초 생성
 */
public class NullApplication {
    public static void main(String[] args) {
//  TODO :  null 발생시키는 코드
        String data = null;
        System.out.println(data.toString());    // null 에러 발생

    }   // end of main
}   // end of class
