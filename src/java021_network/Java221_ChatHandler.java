package java021_network;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Enumeration;
import java.util.Vector;

public class Java221_ChatHandler implements Runnable {
	Socket socket;
	Thread th;
	private DataInputStream dataIn;
	private DataOutputStream dataOut;
	private static Vector<Java221_ChatHandler> userVec 
	                   = new Vector<Java221_ChatHandler>();

	public Java221_ChatHandler() {

	} 

	public Java221_ChatHandler(Socket socket) {
		this.socket = socket;
	}

	public void initStart() {
		if (th == null) {
			try {
				InputStream is = socket.getInputStream();
				OutputStream os = socket.getOutputStream();
				dataIn = new DataInputStream(new BufferedInputStream(is));
				dataOut = new DataOutputStream(new BufferedOutputStream(os));
				th=new Thread(this);
				th.start();
				
			} catch (IOException e) {

				e.printStackTrace();
			}

		}
	}// end initStart()///////////////////////

	@Override
	public void run() {
		userVec.addElement(this);
		while(!Thread.interrupted()) {
			try {
				String message=dataIn.readUTF();
			
				broadcast(message);
			} catch (IOException e) {				
			System.out.println(socket.getInetAddress().getHostAddress()+"나갔습니다.");
				return;	
			}
		}

	}// end run()/////////////////////////////
	
	synchronized public void broadcast(String message) {
		Enumeration<Java221_ChatHandler> enu=userVec.elements();
		while(enu.hasMoreElements()) {
			Java221_ChatHandler handler=enu.nextElement();
			try {
				handler.dataOut.writeUTF(message);
				handler.dataOut.flush();
			} catch (IOException e) {
				//e.printStackTrace();
				handler.stop();
			}
		}
				
	}//end broadcast()/////////////////////
	
	synchronized public void stop() {
		if (th != null) {
			if (th != Thread.currentThread()) {
				th.interrupt();
				th = null;
				try {
					dataIn.close();
					dataOut.close();
				} catch (IOException e) {
					//e.printStackTrace();
				}finally {
					
				}
			}
		}
	}//end stop()///////////////////////////////////
}// end class

















