package chap05;

/**
 * packageName : chap05
 * fileName : Week
 * author : L.DH
 * date : 2023-09-19
 * description :    열거형 클래스
 * 요약 : 
 *          열거 자료형 : 몇 가지로 제한된 상수를 가지는 자료형
 *          사용법(정의) : enum 변수명{ 상수1, 상수2, ... 상수n }
 *          클래스 내에서 사용
 *              열거형이름.상수명 ex) Week.MONDAY
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-19         L.DH         최초 생성
 */
public enum Week {
//    월,화,수,목,금,토,일 정의(상수)
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
} // end of enum