package chap12.sec01.verify.exam05;

import java.util.HashMap;
import java.util.Map;

/**
 * packageName : chap12.sec01.verify.exam05
 * fileName : DeptApplication
 * author : L.DH
 * date : 2023-09-26
 * description : 연습문제)실행 클래스
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-26         L.DH         최초 생성
 */

/**
 * // TODO: 연습문제) Map 자료구조에 값과 객체를 추가하고 아래와 같이 결과가 출력하도록
 * // 실행 클래스를 코딩하세요.
 * //    힌트 : put() : 추가함수, get() : 조회함수
 * //    입력 :  키         |    값
 * //         currentPage      2
 * //         totalNum         3
 * //         dept             Dept{dno=10, dname='Sales', loc='부산'}
 * //         sizePerPage      3
 * //    결과 :
 * //    2
 * //    3
 * //    Dept{dno=10, dname='Sales', loc='부산'}
 * //    3
 */
public class DeptApplication {
    public static void main(String[] args) {
//  TODO : Map 자료구조 객체 정의
        Map<String , Object> map = new HashMap<>();

//     TODO: 값 추가 : map.put(키, 값)
        map.put("currentPage", 2);  // 현재페이지 : 2
        map.put("totalNum", 3);  // 총페이지 : 3
        map.put("dept", new Dept(10, "Sales", "부산"));  // Dept 객체
        map.put("sizePerPage", 3);  // 1페이지 당 개수 : 3

//      TODO: 출력 : map.get(키) => 결과 : 값 출력됨
        System.out.println(map.get("currentPage"));
        System.out.println(map.get("totalNum"));
        System.out.println(map.get("dept"));
        System.out.println(map.get("sizePerPage"));
    }

}