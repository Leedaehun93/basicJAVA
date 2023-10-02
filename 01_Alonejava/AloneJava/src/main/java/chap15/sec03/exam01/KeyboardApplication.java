package chap15.sec03.exam01;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * packageName : chap15.sec03.exam01
 * fileName : KeyboardApplication
 * author : GGG
 * date : 2023-10-02
 * description : 키보드로 부터 한줄씩 문자열 얻어서 출력하기
 * 요약 :
 * System.in  : 키보드로부터의 입력의 의미
 * System.out : 모니터로 출력의 의미
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-10-02         GGG          최초 생성
 */
public class KeyboardApplication {
    public static void main(String[] args) throws Exception {
//      TODO: 키보드 입력 -> byte 입력스트림에 넣기
        InputStream inputStream = System.in;
//      TODO: 보조스트림 적용 #1 : byte -> char 기반으로 변경
        Reader reader = new InputStreamReader(inputStream);
//      TODO: 보조스트림 적용 #2 : 버퍼 추가
//           보조기능 #1 + #2 가 적용된 스트림
//           Scanner 객체가 위의 기능을 모두 가지고 있음
        BufferedReader bufferedReader
                = new BufferedReader(reader);
//      TODO: 무한 반복문
        while (true) {
            String str = bufferedReader.readLine(); // 1줄씩 읽기
            if (str.equals("q") || str.equals("quit")) break; // 종료조건
            System.out.println(str);
        }
        bufferedReader.close();
    }
}
