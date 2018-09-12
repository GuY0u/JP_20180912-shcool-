import java.util.Scanner;

public class Test2 {
	static int[] num = new int[5];
	static int sum; //double로 입력하게되면 실수형으로 만약 합계가 100 이라면 100.0 이런식으로 출력된다.
	static double avg;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		for(int i = 0; i < num.length; i++) {
			System.out.print("성적을 입력하세요 : ");
			num[i] = s.nextInt();
		}
		getTotal(); //합계값
		getAverage(); //평균값   //순서가 바뀌면 결과값을 나눌값이 0이기때문에 오류가 나지는 않지만 평균값이 0으로 나온다.
		                     //get은 값을 반환해준다.
		

	}

	
	private static void getTotal() {
		for(int i = 0; i < num.length ; i++)
			sum += num[i];
		
		System.out.println("합계 : " +sum);
	}
	
	private static void getAverage() {
		avg = sum / (double) num.length;
		System.out.println("평균 : " +avg);
	}
	
}
