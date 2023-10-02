package chap15.sec02.exam03;

import java.io.*;

/**
 * chap15.sec02.exam03
 * packageName :
 * fileName : BufferApplication
 * author : GGG
 * date : 2023-10-02
 * description : 파일 복사 성능 테스트( 일반 복사 vs 버퍼 사용 복사 )
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-10-02         GGG          최초 생성
 */
public class BufferApplication {

    static int data = -1;

//    TODO: 정적(전역, 공유)함수 : 파일 copy 함수
    public static long copy(InputStream is, OutputStream os) throws Exception {
//      복사하는 데 걸린 시간 체크 : 시작시간 체크
        long start = System.nanoTime();

//      복사 실행 코드
        while (true) {
            data = is.read(); // 읽기(원본)
            if (data == -1) break; // 반복문 종료 조건(파일의 끝 : -1 리턴)
            os.write(data);   // 다른 파일에 쓰기(복사본)
        }

//      종료시간 체크
        long end = System.nanoTime();

        return (end - start); // 걸린 시간 리턴
    }

    public static void main(String[] args) throws Exception {
//      TODO: 원본 이미지 경로 지정
        String orgImgPath = "src/main/resources/images/boy.jpg";    // 일반복사 파일
        String orgImgPath2 = "src/main/resources/images/girl.jpg";  // 버퍼복사 파일

//      TODO: 복사본 이미지 경로 지정
        String cpyImgPath = "src/main/resources/images/boy_copy.jpg";   // 일반복사 파일
        String cpyImgPath2 = "src/main/resources/images/girl_copy.jpg"; // 버퍼복사 파일

//      FileInputStream : 기본스트림 중 1개
//      TODO: 파일 읽기용으로 원본 이미지 접근
        FileInputStream fileInputStream
                = new FileInputStream(orgImgPath);
//      TODO: 파일 쓰기용으로 복사본 이미지 생성
        FileOutputStream fileOutputStream
                = new FileOutputStream(cpyImgPath);

//      TODO: 복사함수(copy)를 이용해서 복사본 이미지 생성 + 소요시간 측정(리턴)
        long nonBufferTime = copy(fileInputStream, fileOutputStream);
        System.out.println("버퍼를 사용하지 않았을때 :" + nonBufferTime + "ns");

        fileInputStream.close();
        fileOutputStream.close();

//        ------------------- 버퍼 써서 파일 복사 ------------------
//        TODO: 여기부터 코딩
//        TODO: 파일 읽기용으로 원본 이미지 접근 : girl.jpg(이미지경로 : orgImgPath2)
        FileInputStream fileInputStream2
                = new FileInputStream(orgImgPath2);
//        TODO: 파일 쓰기용으로 복사본 이미지 생성 : (이미지경로 : cpyImgPath2)
        FileOutputStream fileOutputStream2
                = new FileOutputStream(cpyImgPath2);

//        TODO: 보조스트림(buffer) 적용 : new 보조스트림생성자(기본스트림)
        BufferedInputStream bufferedInputStream
                = new BufferedInputStream(fileInputStream2); // 읽기용(원본)
        BufferedOutputStream bufferedOutputStream
                = new BufferedOutputStream(fileOutputStream2); // 쓰기용(복사본)

//        TODO: 복사(copy)와 함께 소요시간(리턴값) 체크
        long bufferTime = copy(bufferedInputStream, bufferedOutputStream);
        System.out.println("버퍼 사용 : " + bufferTime + "ns");

//        TODO: 파일 닫기
        bufferedInputStream.close();
        bufferedOutputStream.close();
    }

}