package chap12.sec01.exam05;

import java.util.HashSet;
import java.util.Set;

/**
 * packageName : chap12.sec01.exam05
 * fileName : HashSetApplication
 * author : L.DH
 * date : 2023-09-25
 * description : Set : (HashSet, LinkedHashSet 등), 집합 구현, 실행 클래스
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-25         L.DH         최초 생성
 */
public class HashSetApplication {
    public static void main(String[] args) {
//      객체 생성 : 다형성
        Set<Member> set = new HashSet<>();

//      객체 추가
        set.add(new Member("홍길동", 30));
        set.add(new Member("홍길동", 30));

//      결과 출력         TODO : 중복 제거를 위해  .hashCode() 재정의)
        System.out.println(set);    // [[홍길동,30]] 1명만 출력으로 중복 제거 확인 완료
    }

}