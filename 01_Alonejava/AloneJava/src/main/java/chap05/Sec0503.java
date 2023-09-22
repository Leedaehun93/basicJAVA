package chap05;

import java.util.Calendar;

/**
 * packageName : chap05
 * fileName : Sec0503
 * author : L.DH
 * date : 2023-09-19
 * description : 열거형
 * 요약 :         제한된 상수를 가지는 자료형으로 날짜 출력하기
 *               열거 자료형 : 몇 가지로 제한된 상수를 가지는 자료형
 *               사용법(정의) : enum 변수명{ 상수1, 상수2, ... 상수n }
 *               클래스 내에서 사용
 *               열거형이름.상수명 ex) Week.MONDAY
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-19         L.DH         최초 생성
 */
public class Sec0503 {
    /**
     * 열거형 사용 예제(오늘 날짜 출력하기)
     */
    public void EnumWeek() {
//      열거형 변수 정의
        Week today = null;

//      달력 객체 : Calendar
        Calendar calendar = Calendar.getInstance(); // TODO : 달력 객체 가져오기
        int week = calendar.get(Calendar.DAY_OF_WEEK);  // TODO : 현재 요일 가져오기(1(일요일) ~ 7 숫자)
//        조건식
        switch (week) {
            case 1:
                today = Week.SUNDAY; break;
            case 2:
                today = Week.MONDAY; break;
            case 3:
                today = Week.TUESDAY; break;
            case 4:
                today = Week.WEDNESDAY; break;
            case 5:
                today = Week.THURSDAY; break;
            case 6:
                today = Week.FRIDAY; break;
            case 7:
                today = Week.SATURDAY; break;
        }
        System.out.println("오늘 요일 :" + today);
    }
}