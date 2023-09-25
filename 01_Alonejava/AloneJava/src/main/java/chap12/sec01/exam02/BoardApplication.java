package chap12.sec01.exam02;

import java.util.List;
import java.util.Vector;

/**
 * packageName : chap12.sec01.exam02
 * fileName : BoardApplication
 * author : L.DH
 * date : 2023-09-25
 * description : 벡터(Vector) 실행 클래스(main)
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-25         L.DH         최초 생성
 */
public class BoardApplication {
    public static void main(String[] args) {
//      벡터 객체 생성 : 다형성 이용
//      TODO : Vector 의 부모 :
//       List ( add() : 추가, get() : 조회, set() : 수정, remove() : 삭제 )
        List<Board> list = new Vector<>();
//      객체 추가
        list.add(new Board("제목1", "내용1", "글쓴이1"));
        list.add(new Board("제목2", "내용2", "글쓴이2"));
        list.add(new Board("제목3", "내용3", "글쓴이3"));
        list.add(new Board("제목4", "내용4", "글쓴이4"));
        list.add(new Board("제목5", "내용5", "글쓴이5"));

//      결과 출력
        System.out.println(list);
        System.out.println(list.toString()); // 속성 : toString() : list 에서 생략해도 됨(자동 실행)해시코드 : 메모리 방번호가 출력됨
// =>   해시코드로 보이던 부분이 [chap12.sec01.exam02.Board@fe135978, ... chap12.sec01.exam02.Board@fe1368fc]
//      chap12.sec01.exam02 파일에서 함수 재정의(오버라이딩) toString()를 통해 [[제목1,내용1,글쓴이1], ... [제목5,내용5,글쓴이5]] 속성의 값을 보여준다.

//      삭제 2건
        list.remove(2); // 2번 삭제 후 자동으로 자료가 당겨짐
        list.remove(3);

//      결과 출력
        System.out.println(list);
        // [[제목1,내용1,글쓴이1], [제목2,내용2,글쓴이2], [제목4,내용4,글쓴이4]]

    }
}
