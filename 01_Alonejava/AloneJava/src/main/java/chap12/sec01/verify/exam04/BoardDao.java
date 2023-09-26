package chap12.sec01.verify.exam04;

import java.util.ArrayList;
import java.util.List;

/**
 * packageName : chap12.sec01.verify.exam04
 * fileName : BoardDao
 * author : L.DH
 * date : 2023-09-26
 * description : 연습문제)DAO(DB 접속용 클래스)
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-26         L.DH         최초 생성
 */
public class BoardDao {
    public List<Board> createDept() {
//        내용 완성
//        ArrayList 사용, .add()
        List<Board> list = new ArrayList<>();
        list.add(new Board("제목1", "내용1"));
        list.add(new Board("제목2", "내용2"));
        list.add(new Board("제목3", "내용3"));

        return list;
    }
}
