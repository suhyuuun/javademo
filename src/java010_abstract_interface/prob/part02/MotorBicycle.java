package java010_abstract_interface.prob.part02;

public class MotorBicycle implements IBicycle, IMotor {
    // 멤버변수 추가
    int id;
    String brand;
    int frameSize;
    int motorSize;
    
    // IBicycle에 있는 추상 메소드를 구현하세요
    public void prtInfo() {
        //여기
    	
    }
    // IMotor에 있는 추상 메소드를 구현하세요
    public void start() {
       //여기
    	System.out.println("##모터 start!!");
    }
    // IMotor에 있는 추상 메소드를 구현하세요
    public void stop() {
        //여기
    	System.out.println("##모터 stop!!");
    }

}
