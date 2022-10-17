package java010_abstract_interface.part03;

public class Java104_abstract {

	public static void main(String[] args) {
		
		Flute f = new Flute("Flute");
		System.out.println(f.name);
		f.play();

		Piano p = new Piano("Piano");
		System.out.println(p.name);
		p.play();
	}

}
