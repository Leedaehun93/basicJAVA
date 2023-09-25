package chap12.sec01.exam08;

import java.util.ArrayList;
import java.util.List;

/**
 * packageName : chap12.sec01.exam08
 * fileName : ArrayListApplication
 * author : L.DH
 * date : 2023-09-25
 * description : ArrayList 객체 다루기
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-25         L.DH         최초 생성
 */
public class ArrayListApplication {
    public static void main(String[] args) {
//   List 객체 생성
        List<Student> students = new ArrayList<>();

//      TODO : 객체 자료 추가
        students.add(new Student(1, "홍길동"));
        students.add(new Student(2, "장길산"));
        students.add(new Student(3, "임꺽정"));
        System.out.println(students.get(0));            // 0번 출력 [1,홍길동]

//      TODO : 객체 자료 수정 : 0번 인덱스번호의 값 : 홍길동 -> 홍길동 2로 수정
        students.set(0, new Student(1, "홍길동2"));
        System.out.println(students.get(0));            // 0번 출력 [1,홍길동2]

//      TODO : 객체 자료 삭제
        students.remove(0);
        System.out.println(students.get(0));            // 0번 출력 [2,장길산]
    }

}