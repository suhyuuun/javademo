package java018_collection.prob;

class Doctor{		
	private String name; //의사명
	private String medical; //진료과목
	private int patient; //환자수
	
	public Doctor(String name, String medical, int patient) {		
		this.name = name;
		this.medical = medical;
		this.patient = patient;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMedical() {
		return medical;
	}

	public void setMedical(String medical) {
		this.medical = medical;
	}

	public int getPatient() {
		return patient;
	}

	public void setPatient(int patient) {
		this.patient = patient;
	}
	
}