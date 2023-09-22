package chap06.Sec04.verify.exam03;

/**
 * packageName : chap06.Sec04.verify.exam03
 * fileName : MemberService
 * author : L.DH
 * date : 2023-09-20
 * description :    회원 관리 모델 클래스
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-20         L.DH         최초 생성
 */
public class MemberService {
// TODO: login 함수 :  id 가  "hong" 이고(&&) password 가 "12345" => true 리턴
// TODO : 속성(필드), 사용자함수, 함수(메소드)
// 속성생략
// 생성자생략
    boolean login(String id, String password) {
//  로직 완성하기
        if (id.equals("hong") && password.equals("12345")) {
            return true;
        } else {
            return false;
        }
    }

//  TODO: logout 함수 : 매개변수 id(문자열) : "hong이 로그아웃 되었습니다."가 출력
//                    logout("hong")
    void logout(String id) {
//        sout : id + "이 로그아웃 되었습니다."
        System.out.println(id + "이 로그아웃 되었습니다.");
    }

}   // end of class
