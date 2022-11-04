package jdbc_project;

public class ConcertDTO {
	private int num;
	private String name;
	private String instrument;
	private int day;
	private String programComposer;
	private int price;
	
	public ConcertDTO() {

	}
	
	public ConcertDTO(String name, String instrument, int day, String programComposer, int price) {
		this.name = name;
		this.instrument = instrument;
		this.day = day;
		this.programComposer = programComposer;
		this.price = price;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
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
