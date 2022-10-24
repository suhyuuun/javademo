package java018_collection;
/*
 * 1. 와일드카드 (?)를 제공하는 이유
 * 		컬렉션에 저장되는 요소들이 특정한 객체로 정해진 상태에서 다른 객체형은
 * 		저장할 수 없는 상태였다. 하지만 때로는 기존과 같이 모든 객체들을
 * 		저장해야 할때가 있다.
 * 		Vector v = new Vector();
 * 		v.add(new Integer(20));
 * 		v.add(new String("java");
 * 
 * 2. 와일드 카드의 구성
 * 		<?> : 모든 객체자료형에 대한 배치를 의미한다.
 * 		< ? super 객체자료형 > : 명시된 객체자료형이나 객체자료형의 상위 객체들의 배치를 의미한다.
 * 		< ? extends 객체자료형 > : 명시된 객체자료형이나 객체자료형으로부터 상속받은 하위객체들의 배치를 의미한다.
 * 
 */
class Seoul{
	public void showYou() {
		System.out.println("Seoul");
	}
}

class Fruit extends Seoul{
	@Override
	public void showYou() {
		System.out.println("Fruit");
	}
}

class Apple extends Fruit{
 @Override
public void showYou() {
		System.out.println("Apple");
}
}

class Orange extends Fruit{
	@Override
	public void showYou() {
		System.out.println("Orange");
	}
}

class FruitBox<T>{
	private T item;
	
	public FruitBox() {}
	
	public void store(T item) {
		this.item = item;
	}
	
	public T pullout() {
		return item;
	}
}

public class Java199_User {

	public static void main(String[] args) {
		FruitBox<Orange> fOrange = new FruitBox<Orange>();
		fOrange.store(new Orange());
		openAndAllBox(fOrange);
		openAndExtendsBox(fOrange);
		//openAndsuperbox(fOrnage); Orange는 Fruit의 하위이기때매문에 사용불가
		
		FruitBox<Seoul> fSeoul = new FruitBox<Seoul>();
		fSeoul.store(new Seoul());
		openAndAllBox(fSeoul); //Seoul
		//openAndExtendsbox(fSeoul); //The method openAndExtendsbox(FruitBox<Seoul>) is undefined for the type Java199_User
		openAndsuperbox(fSeoul);
	}//end main()
		
	public static void openAndAllBox(FruitBox<?> param) { //<?> 사용시 Object로 처리
		System.out.println(param.pullout()); //java018_collection.Orange@69222c14
		((Seoul)param.pullout()).showYou(); //Orange Orange는 Seoul을 상속받았기 때문
	}//end openAndAllBox()
	
	public static void openAndExtendsBox(FruitBox<? extends Fruit> param) {
		param.pullout().showYou(); //Orange
	}//end openAndExtendsBox()
	
	public static void openAndsuperbox(FruitBox<? super Fruit> param) {
		((Seoul)param.pullout()).showYou(); //Seoul
	}
}//end class
