package chap15.sec01.exam04;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 * packageName : chap15.sec01.exam04
 * fileName : ReadApplication
 * author : L.DH
 * date : 2023-09-27
 * description : (I/O 파일 입출력) Stream / 1byte 씩 파일 읽기(byte 파일 : 이진파일(binary file))
 * 요약 : src/main/resources/test1.db 입력(== 읽기용)
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-27         L.DH         최초 생성
 */
public class ReadApplication {
    //  TODO : throws Exception
    public static void main(String[] args) throws Exception {
//      TODO : 파일 읽기용(==입력용) 파일 접근
        InputStream inputStream =
                new FileInputStream("src/main/resources/test1.db");
//      TODO : 반복문으로 1byte 씩 읽고 화면에 출력하기
        while (true) {
//      TODO : 파일 읽기(1byte) => 리턴 : 읽은 값이(1byte) 리턴됨
//                                => 읽은 값이 파일의 끝에 도달하면 -1 리턴됨
            int data = inputStream.read();
//      TODO : 반복문 종료 조건 : 파일의 끝
            if (data == -1) break; // TODO : 종료 조건
//      TODO : 결과 출력 : 10, 20, 30 읽어 옮.
            System.out.println(data);
        }
//      TODO : 파일 닫기(읽고, 쓰기 무조건 파일 무조건 닫아줘야 함)
        inputStream.close();
    }
}
