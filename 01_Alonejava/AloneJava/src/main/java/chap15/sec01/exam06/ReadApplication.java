package chap15.sec01.exam06;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 * packageName : chap15.sec01.exam06
 * fileName : ReadApplication
 * author : L.DH
 * date : 2023-09-27
 * description : (I/O 파일 입출력) Stream / 파일에서 지정된 길이만큼만 읽기
 * 요약 : src/main/resources/test3.txt 입력(== 읽기용)
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-27         L.DH         최초 생성
 */
public class ReadApplication {
    //  TODO : throws Exception
    public static void main(String[] args) throws Exception {
//      TODO : 파일 읽기로(입력용) 열기
        InputStream inputStream =
                new FileInputStream("src/main/resources/test3.txt");

//      TODO : 읽기용 배열 크기 지정
        byte[] buffer = new byte[5]; // 배열 크기 5

//      TODO : 일부만 읽기 : (인덱스 2번부터 읽어서 3개 저장 : buffer)
        int data = inputStream.read(buffer, 2, 3);
//      TODO : 반복문 조건 : 파일의 끝에 도달하지 않았을 때
        if (data != -1) {
            for (int i = 0; i < buffer.length; i++) {
//      TODO : 결과 출력 : 0, 0, 20, 30, 40 // array = {10, 20, 30, 40, 50}
                System.out.println(buffer[i]);
            }
//      TODO : 파일 닫기(읽고, 쓰기 무조건 파일 무조건 닫아줘야 함)
            inputStream.close();

        }
    }
}
