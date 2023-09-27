package chap15.sec01.exam03;

import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * packageName : chap15.sec01.exam03
 * fileName : WriteApplication
 * author : L.DH
 * date : 2023-09-27
 * description : (I/O 파일 입출력) Stream / 배열 중 일부 데이터만 파일에 쓰기
 * 요약 : src/main/resources/test3.txt 파일 출력용(==쓰기용)
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-27         L.DH         최초 생성
 */
public class WriteApplication {
    // TODO : throws Exception
    public static void main(String[] args) throws Exception {
//      TODO : 파일을 쓰기용(출력용)으로 열기
        OutputStream outputStream =
                new FileOutputStream("src/main/resources/test3.txt"); // 경로에 test3.txt 이진파일로 되어있음(binary file)
//      TODO : 배열 일부만 쓰기
        byte[] array = {10, 20, 30, 40, 50};
//      TODO : outputStream.write(배열변수, 시작인덱스, 개수);
        outputStream.write(array, 1, 3);    // 20, 30, 40
//      TODO : 버퍼 -> 파일
        outputStream.flush();
//      TODO : 파일 닫기(읽고, 쓰기 무조건 파일 무조건 닫아줘야 함)
        outputStream.close();   // 파일 닫기
    }
}