package java010_abstract_interface.part03;
//피아노를 연주하다 -> 손가락
//플룻을 연주하다 -> 입

abstract public class Instrument {
	String name;
	
	public Instrument() {
		
	}
	
	public Instrument(String name) {
		this.name = name;
	}
	
	abstract public void play();
}
