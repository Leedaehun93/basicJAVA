package chap11.sec01.exam03;

/**
 * packageName : chap11.sec01.exam03
 * fileName : SmartPhoneApplication
 * author : L.DH
 * date : 2023-09-26
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-26         L.DH         최초 생성
 */
public class SmartPhoneApplication {
    public static void main(String[] args) {
//  TODO : 객체 생성
        SmartPhone smartPhone = new SmartPhone("구글", "안드로이드");
//  결과 출력
        System.out.println(smartPhone); // 자동으로 toString() 함수가 호출됨
//      System.out.println(smartPhone.toString());
    } // end of main
} // end of class
