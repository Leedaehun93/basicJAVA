package chap15.sec01.exam11;

import java.io.FileReader;
import java.io.Reader;


/**
 * packageName : chap15.sec01.exam11
 * fileName : ReadApplication
 * author : L.DH
 * date : 2023-09-27
 * description : (I/O 파일 입출력) Stream / 1 문자씩 읽기
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-27         L.DH         최초 생성
 */
public class ReadApplication {
    //  TODO : throws Exception
    public static void main(String[] args) throws Exception {
//      TODO : 파일 읽기용(입력용)으로 접근
        Reader reader = new FileReader("src/main/resources/test7.txt");

//      TODO : 무한 반복문 실행
        while (true) {
//      TODO : 1문자씩 읽기(자동증가) => 리턴 : 아스키코드값이 리턴됨
            int data = reader.read();
//            TODO: 종료 조건 : 파일의 끝 : -1
            if (data == -1) break;
//            TODO: 읽은 것을 화면 출력
//      TODO : 결과 출력 : A, B, C
            System.out.println((char) data); // 아스키코드값 -> 문자로 변환
        }
        reader.close(); // TODO : 파일 닫기
    }
}