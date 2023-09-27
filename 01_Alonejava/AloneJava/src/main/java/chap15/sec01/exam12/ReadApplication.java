package chap15.sec01.exam12;

import java.io.FileReader;
import java.io.Reader;
import java.io.Writer;

/**
 * packageName : chap15.sec01.exam12
 * fileName : ReadApplication
 * author : L.DH
 * date : 2023-09-27
 * description : 배열의 길이만큼 읽기
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
//      TODO : 파일 읽기용으로 접근(문자기반)
        Reader reader = new FileReader("src/main/resources/test8.txt");

//      TODO : 버퍼 배열 준비 : 속도 향상 -> 배열크기만큼 1번에 읽기
        char[] buffer = new char[100];

//      TODO : 무한 반복문 실행
        while (true) {
//      TODO : 파일 읽기(배열크기만큼) : buffer 에 읽은 내용이 저장됨
//             리턴 : 읽은 문자수, 파일의 끝 : -1
            int readNum = reader.read(buffer);
//            TODO: 종료 조건 : 파일의 끝 : -1
            if (readNum == -1) break;
//            TODO: 읽은 것을 화면 출력
            for (int i = 0; i < readNum; i++) {
//      TODO : 결과 출력 : A, B, C
                System.out.println(buffer[i]);
            }
        }
        reader.close(); // TODO : 파일 닫기
    }
}