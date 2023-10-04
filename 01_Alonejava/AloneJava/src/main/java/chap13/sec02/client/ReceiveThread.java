package chap13.sec02.client;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * packageName : chap12.chatting.client
 * fileName : ReceiveThread
 * author : kangtaegyung
 * date : 2022/10/04
 * description : 클라이언트 리시버
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/10/04         kangtaegyung          최초 생성
 */
public class ReceiveThread extends Thread {
    //	TODO : 소켓 정의
    private final Socket socket;
    //	TODO : 생성자
    private String receiveString; // 받는 메세지 속성

    public ReceiveThread(Socket socket) {
        this.socket = socket;
    }

    //	TODO : 쓰레드 실행 : run()
    @Override
    public void run() {
        //  TODO: 코드 작성하기
        try {
            DataInputStream tmpbuf = new DataInputStream(socket.getInputStream());
//	    TODO : 무한 반복문 : 무한 채팅
            while (true){
                receiveString = tmpbuf.readUTF();
                if(receiveString == null) {
                    System.out.println("상대방 연결이 종료");
                } else {
                    System.out.print("상대방 : " + receiveString);
                }
            }
        } catch (IOException e) {
            e.getStackTrace();
        }
    }
}
