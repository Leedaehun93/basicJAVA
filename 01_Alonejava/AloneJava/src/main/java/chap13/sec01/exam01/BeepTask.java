package chap13.sec01.exam01;

import java.awt.*;

/**
 * packageName : chap13.sec01.exam01
 * fileName : BeepTask
 * author : L.DH
 * date : 2023-10-02
 * description : 1) 쓰레드 : 병렬 처리 : 프로세스(동시 처리) 해보기
 * 요약 :
 * 프로세스 : 실행중인 프로그램
 * 쓰레드   : 프로세스 안에 여러가지 작업들을 의미, 동시 실행 가능(병렬처리)
 * 생성 방법 1 : 인터페이스 상속 이용
 * 생성 방법 2 : 인터페이스 부모 클래스 상속 이용
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————
 * 2023-10-02         L.DH         최초 생성
 */
public class BeepTask implements Runnable {
    //  TODO : alt + insert => 메서드 구현 클릭
//      쓰레드 작업을 실행시키는 함수
    @Override
    public void run() {
//  TODO : 예제 : 삐소리를 들려주는 코딩
//               멀티 미디어 객체 가져오기
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for (int i = 0; i < 5; i++) {
            toolkit.beep(); // 컴퓨터 삐소리
            try {
                Thread.sleep(500); // 0.5초 지연 그후 삐 소리
            } catch (Exception e) {

            }
        }
    }

}