package chap04;

/**
 * packageName : chap04
 * fileName : Sec0401
 * author : GGG
 * date : 2023-09-19
 * description :    조건문
 * 요약 :
 *         - if문 - if(조건문1){실행문1} else if(조건문2){실행문} else{실행문3}
 *          => 조건문1 true 실행문1 실행되고 조건문2 true 실행문2 가 실행되고
 *          모두 아니면 실행문3 실행
 *
 *         - switch문 - switch(변수) { case 값1 : }
 *          실행문1;break;
 *          case 값2 : 실행문2;break;
 *          default : 실행문3; break; (default에 break는 생략 가능)
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-09-19         GGG          최초 생성
 */
public class Sec0401 {
    /**
     * 예제 1 : 초기값이 90 이상이면 점수가 90보다 큽니다.
     * 등급은 A 입니다. 출력
     * 90 이하이면 점수가 90보다 작습니다.
     * 등급은 B 입니다. 출력
     */
    public void exam01() {
        int score = 93; // 초기값

        if (score >= 90) {
            System.out.println("점수가 90보다 큽니다.");
            System.out.println("등급은 A 입니다.");
        } else {
            System.out.println("점수가 90보다 작습니다.");
            System.out.println("등급은 B 입니다.");
        }
    }

    /**
     * 자바 랜덤 함수 소개 하는 예제
     * 랜덤 함수 : Math.random() : 0 ~ 1 사이의 숫자(실수)를 내보내기(return)
     * 1 ~ 10 까지의 정수를 뽑기
     * 가공 :
     * 1 <= x < 11 의 정수 뽑기로 변환
     * 1) 0.0 <= Math.random() < 1.0
     * 2) 0.0 * 10 <= Math.random() * 10 < 1.0 * 10
     * 3) (int)0.0 * 10 <= (int)Math.random() * 10 < (int)1.0 * 10
     * => 0 <= (int)Math.random() * 10 < 10
     * 4) 0 + 1 <= (int)Math.random() * 10 + 1 < 10 + 1
     */
    public void exam02() {
        // 예제 : 주사위를 던져서 나오는 숫자를 화면에 출력하세요.
        // 단, 1 ~ 6 까지의 정수 숫자 범위

        int num = (int)(Math.random() * 6) + 1;    // TODO : 6 (실행할 때마다 값은 바뀐다)

//      조건문
        if (num == 1) {
            System.out.println("1번");
        } else if (num == 2) {
            System.out.println("2번");
        } else if (num == 3) {
            System.out.println("3번");
        } else if (num == 4) {
            System.out.println("4번");
        } else if (num == 5) {
            System.out.println("5번");
        } else {
            System.out.println("6번");
        }
    }

    /**
     * switch 문을 이용해서 코딩하기
     * 예제 : 부장이면 "700만원" 출력하고 , 과장이면 "500만원" 출력하고,
     * 그외에는 "300만원" 을 출력하세요
     */
    public void exam03() {
        String position = "과장"; // 초기값

        switch (position) {
            case "부장" :
                System.out.println("700만원");
                break;

            case "과장" :
                System.out.println("500만원");
                break;

            default :
                System.out.println("300만원");
                break;  // 생략가능
        }
    }
}   // end of class