package chap11.sec01.exam04;

/**
 * packageName : chap11.sec01.exam04
 * fileName : ExitApplication
 * author : L.DH
 * date : 2023-09-26
 * description : System 클래스의 함수들 exit()
 * 요약 : 프로그램을 강제 종료
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-26         L.DH         최초 생성
 */
public class ExitApplication {
    public static void main(String[] args) {
//  TODO : 0 ~ 10까지 수중에 값이 5일때 프로그램을 강제 종료하세요.
        for (int i = 0; i < 10; i++) {
            if(i == 5) {
//                  break;  // 반복문 종료
                System.exit(i); // TODO : 프로그램 강제 종료(kill), 밑에 코드가 실행안됨
            }
        }
        System.out.println("이 코드 실행?"); // 실행 안됨
    }

}   // end of class
