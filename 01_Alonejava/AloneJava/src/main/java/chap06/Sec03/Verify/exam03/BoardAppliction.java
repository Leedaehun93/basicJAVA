package chap06.Sec03.Verify.exam03;

/**
 * packageName : chap06.Sec03.Verify.exam03
 * fileName : BoardAppliction
 * author : L.DH
 * date : 2023-09-20
 * description :    실행 클래스(Main)
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-20         L.DH         최초 생성
 */
public class BoardAppliction {
    public static void main(String[] args) {
        Board board = new Board("제목");
        Board board2 = new Board("제목", "내용");
        Board board3 = new Board("제목", "내용", "작가");

        System.out.println("title : " + board.title);
        System.out.println("=======================");
        System.out.println("title2 : " + board2.title);
        System.out.println("content2 :" + board2.content);
        System.out.println("=======================");
        System.out.println("title3 : " + board3.title);
        System.out.println("content3 : " + board3.content);
        System.out.println("content3 : " + board3.writer);
    }   // end of main

}   // end of class