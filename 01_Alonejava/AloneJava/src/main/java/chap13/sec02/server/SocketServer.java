package chap13.sec02.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * packageName : chap12.chatting.server
 * fileName : SocketServer
 * author : ds
 * date : 2022-10-06
 * description : 채팅 서버 프로그램
 * =============================== ============================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-06         ds          최초 생성
 */
public class SocketServer {
    public static void main(String[] args) throws IOException {
//	    TODO : 소켓 통신을 위한 포트번호
        int port = 8888;

//	    TODO : 서버 소켓 생성 : 8888
        ServerSocket serverSocket = new ServerSocket(port);
//	    TODO : 무한 반복문 : 무한 대기(클라이언트가 접속될 때 까지)
        while (true) {
//	        TODO : 8888 번으로 계속 체크하다가 만들어지면 접속 시킴
            Socket socket = serverSocket.accept();
//	        TODO : getInetAddress() : 상대방 pc IP 주소
            System.out.println("ip : " + socket.getInetAddress() + "와 연결되었습니다.");
//	        TODO : 받기용 쓰레드 생성 및 실행
            ReceiveThread receiveThread = new ReceiveThread(socket);
            receiveThread.start();
//	        TODO : 보내기용 쓰레드 생성 및 실행
            SendThread sendThread = new SendThread(socket);
            sendThread.start();
        }
    }
}