package chap15.sec01.exam08;

import java.io.FileWriter;
import java.io.Writer;

/**
 * packageName : chap15.sec01.exam08
 * fileName : WriteApplication
 * author : L.DH
 * date : 2023-09-27
 * description : (I/O 파일 입출력) Stream / 배열 전체를 파일에 쓰기
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-27         L.DH         최초 생성
 */
public class WriteApplication {
    //  TODO : throws Exception
    public static void main(String[] args) throws Exception {
//      TODO : 파일 생성(문자기반)
        Writer writer = new FileWriter("src/main/resources/test8.txt");

//      TODO : 배열 정의
        char[] array = {'A', 'B', 'C'};

//      TODO : 파일(임시버퍼) 쓰기
        writer.write(array);
//
//      TODO : 임시버퍼 -> 진짜 파일 쓰기
        writer.flush();
//
//      TODO : 파일 닫기(읽고, 쓰기 무조건 파일 무조건 닫아줘야 함)
        writer.close();
    }
}
