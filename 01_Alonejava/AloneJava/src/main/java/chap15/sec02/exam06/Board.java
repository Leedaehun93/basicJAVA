package chap15.sec02.exam06;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 * packageName : chap14.sec02.exam06
 * fileName : Board
 * author : ds
 * date : 2022-10-07
 * description : 게시판 객체
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-07         ds          최초 생성
 */
// 모델(Model) : 순수객체, 속성, 생성자, Setter/Getter, 그외에 로직을 구하는 함수는 없음
//    목적 : 데이터 저장용/검색용
// Service : 업무가 들어가 있는 클래스(객체)
// Controller : 여러 화면을(View) 조작하는(컨트롤하는) 클래스
//    MVC 디자인패턴(종합편) : M(Model) / V(View) / C(Controller)
public class Board implements Serializable {
    //    속성
//    게시판 번호
    private int bno;
    //    제목
    private String title;
    //    내용
    private String content;
    //    작성자
    private String writer;
    //    날짜
    private Date date;

    //    생성자
    public Board(int bno, String title, String content, String writer, Date date) {
        this.bno = bno;
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.date = date;
    }

    //    함수 재정의
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Board board = (Board) o;
        return bno == board.bno && Objects.equals(title, board.title) && Objects.equals(content, board.content) && Objects.equals(writer, board.writer) && Objects.equals(date, board.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bno, title, content, writer, date);
    }

    @Override
    public String toString() {
        return "Board{" +
                "bno=" + bno +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", writer='" + writer + '\'' +
                ", date=" + date +
                '}';
    }
}