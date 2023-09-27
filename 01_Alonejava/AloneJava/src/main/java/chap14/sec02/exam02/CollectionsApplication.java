package chap14.sec02.exam02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * packageName : chap14.sec02.exam02
 * fileName : CollectionsApplication
 * author : L.DH
 * date : 2023-09-27
 * description : Collections 클래스 : 자료구조의 대표 클래스 유용한 함수들 소개
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-27         L.DH         최초 생성
 */
public class CollectionsApplication {
    public static void main(String[] args) {
        List list = new ArrayList();    // 빈 배열

//      TODO : 1) 데이터 넣기
//       사용법 : Collections.addAll(자료구조, 배열원소, ...)
        System.out.println("----- 1) 데이터 넣기 -----");
        Collections.addAll(list, 1, 2, 3, 4, 5);
//      결과 출력 : [1, 2, 3, 4, 5]
        System.out.println(list);

//      TODO : 2) 오른쪽으로 값을 두 칸 이동
//       사용법 : Collections.rotate(자료구조변수, 이동칸숫자);
        System.out.println("----- 2) 오른쪽으로 값을 두 칸 이동 -----");
        Collections.rotate(list,3);
//      결과 출력 : [4, 5, 1, 2, 3] // 맨 오른쪽 값을 밀어서 앞으로 보냄
        System.out.println(list);

//      TODO : 3) 배열의 원소의 값 서로 맞바꾸기
//       사용법 : Collections.swap(자료구조변수, 원본인덱스, 바꿀인덱스);
        System.out.println("----- 3) 배열의 원소의 값 서로 맞바꾸기 -----");
        Collections.swap(list, 0,2);
//      결과 출력 : [5, 4, 3, 1, 2]
        System.out.println(list);

//      TODO : 4) 배열 원소 무작위로 섞기
//       사용법 : Collections.shuffle(자료구조변수);
        System.out.println("----- 4) 배열 원소 무작위로 섞기 -----");
        Collections.shuffle(list);
//      결과 출력 : [4, 1, 3, 2, 5] // 실행시 결과 값 변동됨
        System.out.println(list);

//      TODO : 5) 정렬 : 오름차순
//       사용법 : Collections.sort(자료구조변수);
        System.out.println("----- 5) 정렬 : 오름차순 -----");
        Collections.sort(list);
//      결과 출력 : [1, 2, 3, 4, 5]
        System.out.println(list);

//      TODO : 6) 정렬 : 내림차순
//       사용법 : Collections.sort(자료구조변수, Collections.reverseOrder());
//        System.out.println("----- 6) 정렬 : 내림차순 -----");
//        Collections.sort(list, Collections.reverseOrder());
//      결과 출력 : [5, 4, 3, 2, 1]
        System.out.println(list);

//      TODO : 7) 이진탐색(반드시 미리 오름차순하고 실행, 내림차순 정렬이 되었을 시 출력이 안됨)
//       사용법 : 임시변수 = Collections.binarySearch(list, 찾을값) => 리턴: 인덱스 번호
//               System.out.println(임시변수);
        System.out.println("--- 7) 이진탐색(미리 오름차순하고 실행) --- ");
        int num = Collections.binarySearch(list,3);
        System.out.println(num);

//      TODO : 8) 최대값/최소값 찾기
//       사용법 : Collections.sort(자료구조변수, Collections.reverseOrder());
        System.out.println("----- 8) 최대값/최소값 찾기 -----");
//      결과 출력 : 최대값 : 5
        System.out.println("최대값 : " + Collections.max(list)); // 최대값
//      결과 출력 : 최소값 : 1
        System.out.println("최소값 : " + Collections.min(list)); // 최소값

//      TODO: 기타 ) Collections.replaceAll(자료구조, 원본값, 바꿀값);
    }
}
