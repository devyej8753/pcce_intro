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
		
		
		

	}

}
