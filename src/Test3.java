
class Car1{
	int speed = 0;
	void upSpeed(int speed) {
		this.speed += speed;
		System.out.println("����ӵ�(����Ŭ����) : " +this.speed);
	}
}

class Sedan extends Car1{
	void upSpeed(int speed) {
		
		this.speed += speed;
		if(this.speed > 150) 
			this.speed =150;
		System.out.println("����ӵ�(����Ŭ����) : " + this.speed);
	}
}

class Truck extends Car1{
	
}

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Truck truck1 = new Truck();
		Sedan sedan1 = new Sedan();
		
		System.out.print("Ʈ�� => ");
		truck1.upSpeed(200);
		
		System.out.print("�¿��� => ");
		sedan1.upSpeed(200);

	}

}
