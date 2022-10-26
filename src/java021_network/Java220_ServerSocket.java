package java021_network;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Java220_ServerSocket {
	public static void main(String[] args) {
		
		try {
			//1. port번호를 지정해서 서버소켓 생성
			ServerSocket server = new ServerSocket(7777);
			
			//2. 클라이언트 요청이 들어올때까지 대기
			Socket socket = server.accept();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
