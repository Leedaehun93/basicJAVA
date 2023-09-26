package chap11.sec01.exam09;

import javax.xml.stream.Location;

/**
 * packageName : chap11.sec01.exam09
 * fileName : IndexOfApplication
 * author : L.DH
 * date : 2023-09-26
 * description : String 클래스의 함수 : IndexOf()
 * 요약 :
 * 전달된 문자열이 시작되는 인덱스번호를 리턴 : indexOf(문자열)
 * 찾는 문자열이 없으면 : -1이 출력됨
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-26         L.DH         최초 생성
 */
public class IndexOfApplication {
    public static void main(String[] args) {
        String subject = "자바 프로그래밍";

//  TODO : 전달된 문자열이 시작되는 인덱스번호를 리턴 : indexOf(문자열)
        int location = subject.indexOf("프로그래밍");
//  결과 출력 : 3(프)
        System.out.println(location);

//  TODO : (참고) 찾는 문자열이 없으면 : -1
        int location2 = subject.indexOf("파이썬");
//  결과 출력 : -1
        System.out.println(location2);
    }
}
