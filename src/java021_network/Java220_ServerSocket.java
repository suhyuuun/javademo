package java021_network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Java220_ServerSocket {
	public static void main(String[] args) {
		
		try {
			//1. port번호를 지정해서 서버소켓 생성
			ServerSocket server = new ServerSocket(7777);
			
			System.out.println("대기: ");
			//2. 클라이언트 요청이 들어올때까지 대기
			Socket socket = server.accept();
			
			//4. 입출력스트림 연결
			OutputStream os = socket.getOutputStream();
			OutputStreamWriter ow = new OutputStreamWriter(os);
			InputStream is = socket.getInputStream();
			InputStreamReader ir = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(ir);
			
			//6. 클라이언트에서 보내준 정보 받음
			System.out.println(br.readLine());
			br.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
