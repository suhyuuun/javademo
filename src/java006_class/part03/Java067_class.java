package java006_class.part03;

public class Java067_class {

	public static void main(String[] args) {
		Rect rt = new Rect();
		rt.width = 5;
		rt.height = 3;
		rt.color = "레드";
		//System.out.printf("%d %d\n", rt.width,rt.height);
		rt.display();
		
		System.out.println("==============================");
		
		Rect rc = new Rect();
		rc.width = 7;
		rc.height = 4;
		rc.color = "블루";
		rc.display();
	}

}
