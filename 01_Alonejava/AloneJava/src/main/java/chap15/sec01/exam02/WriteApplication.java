package chap15.sec01.exam02;

import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * packageName : chap15.sec01.exam02
 * fileName : WriteApplication
 * author : L.DH
 * date : 2023-09-27
 * description : (I/O 파일 입출력) Stream / 1byte 배열을 파일에 쓰기(출력)
 * 요약 : src/main/resources/test2.db 파일 출력용(==쓰기용)
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-27         L.DH         최초 생성
 */
public class WriteApplication {
    // TODO : throws Exception
    public static void main(String[] args) throws Exception {
//      TODO: 파일을 쓰기용(출력용)으로 열기
        OutputStream outputStream =
                new FileOutputStream("src/main/resources/test2.db"); // 경로에 test2.db 이진파일로 되어있음(binary file)

//      TODO: 배열 준비
        byte[] array = {10, 20, 30};
//      TODO: 배열 -> 파일에(버퍼) 쓰기 : outputStream.write(배열)
        outputStream.write(array);
//      TODO: 버퍼 내용 -> 진짜 파일 쓰기
        outputStream.flush();
//      TODO : 파일 닫기(읽고, 쓰기 무조건 파일 무조건 닫아줘야 함)
        outputStream.close();
    }
}