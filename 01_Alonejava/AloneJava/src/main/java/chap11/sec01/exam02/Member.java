package chap11.sec01.exam02;

import java.util.Objects;

/**
 * packageName : chap11.sec01.exam02
 * fileName : Member
 * author : L.DH
 * date : 2023-09-25
 * description : 객체를 동등 비교 (.hashCode())
 * 요약 :
 * 해쉬코드(hashCode) : 객체를 식별하는 유일한 정수값(번호 중복 없음)
 * 1) 방번호(주소) : 메모리의 랜덤하고 유일한 방번호 만들때 사용
 * 2) HashMap, Hashset 자료구조에서 내부적으로 해쉬코드를 사용함(객체들을 비교할때)
 * TODO : => 기본 hashCode 는 객체 간 비교에서 오류를 일으키므로 재정의해야함
 *  => 결론) .equals(), .hashCode() 재정의 해야함(추천 : 인텔리 제이는 자동 코딩(alt + insert) 기능 이용)
 *
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-25         L.DH         최초 생성
 */
public class Member {
// 속성
    public String id;

// 생성자
    public Member(String id) {
        this.id = id;
    }

// 객체 동등 비교를 위해 .equals 함수 재정의 해야함 : alt + insert(equals 및 hashcode 생성)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return Objects.equals(id, member.id);
    }

    @Override
    public int hashCode() {
//      2개의 객체를 생성해서 비교시 id 속성의 해시코드가 2개 모두 같아짐
        return Objects.hash(id);    // 객체의 비교(속성을 비교)
    }
}
