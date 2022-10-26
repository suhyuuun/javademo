package java021_network;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Java220_ClinetSocket {

	public static void main(String[] args) {
		try {
			//3. 서버연결요청             ("서버주소", 포트번호)
			Socket socket = new Socket("127.0.0.1",7777);
			
			//4. 입출력스트림 연결
			OutputStream os = socket.getOutputStream();
			OutputStreamWriter ow = new OutputStreamWriter(os);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
