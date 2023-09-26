package chap12.sec02.exam01;

import java.util.Stack;

/**
 * packageName : chap12.sec02.exam01
 * fileName : StackApplication
 * author : L.DH
 * date : 2023-09-26
 * description : 스택에(Stack) 대한 소개 예제
 * 요약 :
 * Stack(스택 : 클래스) : LIFO ( Last In First Out : 꺼낼 때 마지막 넣은게 먼저 나옴) -> 코딩 : Stack 클래스
 * Queue(큐 : 인터페이스)  : FIFO ( First In First Out : 꺼낼 때 첫 번째가 먼저 나옴) -> 코딩 : LinkedList 사용
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-26         L.DH         최초 생성
 */
public class StackApplication {
    public static void main(String[] args) {
//  TODO : 스택 객체 정의
        Stack<Coin> coinStack = new Stack<>();
//  TODO : Coin 객체 추가 : .push(값)
        coinStack.push(new Coin(100));  // 100 원 TODO: (1st)
        coinStack.push(new Coin(50));   // 50 원
        coinStack.push(new Coin(500));  // 500 원
        coinStack.push(new Coin(10));   // 10 원 TODO: (Last) => 꺼낼 때 먼저 나옴

//  TODO : Coin 객체 꺼내기 : .pop() (순차적으로 마지막 값을 꺼냄)
//    참고) 현재 마지막 값 조회하기 : .peek()
        while (coinStack.isEmpty() == false) {
            Coin coin = coinStack.pop();    // 마지막 코인 꺼내기
//  결과 출력 : 꺼낸 동전 : 10원, //꺼낸 동전 : 500원, //꺼낸 동전 : 50원, //꺼낸 동전 : 100원
            System.out.println("꺼낸 동전 : " + coin.getValue() + "원");
        }

    }   // end of main
} // end of class
