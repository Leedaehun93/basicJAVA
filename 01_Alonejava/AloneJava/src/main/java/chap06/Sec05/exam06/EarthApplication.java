package chap06.Sec05.exam06;

/**
 * packageName : chap06.Sec05.exam06
 * fileName : EarthApplication
 * author : L.DH
 * date : 2023-09-21
 * description : 실행 클래스
 * 요약 : 공유(정적) 함수/변수/상수 : 클래스명.상수명(객체생성 없음)
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-21         L.DH         최초 생성
 */
public class EarthApplication {
    public static void main(String[] args) {
//  결과 출력 : 지구 반지름, 표면적
//  TODO : 공유(정적) 함수/변수/상수 : 클래스명.상수명(객체생성 없음)
        System.out.println("지구의 반지름 : " + Earth.EARTH_RADIUS + " km");
        System.out.println("지구의 표면 : " + Earth.EARTH_AREA + " km^2");
    }   // end of main

}   // end of class
