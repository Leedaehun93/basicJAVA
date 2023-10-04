package chap13.sec01.exam02;

import java.awt.*;

/**
 * packageName : chap13.sec01.exam02
 * fileName : BeepThread
 * author : L.DH
 * date : 2023-10-02
 * description : 2) Thread 클래스를 상속해서 구현하기
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————
 * 2023-10-02         L.DH         최초 생성
 */
public class BeepThread extends Thread {
//  TODO: 쓰레드 작업을 실행시키는 함수
    @Override
    public void run() {
//      TODO: beep 를 들려주는 코드
//         자바 쪽 멀티미디어 객체 : 소리, 그림, 이미지 등등 다루는 객체
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for (int i = 0; i < 5; i++) {
            toolkit.beep(); // 삐소리
            try {
                Thread.sleep(500); // 0.5 삐소리 지연
            } catch (Exception e) {
            }
        }
    }
}