package chap13.sec02.server;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

/**
 * packageName : chap12.chatting.server
 * fileName : SendThread
 * author : ds
 * date : 2022-10-06
 * description : 서버용 Sender(출력용:글자쓰기) 쓰레드
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-06         ds          최초 생성
 */
public class SendThread extends Thread{
//	TODO : 네트워크 통신 소켓 정의
    private final Socket socket;
//	TODO : 키보드 입력 객체 정의
    private Scanner scanner = new Scanner(System.in);
//	TODO : 생성자
    public SendThread(Socket socket) {
        this.socket = socket;
    }

//  TODO: 쓰레드 실행 : run() 함수
    @Override
    public void run() {
        try {
//	        TODO : byte 입출력 객체 : InputStream/OutPutStream 사용
//	        TODO : 문자열 쓰기 기능이 있는 DataOutputStream 사용
//              사용법 : new DataOutputStream(기본스트림)
            DataOutputStream dataOutputStream =
                    new DataOutputStream(socket.getOutputStream());
            String sendString;
//	        TODO : 무한 반복문(계속 채팅)
            while (true) {
//	        TODO : 1) 채팅 키보드 입력 받기
                sendString = scanner.nextLine();
//	        TODO : 2) 네트웍으로 메세지 전송 : writeUTF(메세지)
                dataOutputStream.writeUTF(sendString);
//	        TODO : 3) 기본버퍼 -> 진짜 네트웍 전송
                dataOutputStream.flush();
            }
        } catch (IOException e) {
            e.getStackTrace(); // 에러 코드 및 메세지 화면 출력
        }
    }
}