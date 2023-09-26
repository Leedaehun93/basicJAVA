package chap12.sec01.verify.exam04;
import java.util.List;

/**
 * packageName : chap12.sec01.verify.exam04
 * fileName : ListApplication
 * author : kangtaegyung
 * date : 2022/10/03
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/03         kangtaegyung          최초 생성
 */
// TODO: 연습문제) BoardDao 의 createBoard() 함수에는 List 자료구조를 이용해
//       아래의 값이 추가되어 있다. Board 객체와 실행클래스 BoardApplication 를 작성해서 아래 결과가 나오도록 코딩하세요
//    단, Board 객체의 속성명은 아래의 이름을 사용하고, createBoard() 함수를 이용해서 자료를 생성하세요.
//       title // 제목 속성
//       content // 내용 속성
//    결과 :
//      제목1-내용1
//      제목2-내용2
//      제목3-내용3
public class BoardApplication {
    public static void main(String[] args) {
        BoardDao dao = new BoardDao();
//        List 배열 : Board 객체에 저장되어 있는 값이 들어감
        List<Board> list = dao.createDept();

//        List 배열 내용 출력
        for(Board board : list) {
            System.out.println(board.getTitle() + "-" + board.getContent());
        }
    }
}