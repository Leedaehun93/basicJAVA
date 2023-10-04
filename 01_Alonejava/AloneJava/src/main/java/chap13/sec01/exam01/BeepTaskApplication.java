package chap13.sec01.exam01;

/**
 * packageName : chap13.sec01.exam01
 * fileName : BeepTaskApplication
 * author : L.DH
 * date : 2023-10-02
 * description :
 * 작업쓰레드 #1 : 삐소리
 * main 함수 : 메인 쓰레드 : 화면출력 : 띵 글자 5번 출력
 * 동시 실행
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————
 * 2023-10-02         L.DH         최초 생성
 */
public class BeepTaskApplication {
    public static void main(String[] args) {
//      TODO: 1) 작업쓰레드 객체 생성
        Runnable runnable = new BeepTask(); // 다형성
//      TODO: 2) 쓰레드 생성자의 매개변수로 전달
        Thread thread = new Thread(runnable);
//      TODO: 3) 작업쓰레드 # 1 : 삐소리 실행 (run() 실행됨)
        thread.start();

//      TODO: 4) 메인쓰레드 : 화면에 띵 글자 출력
        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(500); // 0.5 지연
            } catch (Exception e) {
            }
        }
    }
}