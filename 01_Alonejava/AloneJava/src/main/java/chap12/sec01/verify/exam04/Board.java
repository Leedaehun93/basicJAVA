package chap12.sec01.verify.exam04;

/**
 * packageName : chap12.sec01.verify.exam04
 * fileName : Board
 * author : L.DH
 * date : 2023-09-26
 * description : 연습문제)객체 클래스
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-26         L.DH         최초 생성
 */
public class Board {
//  TODO : 속성
    public String Title;
    public String Content;

//  TODO : 기본 생성자, full 속성 생성자
    public Board() {
    }

    public Board(String title, String content) {
        Title = title;
        Content = content;
    }

//  TODO : getter 함수
    public String getTitle() {
        return Title;
    }

    public String getContent() {
        return Content;
    }
}
