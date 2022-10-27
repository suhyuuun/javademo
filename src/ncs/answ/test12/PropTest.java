package ncs.answ.test12;

import java.util.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class PropTest {

	/*
	 * java.util.Properties 를 사용하여, data.xml 파일에 데이터를 기록 저장한 다음 파일에 기록된 데이터들을 읽어와서
	 * Fruit[] 에 기록하고 Fruit[]의 값들을 화면에 출력 처리한다
	 */

	public static void main(String[] args) {
		Properties prop = new Properties();

		prop.setProperty("1", "apple,1200,3");
		prop.setProperty("2", "banana,2500,2");
		prop.setProperty("3", "grape,4500,5");
		prop.setProperty("4", "orange,800,10");
		prop.setProperty("5", "melon,5000,2");

		fileSave(prop);
		fileOpen(prop);
	}

	public static void fileSave(Properties p) {

		try {
			p.storeToXML(new FileOutputStream("./src/ncs/test12/data.xml"), null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void fileOpen(Properties p) {
		FileInputStream fs = null;
		Fruit[] fruitArr = new Fruit[p.size()];

		try {
			fs = new FileInputStream("./src/ncs/test12/data.xml");
			p.loadFromXML(fs);

			for (int i = 1; i <= p.size(); i++) {
				String index = String.valueOf(i);
				//System.out.println(index + " = " + p.getProperty(index));
				
				String[] line = p.getProperty(index).split(",");
				Fruit ft = new Fruit(line[0], Integer.parseInt(line[1]), Integer.parseInt(line[2]));
				fruitArr[i-1] = ft;
			}

			for(Fruit ff : fruitArr)
				System.out.println(ff);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (InvalidPropertiesFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
}