package chap06.Sec03.Verify.exam03;

/**
 * packageName : chap06.Sec03.Verify.exam03
 * fileName : Board
 * author : L.DH
 * date : 2023-09-20
 * description :    모델 클래스(속성(필드), 생성자함수)
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-20         L.DH         최초 생성
 */
public class Board {
//  TODO : 속성(필드), 생성자함수, 함수(메소드)

//  TODO : 속성
    String title;   // 제목
    String content; // 내용
    String writer; // 작가

//  TODO : 생성자함수
//  매개변수 1개짜리 생성자
    public Board(String title) {
        this.title = title;
    }

//  매개변수 2개짜리 생성자
    public Board(String title, String content) {
        this.title = title;
        this.content = content;
    }

//  매개변수 3개짜리 생성자
    public Board(String title, String content, String writer) {
        this.title = title;
        this.content = content;
        this.writer = writer;
    }
}   // end of class
