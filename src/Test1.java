class Car{
	private int speed = 0;
	
	public void upSpeed(int value) {
		if(speed + value >200)
			speed=200;
		else
			speed += value;
		System.out.println("현재의 속도는 = "+ getSpeed());
	}
	
	public void downSpeed(int value) {
		if(speed - value < 0)
			speed = 0;
		else
			speed -= value;
		System.out.println("현재의 속도는 = " + getSpeed());
	}
	public int getSpeed() {
		return speed;
	}
}

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar1 = new Car();
		myCar1.upSpeed(100);
		myCar1.upSpeed(150);
		myCar1.downSpeed(50);
		myCar1.downSpeed(100);

	}

}
