package chap12.sec01.exam05;

import java.util.Objects;

/**
 * packageName : chap12.sec01.exam05
 * fileName : Member
 * author : L.DH
 * date : 2023-09-25
 * description : 회원 객체
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-25         L.DH         최초 생성
 */
public class Member {
    // 속성
    public String name; // 이름
    public int age;     // 나이

    // 생성자 2개짜리
    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }
//    TODO : 객체 비교 : .equals(), .hashCode, .toString() (속성) 재정의

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return age == member.age && Objects.equals(name, member.name);
    }

// TODO : 중복제거
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "[" + name + "," + age + "]";
    }

}