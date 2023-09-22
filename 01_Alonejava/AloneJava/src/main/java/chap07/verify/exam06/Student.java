package chap07.verify.exam06;

/**
 * packageName : chap07.verify.exam06
 * fileName : Student
 * author : L.DH
 * date : 2023-09-21
 * description : 연습문제)자식 클래스 코딩
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-21         L.DH         최초 생성
 */
public class Student extends Person {
    // 속성
    String id;

    //  생성자
//  기본 생성자
    public Student() {
    }


    //    생성자 : alt + insert
    public Student(String name) {
        super(name);
    }



    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}

