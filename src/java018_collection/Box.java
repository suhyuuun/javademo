package java018_collection;

public class Box<T> {
	private T data;
	
	public Box() {

	}
	
	public Box(T data) {
		this.data = data;
	}
	
	public T getData() {
		return data;
	}
	
	public void setData(T Data) {
		this.data = data;
	}
}
