package chap07.verify.exam01;

/**
 * packageName : chap07.verify.exam01
 * fileName : Student
 * author : ds
 * date : 2022-09-30
 * description : 자식 클래스
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-30         ds          최초 생성
 */
//  문제 : 아래 자식 클래스 정보를 보고 부모 클래스를 완성하세요
//    Person 클래스 완성하기
public class Student extends Person {
    void set() {
        age = 30;        // 부모속성
        name = "홍길동"; // 부모속성
        height = 175; // 부모속성
        setWeight(99); // 부모함수 ( 세터 : alt+insert )
    }
}