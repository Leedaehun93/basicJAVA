package chap15.sec01.exam10;

import java.io.FileWriter;
import java.io.Writer;

/**
 * packageName : chap15.sec01.exam10
 * fileName : WriteApplication
 * author : L.DH
 * date : 2023-09-27
 * description : (I/O 파일 입출력) Stream / 문자열을 파일에 쓰기
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
        Writer writer = new FileWriter("src/main/resources/test10.txt");

//      TODO : 문자열 준비
        String str = "ABC";
//
//      TODO : 임시버퍼 -> 진짜 파일 쓰기
        writer.write(str);  // ABC
//
//      TODO : TODO: 버퍼 -> 파일 쓰기 , 닫기(파일 무조건 닫아줘야 함)
        writer.flush();
        writer.close();
    }
}