package ncs.test12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;

public class PropTest {

	public static void main(String[] args) {
		Properties prop = new Properties();
		
		prop.setProperty("1", "apple,1200,3");
		prop.setProperty("2", "banana,1200,2");
		prop.setProperty("3", "grape,4500,5");
		prop.setProperty("4", "orange,800,10");
		prop.setProperty("5", "melon,5000,2");
		
		fileSave(prop);
		fileOpen(prop);
		

	}//main()
	
	public static void fileSave(Properties p) {
		try {
			p.storeToXML(new FileOutputStream("./src/ncs/test12/data.xml"),null);
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
			
			for(int i = 1;i <=p.size();i++) {
				String index = String.valueOf(i);
				
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
}//end class
