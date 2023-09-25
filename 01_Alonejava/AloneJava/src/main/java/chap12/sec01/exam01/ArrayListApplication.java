package chap12.sec01.exam01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * packageName : chap12.sec01.exam01
 * fileName : ArrayListApplication
 * author : L.DH
 * date : 2023-09-25
 * description : 향상된 배열
 * 요약 :
 * - List : 인터페이스, 배열을 개선한 자료구조
 *          열(고정길이) vs 향상된 배열(크기가 자동증가) : 기본 10개
 * List 자식 클래스들
 * - TODO : ArrayList(*)  : 순차적으로 추가/삭제 시 속도 빠름
 *                   중간에 추가/삭제시 속도 저하
 * - LinkedList    : 중간에 추가/삭제시 속도 향상, 순차적일때 속도 저하
 * - Vector        : 멀티 쓰레드 환경에서 사용하는 자료구조
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-25         L.DH         최초 생성
 */
public class ArrayListApplication {
    public static void main(String[] args) {
//      객체 생성 : 리스트 : 다형성(자식에 따라 결과가 달라짐)
//      List<String> list = new LinkedList<>();
//      TODO : <> : 제네릭, 객체 안에 자료의 타입(자료형)을 제한할 목적으로 사용함
//        List<제한할자료형> 객체변수 = new ArrauList<제한할자료형:생략가능>();
        List<String> list = new ArrayList<>();

//      TODO : 리스트에 추가하기
//      TODO : 사용법 : 리스트객체변수.add(값);        // 최초 0 인덱스 번호에 추가됨
        list.add("Java");                    // 1st
        list.add("JDBC");                    // 2nd
        list.add("Servlet/JSP");             // 4th
        list.add(2, "Database"); // 3rd
        list.add("myBATIS");                 // 5th
//      결과 출력
        System.out.println(list);

//      TODO : 향상된 배열의 크기 가져오기 (vs 일반배열.length)
//        사용법 : 객체변수.size()
        int size = list.size();
//      결과 출력
        System.out.println("총 객체수 : " + size);

        System.out.println("==========================");

//      TODO : 저장된 데이터 가져오기
//      TODO : 예제 1) 3번째 자료 가져오기
//       사용법 : 객체변수.get(인덱스번호);
        String skill = list.get(2); //  0 ~ n : 0부터 시작(배열)
//      결과 출력
        System.out.println("3번째 자료 : " + skill);

//      TODO : 반복문을 이용해서 자료 모두 출력하기
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            System.out.println("반복문" + i + " : " + str);
        }

//      TODO : 자료 수정하기
//       사용법 : 객체변수. set(인덱스번호, 값);
        list.set(0, "자바");
        System.out.println("수정된 값 : " + list.get(0));

//      TODO : 자료 삭제하기
//       사용법 : 객체변수.remove(인덱스번호)
//       사용법 : 객체변수.remove(값)
        list.remove(2);     // 2번 인덱스 위치의 값 삭제
        list.remove(2);     //  값(myVATIS) 찾아서 삭제
        list.remove("myBATIS");
//      결과 출력
        System.out.println("삭제 후 남은 자료 : " + list);

//      TODO : 모두 자료 삭제하기
//       사용법 : 객체변수.clear()
        list.clear();   // 모든 자료 삭제
//      결과출력
        System.out.println(list);
    }

}
