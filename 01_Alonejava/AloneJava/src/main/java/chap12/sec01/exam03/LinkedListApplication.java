package chap12.sec01.exam03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * packageName : chap12.sec01.exam03
 * fileName : LinkedListApplication
 * author : L.DH
 * date : 2023-09-25
 * description : LinkedList 예제(List 인터페이스의 자식 클래스)
 * 요약 :
 * LinkedList  vs  ArrayList
 * 구분        |  순차 추가/삭제       |  중간에 추가/삭제
 * ArrayList  |   빠름               | 느림
 * LinkedList |   느림               | 빠름
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-25         L.DH         최초 생성
 */
public class LinkedListApplication {
    public static void main(String[] args) {
//  TODO : 예제1) 속도 비교 : ArrayList vs LinkedList (Win)
//      객체 생성 : 다형성
        List<String> list = new ArrayList<>();
        List<String> list2 = new LinkedList<>();

//  시간 변수 2개
        long startTime;
        long endtTime;

//  TODO : 1) 처음 시간 : Sustem 객체 : 시간을 재는 함수 : nanoTime()
        startTime = System.nanoTime();

//  TODO : 2) 실행 : 반복문 (0 ~ 10000 까지 배열에 값을 추가)
        for (int i = 0; i < 10000; i++) {
//          중간에 추가 : add(인덱스번호, 값)
            list.add(0, String.valueOf(i)); //  정수 -> 문자열 변환 추가
        }

//  TODO : 3) 종료 시간 : SySTEM 객체 : nanoTime()
        endtTime = System.nanoTime();
        System.out.println("ArrayList 소요시간 : " + (endtTime - startTime));   // ArrayList 소요시간 : 9635100


        System.out.println("----------------LinkedList----------------");

//      TODO: 1) 처음 시간 : System 객체 : 시간을 재는 함수 : nanoTime()
        startTime = System.nanoTime();

//      TODO: 2) 실행 : 반복문 (0 ~ 10000 까지 배열에 값을 추가)
        for (int i = 0; i < 10000; i++) {
//            중간에 추가 : add(인덱스번호, 값)
            list2.add(0, String.valueOf(i)); // 정수 -> 문자열 변환 추가
        }
//      TODO: 3) 종료 시간 : System 객체 : nanoTime()
        endtTime = System.nanoTime();
        System.out.println("LinkedList 소요시간 : " + (endtTime - startTime));  // LinkedList 소요시간 : 2615500


    }


}













