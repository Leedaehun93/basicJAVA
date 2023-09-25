package chap12.sec01.solution;

import java.util.ArrayList;
import java.util.List;

/**
 * packageName : chap12.sec01.solution
 * fileName : Solution
 * author : L.DH
 * date : 2023-09-25
 * description : 프로그래머스 솔루션 함수 예제(샘플)
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-25         L.DH         최초 생성
 */
public class Solution {
    /**
     * 배열 만들기 1
     * 정수 n과 k가 주어졌을 때,
     * 1 이상 n이하의 정수 중에서
     * k의 배수를 오름차순으로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
     * 입출력 예
     * n   k   result
     * 10   3   [3, 6, 9]
     * 15   5   [5, 10, 15]
     *
     * @param n
     * @param k
     * @return
     */
    public List<Integer> solution100(int n, int k) {
        List<Integer> answer = new ArrayList<>();

//        k의 배수만 넣기 : add()
        for (int i = 1; i <= n; i++) {
            if (i % k == 0) {
//              i값 추적 : 로깅(디버깅의 기초)
//               i의 변하는 값을 화면에 결과 출력 : sout
//                System.out.println("[i] "+i); // i 의 값 추적
                answer.add(i); // i k의 배수임
            }
        }

        return answer;
    }
}
