package chap13.sec02.client;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

/**
 * packageName : chap12.chatting.client
 * fileName : SendThread
 * author : kangtaegyung
 * date : 2022/10/04
 * description : 클라이언트 센더
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/10/04         kangtaegyung          최초 생성
 */
public class SendThread extends Thread {

    private final Socket socket;
    Scanner scanner = new Scanner(System.in);

    public SendThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
//        TODO: 코드 작성하기
        try {
//          TODO : InputStream/OutputStream 사용 -> 보조스트림
            DataOutputStream dataOutputStream
                    = new DataOutputStream(socket.getOutputStream());
            String sendString;
//          TODO : 무한 반복문(무한 채팅)
            while (true) {
                sendString = scanner.nextLine(); // 키보드 입력 받기
//          TODO : 네트웍 전송
                dataOutputStream.writeUTF(sendString);
//          TODO : 버퍼 -> 진짜 전송
                dataOutputStream.flush();
            }
        } catch (Exception e) {
            e.getStackTrace();
        }

    }
}
