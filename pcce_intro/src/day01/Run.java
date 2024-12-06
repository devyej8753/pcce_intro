package day01;

public class Run {

	public static void main(String[] args) {
		Solution01 s1 = new Solution01();
		int n1 = s1.solution(2, 3);
		System.out.println("2,3일 때 : "+n1);
		
		int n2 = s1.solution(100, 2);
		System.out.println("100, 2일때 : "+n2);
		
		Solution02 s2 = new Solution02();
		int n3 = s2.solution(2, 3);
		System.out.println("2,3일 때 : "+n3);
		int n4 = s2.solution(100, 2);
		System.out.println("100,2일 때 : "+n4);
		
		Solution03 s3 = new Solution03();
		int su = s3.solution(3, 4);
		System.out.println("3,4일 떄 : "+su);
		int su1 = s3.solution(27, 19);
		System.out.println("27,19일 때 : "+su1);
		
		Solution04 s4 = new Solution04();
		int su2 = s4.solution(10, 5);
		System.out.println("10,5일 때 : "+su2);
		int su3 = s4.solution(7,2);
		System.out.println("7,2일 때 : "+su3);
		
		

	}

}
