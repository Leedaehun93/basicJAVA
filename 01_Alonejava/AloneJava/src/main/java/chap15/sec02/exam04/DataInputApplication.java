package chap15.sec02.exam04;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * packageName : chap15.sec02.exam04
 * fileName : DataInputApplication
 * author : GGG
 * date : 2023-10-02
 * description : 보조스트림 : 기본 자료형으로 입출력하기
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-10-02         GGG          최초 생성
 */
public class DataInputApplication {
    public static void main(String[] args) throws Exception {
//      TODO: 파일 쓰기용으로 파일 생성
        FileOutputStream fileOutputStream
                = new FileOutputStream("src/main/resources/primitive.txt");

//      TODO: 보조스트림 : 기본 자료형 사용하게 만들어 주는 스트림
//            new DataOutputStream(기본스트림)
        DataOutputStream dataOutputStream
                = new DataOutputStream(fileOutputStream);

//      TODO: .writeUTF("문자열") : 파일에 문자열 쓰기
//            .writeDouble(실수)  : 파일에 실수 쓰기
//            .writeInt(정수)     : 파일에 정수 쓰기
        dataOutputStream.writeUTF("홍길동");
        dataOutputStream.writeDouble(95.4);
        dataOutputStream.writeInt(1);

//        TODO: 여기서 부터 코딩
        dataOutputStream.writeUTF("감자바");
        dataOutputStream.writeDouble(90.3);
        dataOutputStream.writeInt(2);
//        TODO: 파일 닫기
        dataOutputStream.flush(); // 기본 버퍼 -> 진짜 파일 쓰기
        dataOutputStream.close();

//        ---------------------------------------------------------
//        파일 읽기
//        ---------------------------------------------------------
//      TODO: 파일 읽기용으로 파일 접근
        FileInputStream fileInputStream
                = new FileInputStream("src/main/resources/primitive.txt");

//      TODO: 보조 스트림 적용 : 기본자료형 기능 추가
        DataInputStream dataInputStream
                = new DataInputStream(fileInputStream);
//      TODO: 반복문 실행 후 화면에 출력 : 2번 실행
//            주의점 : 출력순서에 맞게 자료형을 읽어야 함
        for (int i = 0; i < 2; i++) {
            String name   = dataInputStream.readUTF(); // 파일에서 읽기
            double score  = dataInputStream.readDouble(); // 파일에서 읽기
            int order     = dataInputStream.readInt(); // 파일에서 읽기
            System.out.println(name + ", " + score + ", " + order);
        }
        dataInputStream.close();
        fileInputStream.close();

    }
}







