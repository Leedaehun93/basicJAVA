package chap07.sec01.exam01;

/**
 * packageName : chap07.sec01.exam01
 * fileName : Student
 * author : L.DH
 * date : 2023-09-21
 * description : 자식 클래스 : 좁은 범위의 클래스
 * 요약 : 상속 사용법 : public calss 자식클래스명 extends 부모클래스{}
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-21         L.DH         최초 생성
 */
public class Student extends People {
//  속성
    public int studentNo;   //학번

//  생성자 studentNO, 부모 속성까지 모두 : alt + insert
    public Student(String name, String ssn, int studentNo) {
        super(name, ssn);           // TODO : 부모의 매개변수 있는 생성자를 호출함
        this.studentNo = studentNo;
    }
}
