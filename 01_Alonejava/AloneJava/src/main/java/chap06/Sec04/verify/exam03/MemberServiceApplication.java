package chap06.Sec04.verify.exam03;

/**
 * packageName : chap06.Sec04.verify.exam03
 * fileName : MemberServiceApplication
 * author : L.DH
 * date : 2023-09-20
 * description :    실행 클래스(main)
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-20         L.DH         최초 생성
 */

/**
 * MemberService 클래스에 login() 함수와 logout() 함수를 선언하려고 합니다. 클래스를 작성하세요.
 * login() 함수를 호출할 때에는 매개값으로 id와 password를 제공하고,
 * logout() 함수는 id만 매개값으로 제공합니다.
 * MemberService 클래스와 login(), logout() 함수를 선언해 보세요.
 * login() 함수는 매개값 id가 "hong", 매개값 password 가 "12345" 일 경우에만 true 로 리턴하고,
 * 그 이외의 값일 경우에는 false 를 리턴하세요.
 * logout() 함수의 내용은 "hong이 로그아웃 되었습니다."가 출력되도록 하세요.
 * 리턴타입 : boolean, 함수명 : login, 매개변수타입 : id(String), password(String)
 * 리턴타입 : void, 함수명 : logout, 매개변수타입 : id(String)
 * 결과 :
 * 로그인 되었습니다.
 * hong이 로그아웃 되었습니다.
 */

public class MemberServiceApplication {
    public static void main(String[] args) {
        MemberService memberService = new MemberService();

        boolean result = memberService.login("hong", "12345");
        if (result) {
            System.out.println("로그인 되었습니다.");
            memberService.logout("hong");
        } else {
            System.out.println("id 또는 password가 올바르지 않습니다.");
        }
    }   // end of main
}   // end of class
