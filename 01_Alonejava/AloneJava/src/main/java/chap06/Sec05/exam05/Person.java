package chap06.Sec05.exam05;

/**
 * packageName : chap06.Sec05.exam05
 * fileName : Person
 * author : L.DH
 * date : 2023-09-21
 * description : final(상수) 예제
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-21         L.DH         최초 생성
 */
public class Person {
//   TODO :  속성, 생성자, 함수
//           변수 : 중간에 값을 바꿀수 있는 것
//           상수 : 중간에 값을 바꿀수 없는 것
//           상수 사용법 : 1) final 자료형 속성명  = "초기값";
//                       2) final 자료형 속성명; , 생성자를 이용해 상수 초기화

//  1) final 자료형 속성명 = "초기값";
    final String nation = "Korea";  // 국가

//  2) final 자료형 속성명; , 생성자를 이용해 상수 초기화(참고)
    final String ssn;   // 시리얼 번호(상수)
    String name;        // 일반 속성

//  생성자 : 자동화기능 : alt + insert(ssn, name)
    public Person(String ssn, String name) {
        this.ssn = ssn;
        this.name = name;
    }

}   // end of class