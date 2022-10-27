package project;

public class Player {
	private String name;
	private String instrument;
	private int day;
	private String programComposer;
	private int quantity;
	
	public Player() {
		
	}

	public Player(String name, String instrument, int day, String programComposer, int quantity) {
		this.name = name;
		this.instrument = instrument;
		this.day = day;
		this.programComposer = programComposer;
		this.quantity = quantity;
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

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}
