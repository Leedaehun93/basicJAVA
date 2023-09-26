package chap11.sec02.exam03;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * packageName : chap11.sec02.exam03
 * fileName : LocalDateApplication
 * author : L.DH
 * date : 2023-09-26
 * description :
 * 컴퓨터의 현재 날짜 가져와서 출력, LocalDate, LocalTime
 * Java 8 버전부터 지원(현재 많이 사용됨)
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-26         L.DH         최초 생성
 */
public class LocalDateApplication {
    public static void main(String[] args) {
//  TODO: 날짜 가져오기 객체
        LocalDate localDate = LocalDate.now(); // 현재 날짜 가져오기
        System.out.println(localDate); // 결과 출력
//  TODO: 시간 가져오기 객체
        LocalTime localTime = LocalTime.now(); // 현재 시간 가져오기
        System.out.println(localTime); // 결과 출력
    }
}
