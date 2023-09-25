package chap12.sec01.exam09;

import java.util.Objects;

/**
 * packageName : chap12.sec01.exam09
 * fileName : Student
 * author : L.DH
 * date : 2023-09-25
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-25         L.DH         최초 생성
 */
public class Student {
    //    TODO : 속성, 생성자, 함수
    public int sno;         // 학번
    public String name;     // 이름

    // TODO : 생성자(2개짜리 매개), 함수 재정의(3개 모두 만들기 : .equals(),.hashCode(),toString())
// 생성자
    public Student(int sno, String name) {
        this.sno = sno;
        this.name = name;
    }

    //  함수 재정의
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        chap12.sec01.exam08.Student student = (chap12.sec01.exam08.Student) o;
        return sno == student.sno && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sno, name);
    }

    @Override
    public String toString() {
        return "[" + sno + "," + name + "]";
    }
}