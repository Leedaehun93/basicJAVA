package chap07.verify.exam06;

/**
 * packageName : chap07.verify.exam06
 * fileName : StudentApplication
 * author : kangtaegyung
 * date : 2023/03/30
 * description : 실행 클래스(main)
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/03/30         kangtaegyung          최초 생성
 */
// 문제 : 실행클래스와 부모클래스 Person 을 보고 자식 클래스 Student 를 완성하세요
// 결과:
//    홍길동
//    1234567
public class StudentApplication {
    public static void main(String[] args) {
        Student student = new Student("홍길동");

        student.setId("1234567");   // setter : 속성명 String id

        System.out.println(student.getName());  // 홍길동
        System.out.println(student.getId());    // 1234567
    }
}
