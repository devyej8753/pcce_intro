package day02;

public class Run {
	public static void main(String[] args) {
		System.out.println("=== 두수의 나눗셈 ===");
		Solution01 s1 = new Solution01();
		int su = s1.solution(3, 2);
		System.out.println("3,2일 때 : "+su);
		Solution01 s2 = new Solution01();
		int su1 = s2.solution(7, 3);
		System.out.println("7, 3 일 떄 : "+su1);
		Solution01 s3 = new Solution01();
		int su2 = s3.solution(1, 16);
		System.out.println("1, 16 일 떄 : "+su2);
		
		System.out.println("=== 숫자 비교하기 ===");
		
		Solution02 S1 = new Solution02();
		int num = S1.solution(2, 3);
		System.out.println("2, 3 일 때 : "+num);
		Solution02 S2 = new Solution02();
		int num1 = S1.solution(11, 11);
		System.out.println("11, 11 일 때 : "+num1);
		Solution02 S3 = new Solution02();
		int num2 = S1.solution(7, 99);
		System.out.println("7, 99 일 때 : "+num2);
	}

}
