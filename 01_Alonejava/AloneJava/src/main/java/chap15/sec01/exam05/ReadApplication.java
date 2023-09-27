package chap15.sec01.exam05;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 * packageName : chap15.sec01.exam05
 * fileName : ReadApplication
 * author : L.DH
 * date : 2023-09-27
 * description : (I/O 파일 입출력) Stream / 배열의 크기만큼 파일에서 읽기
 * 요약 : src/main/resources/test2.db 입력(== 읽기용)
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-27         L.DH         최초 생성
 */
public class ReadApplication {
    //  TODO : throws Exception
    public static void main(String[] args) throws Exception {
//      TODO : 파일 읽기용(입력)으로 접근
        InputStream inputStream =
                new FileInputStream("src/main/resources/test2.db");

//      TODO : 성능향상 : 1byte -> 여러 byte씩 한 번에 읽기        
        byte[] buffer = new byte[100]; // 배열 100의 크기

//      TODO : 무한 반복문
        while (true) {
//      TODO : 파일 읽기 : buffer(배열크기만큼)
//       => buffer : 파일에서 읽은 내용이 저장            
//       => 리턴 : 파일에서 읽은 byte 수가 리턴됨, 파일의 끝 : -1
            int data = inputStream.read(buffer);
            if (data == -1) break;   // TODO : 종료 조건
//      TODO : 읽은 내용 화면 출력 : buffer 배열 출력
            for (int i = 0; i < data; i++) {
//      TODO :결과 출력 : 10, 20, 30
                System.out.println(buffer[i]);
            }
//      TODO : 파일 닫기(읽고, 쓰기 무조건 파일 무조건 닫아줘야 함)
            inputStream.close(); // 파일 닫기
        }
    }
}
