package chap06.Sec03.Verify.exam02;

/**
 * packageName : chap06.Sec03.Verify.exam02
 * fileName : Member
 * author : L.DH
 * date : 2023-09-20
 * description :    회원 관리 클래스(생성자 함수)
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-20         L.DH         최초 생성
 */
public class Member {
//  TODO : 속성(필드), 생성자함수, 함수(메소드)
//  속성
    String name; // 회원명
    String id; // 회원 id

//  매개변수 2개짜리 생성자
    Member(String name, String id){
        this.name = name;
        this.id = name;
    };

}   // end of class
