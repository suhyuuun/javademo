package project;

public class Player {
	private String name; //연주자 이름
	private String instrument; //악기
	private int day; //공연날짜
	private String programComposer; //프로그램 작곡가
	private int price; //티켓값
	
	public Player() {
		
	}

	public Player(String name, String instrument, int day, String programComposer, int price) {
		this.name = name;
		this.instrument = instrument;
		this.day = day;
		this.programComposer = programComposer;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInstrument() {
		return instrument;
	}

	public void setInstrument(String instrument) {
		this.instrument = instrument;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public String getProgramComposer() {
		return programComposer;
	}

	public void setProgramComposer(String programComposer) {
		this.programComposer = programComposer;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
