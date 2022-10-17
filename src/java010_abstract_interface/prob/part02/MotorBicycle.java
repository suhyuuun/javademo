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
    	frameSize = FrameSize_M;
    	motorSize = Motor_Size_Large;
    	System.out.printf("ID : %d\n",id);
    	System.out.printf("Brand : %s\n",brand);
    	System.out.printf("Frame Size : %d\n",frameSize);
    	System.out.printf("Motor Size : %d\n",motorSize);
    	
    	
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
