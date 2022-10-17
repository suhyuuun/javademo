package java011_casting.part02;

/*
 * 다형성(polymorphism)
 * 1. 사전적 의미는 '여러가지 형태를 가질 수 있는 능력'을 의미한다.
 * 2. 자바에서는 한 타입의 참조변수로 여러 타입의 객체를 참조하는 기술이다.
 *       예를 들면, 하느의 타입으로 상속관계에 있는 여러 객체를 다루는 기술이다.
 *       
 * 바인딩(binding) : 메소드 호출을 실제 메소드의 몸체와 연결하는 기술이다.
 * 1. 정적바인딩(static binding) : 컴파일단계에서 어떤 클래스의 어떤 매소드가 호출되는지 연결하는 기술
 * 2. 동적바인딩(dynamic binding) : 실행단계에서 어떤 클래스의 어떤 매소드가 호출되는지 연결하는 기술

 */

public class Java110_binding {

   public static void main(String[] args) {
      Employee emp = new Employee("Steven", "code001");
      process(emp);

      Manager mg = new Manager("Neesa", "professor", "second");
      process(mg);

   }
   
   //메소드 호출을 메소드 몸체와 연결하는 기술을 바인딩이라고 함
   //정적 바인딩 : 컴파일단계에서 연결, 호출하는 부분과 몸체가 같을때
//   public static void process(Employee emp) {
//      System.out.println(emp.toString());
//      System.out.println(emp.pay());
//   }

//   public static void process(Manager mg) {
//      System.out.println(mg.toString());
//      System.out.println(mg.display());
//   }
   
   //동적 바인딩 : 실행단계에서 연결, 호출하는 부분과 몸체가 다를때
   public static void process(Object obj) { //업캐스팅
	   System.out.println(obj.toString());
	   if(obj instanceof Employee) {
		   Employee em = (Employee)obj;//다운캐스팅
		   System.out.println(em.pay());
	   }else if(obj instanceof Manager) {
		   Manager ma = (Manager)obj;//다운캐스팅
		   System.out.println(ma.display());
	   }
	   
	   //object에는 pay()와 display()가 없기 때문에 오류남
	   //System.out.println(obj.pay());
	   //System.out.println(obj.display());
	   }
   }
   
   

