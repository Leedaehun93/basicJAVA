package chap07.sec01.exam01;

/**
 * packageName : chap07.sec01.exam01
 * fileName : StudentApplication
 * author : L.DH
 * date : 2023-09-21
 * description : 실행 클래스(main)
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-21         L.DH         최초 생성
 */
public class StudentApplication {
    public static void main(String[] args) {
//  객체 생성 : 자식(Student)
        Student student = new Student("홍길동", "123456-1234567", 1);
        System.out.println("name : " + student.name);           // 부모 속성
        System.out.println("ssn : " + student.ssn);             // 부모 속성
        System.out.println("studentNo : " + student.studentNo); // 부모 속성
    }
}