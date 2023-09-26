package chap10.sec02.exam04;

/**
 * packageName : chap10.sec02.exam04
 * fileName : ThrowsApplication
 * author : L.DH
 * date : 2023-09-26
 * description : 예외(에러) 처리 떠넘기기
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-26         L.DH         최초 생성
 */
public class ThrowsApplication {
    public static void main(String[] args) {
    try {
        findClass();    // 공유함수 호출
    } catch (Exception e) {
        System.out.println("클래스가 존재하지 않습니다.");
    }
    } // end of main

//    공유(정적)함수
//   TODO: 리턴자료형 함수명() throws 에러클래스
//     => 함수 내에서 에러처리 안하고 이 함수를 호출하는 쪽에 에러처리를 떠넘기기
    public static void findClass() throws ClassNotFoundException {
//      TODO: Class 객체 : 자바의 환경을 접근하는 자바API 함수
//        Class.forName("클래스명") => 해당 클래스를 리턴
        Class clazz = Class.forName("String2");
    }

} // end of class