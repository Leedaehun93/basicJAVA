package chap12.sec01.exam06;

import java.util.HashMap;
import java.util.Map;

/**
 * packageName : chap12.sec01.exam06
 * fileName : HashMapApplication
 * author : L.DH
 * date : 2023-09-25
 * description : Map 인터페이스
 * 요약 :
 * 복습 : 1) List : (ArrayList, LinkedList, vector), 향상된 배열
 * 복습 : 2) Set  : (HashSet, LinkedHashSet 등), 집합 구현
 * TODO : 3) Map(**) : (HashMap(*), HashTable 등), (키, 값 = 엔트리) 이루어진 자료구조 VS List (인덱스번호, 값)
 * 특징 : 키 - 유일한 값(중복 금지), 값 - 중복 허용
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-25         L.DH         최초 생성
 */
public class HashMapApplication {
    public static void main(String[] args) {
//  객체 생성 : 다형성
//  TODO : Map<키_자료형, 값_자료형> map = new HashMap<>();
//   Object : 자바 최고 조상님 객체
        Map<String, Object> map = new HashMap<>();

//  TODO : 자료 추가 : 객체변수.put(키, 값);
        map.put("no", 1);
        map.put("name", "홍길동");

//  결과 출력
        System.out.println(map);                            // {no=1, name=홍길동}

//  TODO : 자료 크기 : 객체변수.size()
        System.out.println("총 객체수 : " + map.size());     // 총 객체수 : 2

//  TODO : 키로 값을 조회하기 : 객체변수.get("키이름") => 결과 : 값이 출력
//  결과 출력
        System.out.println(map.get("no"));                  // 1
        System.out.println(map.get("name"));                // 홍길동

//  TODO : 수정하기 : 객체변수.put(키, 값)
//  결과 출력
        map.put("no", 2);   // no = 1 -> 2 값 수정
        System.out.println("1 -> 2 : " + map.get("no"));    // 1 -> 2 : 2

//  TODO : 삭제하기 : 객체변수.remove(키이름);
        map.remove("no");
//  결과 출력
        System.out.println("키 삭제 : " + map.get("no"));   //키 삭제 : null

    }
}
