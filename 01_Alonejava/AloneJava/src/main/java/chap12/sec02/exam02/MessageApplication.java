package chap12.sec02.exam02;

import java.util.LinkedList;
import java.util.Queue;

/**
 * packageName : chap12.sec02.exam02
 * fileName : MessageApplication
 * author : L.DH
 * date : 2023-09-26
 * description : 큐(Queue) 대한 소개 예제
 * 요약 :
 * Stack(스택 : 클래스) : LIFO ( Last In First Out : 꺼낼 때 마지막 넣은게 먼저 나옴) -> 코딩 : Stack 클래스
 * Queue(큐 : 인터페이스)  : FIFO ( First In First Out : 꺼낼 때 첫 번째가 먼저 나옴) -> 코딩 : LinkedList 사용
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-26         L.DH         최초 생성
 */
public class MessageApplication {
    public static void main(String[] args) {
//  TODO : 큐(인터페이스) 객체 생성
        Queue<Message> messageQueue = new LinkedList<>();

//  TODO : 큐에 자료 저장 : .offer(값) 또는 . add값) 사용
        messageQueue.offer(new Message("sendMail", "홍길동"));
        messageQueue.offer(new Message("sendSMS", "신용권"));
        messageQueue.offer(new Message("sendKaKao", "홍두깨"));
//  TODO : 꺼내기 : .poll()
        while (messageQueue.isEmpty() == false) {
            Message message = messageQueue.poll();  // 1st 꺼내기
//          결과 출력 : 홍길동, 신용권, 홍두깨
            System.out.println(message.to);         // 보낼사람이름
        }
    }   // end of main
}   // end of class
