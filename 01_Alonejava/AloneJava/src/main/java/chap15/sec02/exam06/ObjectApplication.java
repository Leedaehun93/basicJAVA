package chap15.sec02.exam06;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * packageName : chap15.sec02.exam06
 * fileName : ObjectApplication
 * author : GGG
 * date : 2023-10-02
 * description : 객체를 파일에 쓰기를 하는 예제 (보조스트림 사용)
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-10-02         GGG          최초 생성
 */
public class ObjectApplication {
    //    객체 쓰기 공유 함수
    public static void writeList() throws Exception {
//        자료구조 : ArrayList
        List<Board> list = new ArrayList<>(); // List 생성 (ArrayList)

        list.add(new Board(1, "제목1", "내용1", "글쓴이1", new Date()));
        list.add(new Board(2, "제목2", "내용2", "글쓴이2", new Date()));
        list.add(new Board(3, "제목3", "내용3", "글쓴이3", new Date()));

//        TODO: 여기부터 코딩 : 객체 -> 파일에 쓰기(생성)
        FileOutputStream fileOutputStream
                = new FileOutputStream("src/main/resources/board.txt");
//        TODO: 보조스트림 적용 : 객체 쓰기
//             .writeObject(객체배열)
        ObjectOutputStream objectOutputStream
                = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(list); // 객체 -> 파일 쓰기 함수 호출

        objectOutputStream.flush();
        objectOutputStream.close();
    }

    //    객체 읽기 공유 함수
    public static List<Board> readList() throws Exception {
//        TODO: 여기부터 코딩
//            파일 읽기로 접근
        FileInputStream fileInputStream
                = new FileInputStream("src/main/resources/board.txt");
//        TODO: 보조스트림 적용 : 파일 -> 객체 읽기
        ObjectInputStream objectInputStream
                = new ObjectInputStream(fileInputStream);
//        TODO: 파일 -> 객체배열로 원복해서 읽기 : .readObject()
//            대상 객체[배열]은 Serializable 인터페이스를 상속받아야 함
        List<Board> list = (List<Board>)objectInputStream.readObject();
        return list;
    }

    public static void main(String[] args) throws Exception{
        writeList(); // 쓰기 공유 함수 객체배열 List 파일에 쓰기
//        파일에 쓴 것을 읽기
        List<Board> list = readList(); // 읽기 공유 함수(역직렬화)

        System.out.println(list);
    }
}