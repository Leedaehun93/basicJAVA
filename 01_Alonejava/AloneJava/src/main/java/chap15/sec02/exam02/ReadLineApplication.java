package chap15.sec02.exam02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

/**
 * packageName : chap15.sec02.exam02
 * fileName : ReadLineApplication
 * author : L.DH
 * date : 2023-09-27
 * description : 보조스트림 : 라인 단위로 화면에 출력하기 + 성능향상
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-27         L.DH         최초 생성
 */
public class ReadLineApplication {
    public static void main(String[] args) throws Exception {
//      TODO : 문자기반(char) 파일 읽기용으로 접근
        Reader reader
                = new FileReader("src/main/resources/language.txt");


//      TODO : 보조스트림 : new 보조스트림(기본스트림)
        BufferedReader bufferedReader
                = new BufferedReader(reader);

//      TODO : BufferedReader 클래스 : /readLine() : 1줄씩 읽기
        while (true) {
            String data = bufferedReader.readLine();    // TODO : 1줄씩 읽기
//      TODO : 파일의 끝 : null
            if (data == null) break;
//      TODO : 화면 출력 : C 嶺,  Java 嶺, Python 嶺
            System.out.println(data);
        }
        bufferedReader.close();                         // TODO : 파일 닫기
    }
}
