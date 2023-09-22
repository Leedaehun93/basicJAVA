package chap06.Sec05.exam05;

/**
 * packageName : chap06.Sec05.exam05
 * fileName : PersonApplication
 * author : L.DH
 * date : 2023-09-21
 * description : 실행클래스(main)
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-21         L.DH         최초 생성
 */
public class PersonApplication {
    public static void main(String[] args) {
//      객체 생성
        Person person = new Person("123456-123456", "홍길동");

//      상수 출력
        System.out.println(person.nation);  // 상수
        System.out.println(person.ssn);  // 상수
        System.out.println(person.name);  // 변수

//      테스트 : 상수/변수
        person.name = "강감찬";
//      person.nation = "CANADA"; // TODO : 상수 변경 에러 발생(상수이므로 변경불가)
        System.out.println(person.name);  // 변수 변경 가능
    }   // end of main

}   // end of class
