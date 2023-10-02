package chap15.sec02.exam05;

import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * packageName : chap15.sec02.exam05
 * fileName : PrintApplication
 * author : GGG
 * date : 2023-10-02
 * description : 프린터 보조 스트림(printstream.txt 내용 보내기)
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-10-02         GGG          최초 생성
 */
public class PrintApplication {
    public static void main(String[] args) throws Exception {
//      TODO: 파일 쓰기용으로 생성
        FileOutputStream fileOutputStream
                = new FileOutputStream("src/main/resources/printstream.txt");

//      TODO: 보조스트림 적용 : .print(), .println() 함수가 있는 보조스트림
        PrintStream printStream =
                new PrintStream(fileOutputStream);

//      TODO: 파일에 한줄씩 내용쓰기
        printStream.println("프린터 보조 스트림"); // 줄바꿈 출력
        printStream.print("마치");  // 줄바꿈 없음
        printStream.println("프린터가 출력되는 것처럼"); // 줄바꿈 출력
        printStream.println("파일에 작성합니다."); // 줄바꿈 출력

        printStream.flush(); // 기본버퍼 -> 진짜 파일쓰기
        printStream.close();

    }
}
