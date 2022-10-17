package java011_casting.part01;

public class Child extends Parent{
public Child() {
	
}

void call() {
	System.out.println("Child Call");
}

@Override
	void process() {
		System.out.println("Child process");
	}
}
