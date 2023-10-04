package chap13.sec01.exam02;

/**
 * packageName : chap13.sec01.exam02
 * fileName : BeepThreadApplication
 * author : L.DH
 * date : 2023-10-02
 * description : 상속받은 쓰레드 실행
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————
 * 2023-10-02         L.DH         최초 생성
 */
public class BeepThreadApplication {
    public static void main(String[] args) {
//	TODO : 1) 쓰레드 객체 생성
        Thread thread = new BeepThread();   // 다형성
//	TODO : 2) 쓰레드 실행 #1 : 내부적으로 run() 함수가 실행됨
        thread.start();

//	TODO : 3) main 쓰레드 작업 #2 : 화면 출력 (띵 5번 출력)
        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(500); // 0.5초 지연
            } catch (Exception e) {
            }
        }
    }
}