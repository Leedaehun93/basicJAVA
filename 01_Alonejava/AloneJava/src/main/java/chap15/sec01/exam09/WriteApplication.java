package chap15.sec01.exam09;

import java.io.FileWriter;
import java.io.Writer;

/**
 * packageName : chap15.sec01.exam09
 * fileName : WriteApplication
 * author : L.DH
 * date : 2023-09-27
 * description : (I/O 파일 입출력) Stream / 배열에 일부 파일에 쓰기
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
        Writer writer = new FileWriter("src/main/resources/test9.txt");

//      TODO : 배열 정의
        char[] array = {'A', 'B', 'C', 'D', 'E'};

//      TODO : 파일(임시버퍼) 일부만 쓰기
        writer.write(array, 1, 3); // BCD

//      TODO : TODO: 버퍼 -> 파일 쓰기 , 닫기(파일 무조건 닫아줘야 함)
        writer.flush();
        writer.close();
    }
}