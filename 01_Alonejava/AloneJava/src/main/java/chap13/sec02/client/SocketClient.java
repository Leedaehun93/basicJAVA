package chap13.sec02.client;

import java.io.IOException;
import java.net.Socket;

/**
 * packageName : chap12.chatting.client
 * fileName : SocketClient
 * author : ds
 * date : 2022-10-06
 * description : 클라이언트 채팅 실행 프로그램
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-06         ds          최초 생성
 */
public class SocketClient {
    public static void main(String[] args) throws IOException {
//        TODO: 코드 작성 : 자신 pc ip 주소 : localhost(127.0.0.1)
        Socket socket = new Socket("127.0.0.1", 8888); // 바로 서버와 접속
        System.out.println("서버와 접속되었습니다.");

//	    TODO : 받는 쓰레드 생성 및 시작
        ReceiveThread receiveThread = new ReceiveThread(socket);
        receiveThread.start();

//	    TODO : 보내는 쓰레드 생성 및 시작
        SendThread sendThread = new SendThread(socket);
        sendThread.start();

    }
}