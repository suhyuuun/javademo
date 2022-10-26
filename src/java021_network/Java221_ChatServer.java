package java021_network;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Java221_ChatServer { 

	public static void main(String[] args) { 
		try {
			ServerSocket server = new ServerSocket(7777);
			while(true) {
			  Socket client=server.accept();
			   System.out.printf("client가 %s로 접속",
				 client.getInetAddress().getHostAddress());
			   Java221_ChatHandler handler=
					   new Java221_ChatHandler(client);
			   handler.initStart();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}// end main()

}// end class







