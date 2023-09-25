package chap12.sec01.solution;

import java.util.List;

/**
 * packageName : chap12.sec01.solution
 * fileName : SolutionApplication
 * author : L.DH
 * date : 2023-09-25
 * description : tlfgod zmffotm
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-25         L.DH         최초 생성
 */
public class SolutionApplication {
    public static void main(String[] args) {
        /**
         * 배열 만들기 1
         * 정수 n과 k가 주어졌을 때,
         * 1 이상 n이하의 정수 중에서
         * k의 배수를 오름차순으로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
         *입출력 예
         * n	k	result
         * 10	3	[3, 6, 9]
         * 15	5	[5, 10, 15]
         * @param n
         * @param k
         * @return
         */
        Solution solution = new Solution();
        List<Integer> answer = solution.solution100(10, 3);
        System.out.println(answer);

    }
}
