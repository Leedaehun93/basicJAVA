package chap06.Sec05.exam06;

/**
 * packageName : chap06.Sec05.exam06
 * fileName : Earth
 * author : L.DH
 * date : 2023-09-21
 * description : 공유(정적, 전역) 상수(static final)
 * 요약 : 공유(정적) 상수 명명법 : 모두 대문자
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-21         L.DH         최초 생성
 */
public class Earth {
//  지구 반지름 속성
    static final double EARTH_RADIUS = 6400;

// 지구의 표면적 : 공식 : 4 * 3.14 * 지구반지름 * 지구반지름
    static final double EARTH_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
}   // end of class
