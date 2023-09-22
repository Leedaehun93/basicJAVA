package chap06.Sec04.exam06;

/**
 * packageName : chap06.Sec04.exam06
 * fileName : Calculator
 * author : L.DH
 * date : 2023-09-20
 * description :    연습문제)계산기 모델 클래스
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-20         L.DH         최초 생성
 */
public class Calculator {
// TODO : 속성(필드), 사용자함수, 함수(메소드)
// 속성생략
// 생성자생략

    /**
     * 정사각형의 넓이 구하기 함수
     * 사용법 : 접근제한자 리턴자료형
     * 매개변수 1개 사용
     */
    double areaRectangle(int w) {
        double result = (double) w * w;
        return result;
    }

    /**
     * 직사각형의 넓이 구하기 함수
     * 사용법 : 접근제한자 리턴자료형
     * 매개변수 2개 사용
     */
    double areaRectangle(int w, int h) {
        double result = (double) w * h;
        return result;
    }

}   // end of class
