import java.util.Scanner;

public class Test2 {
	static int[] num = new int[5];
	static int sum; //double�� �Է��ϰԵǸ� �Ǽ������� ���� �հ谡 100 �̶�� 100.0 �̷������� ��µȴ�.
	static double avg;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		for(int i = 0; i < num.length; i++) {
			System.out.print("������ �Է��ϼ��� : ");
			num[i] = s.nextInt();
		}
		getTotal(); //�հ谪
		getAverage(); //��հ�   //������ �ٲ�� ������� �������� 0�̱⶧���� ������ ������ ������ ��հ��� 0���� ���´�.
		                     //get�� ���� ��ȯ���ش�.
		

	}

	
	private static void getTotal() {
		for(int i = 0; i < num.length ; i++)
			sum += num[i];
		
		System.out.println("�հ� : " +sum);
	}
	
	private static void getAverage() {
		avg = sum / (double) num.length;
		System.out.println("��� : " +avg);
	}
	
}
