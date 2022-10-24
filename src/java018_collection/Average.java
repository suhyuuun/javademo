package java018_collection;

public class Average<T extends Number>{ //Number나 Number를 상속받은 것만 사용가능

	private T[] list;
	
	public Average() {}
	
	public Average(T[] list) {
		this.list = list;
	}
	
	public double findAverage() {
		double sum = 0.0;
		for(T data : list)
			sum += data.doubleValue();
		
		return sum/list.length;
	}

}

