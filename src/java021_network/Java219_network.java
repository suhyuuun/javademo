package java021_network;

import java.net.MalformedURLException;
import java.net.URL;

public class Java219_network {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://movie.daum.net/moviedb/main?movieId=3212");
			System.out.println("getHost(): " + url.getHost()); //movie.daum.net
			System.out.println("getProtocol(): " + url.getProtocol()); //https
			System.out.println("getPort(): " + url.getPort()); //-1  //보통 port번호를 8080이나 80을 사용함 //없어서 -1
			System.out.println("getPath(): " + url.getPath()); // /moviedb/main
			System.out.println("getQuery(): " + url.getQuery()); // movieId=3212  // ?뒤에
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
