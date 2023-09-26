package chap12.sec01.verify.exam07;

import java.util.HashSet;
import java.util.Set;

/**
 * packageName : chap12.sec01.verify.exam07
 * fileName : HashSetApplication
 * author : L.DH
 * date : 2023-09-26
 * description : 연습문제)실행 클래스
 * HashSet에 Student 객체를 저장하려고 합니다.
 * 학번이 같으면 동일한 Student라고 가정하고 중복 저장이 되지 않도록 하고 싶습니다.
 * Student 클래스에서 재정의해야 하는 hashCode()와 equals() 함수를 내용을 채워보세요.
 * Student의 해시코드는 학번이라고 가정합니다.
 * 요약 : 자바 기본 자료구조 ( List, Set, Map )
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-26         L.DH         최초 생성
 */
// TODO: 연습문제) 실행클래스는 결과는 아래와 같다.
//    Student 객체의 속성 및 중복을 제거하기 위해 재정의해야할 함수를 포함하여
//    Student 객체를 디자인(코딩)하세요
//    결과 :
//       1:홍길동
//       2:신용권
public class HashSetApplication {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<>();

//        HashSet : 키가 중복되었을때 자동으로 중복을 제거해주는 자료구조
//        HashSet : 기존에 값이 있으면 안들어감
        set.add(new Student(1, "홍길동"));
        set.add(new Student(2, "신용권"));
        set.add(new Student(1, "홍길동"));

        for(Student student : set) {
            System.out.println(student.getStudentNum() + "-" + student.getName());
        }
    }
}