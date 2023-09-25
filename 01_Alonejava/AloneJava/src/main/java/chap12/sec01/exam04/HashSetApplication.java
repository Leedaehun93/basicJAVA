package chap12.sec01.exam04;

import java.util.HashSet;
import java.util.Set;

/**
 * packageName : chap12.sec01.exam04
 * fileName : HashSetApplication
 * author : L.DH
 * date : 2023-09-25
 * description : Set 인터페이스 자식클래스들
 * 요약 :
 * 복습 : List : (ArrayList, LinkedList, Vector)
 * 복습 : Set  : (HashSet, LinkedHashSet, TreeSet 등)
 * TODO : Set : 집합을 표현한 인터페이스, 자식클래스 위에 표기
 *  특징 : 순서가 없음(인덱스번호가 없음), 중복이 허용되지 않음 vs List 특징(순서 있음(인덱스), 중복 허용됨)
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-25         L.DH         최초 생성
 */
public class HashSetApplication {
    public static void main(String[] args) {
//  객체 생성 : 다형성
        Set<String> set = new HashSet<>();

// TODO : 자료 추가 : 사용법 : 객체변수.add(값)
        set.add("Java");
        set.add("JDBC");
        set.add("Servlet/JSP");
        set.add("Java");
        set.add("myBATIS");
//  결과 출력
        System.out.println(set);

//  TODO : 자료 크기 보기 : 사용법 : 객체변수.size();
        int size = set.size();
        System.out.println("총 객체수 : " + size);

//  TODO : 자료 삭제 : 사용법 : 객체변수.remove(값);
        set.remove("JDBC");
//  결과 출력
        System.out.println(set);

//  TODO : (참고) 자료 모두 삭제 : 사용법 : 객체변수.clear();
        set.clear();
//  결과 출력
        System.out.println(set);
    }
}
