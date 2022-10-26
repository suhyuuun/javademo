package java021_network;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Java217_network {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://www.daum.net");
			URLConnection conn = url.openConnection();
			//System.out.println(conn);
			Scanner sc = new Scanner(conn.getInputStream());
			while(sc.hasNext())
				System.out.println(sc.nextLine());
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}//end main()

}//end class
