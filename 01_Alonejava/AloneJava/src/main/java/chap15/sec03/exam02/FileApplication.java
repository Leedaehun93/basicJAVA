package chap15.sec03.exam02;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

/**
 * packageName : chap15.sec03.exam02
 * fileName : FileApplication
 * author : GGG
 * date : 2023-10-02
 * description : File 클래스 : 파일생성 또는 폴더 생성 , 정보 보기 기능
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-10-02         GGG          최초 생성
 */
public class FileApplication {
    public static void main(String[] args) throws Exception {
//      TODO: 1) 텍스트 파일을 읽어서 리스트 배열로 가져오기 : .readAllLines(Paths.get(경로))
        List<String> lines
                = Files.readAllLines(Paths.get("src/main/resources/file1.txt"));
        System.out.println(lines); // 배열 출력

//      TODO: 2) byte 파일을 읽어서 데이터 가져오기
        byte[] bytes = Files.readAllBytes(Paths.get("src/main/resources/test1.db"));
        System.out.println(Arrays.toString(bytes)); // 결과 출력
    }
}
