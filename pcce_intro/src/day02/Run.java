package day02;

public class Run {
	public static void main(String[] args) {
		Solution01 s1 = new Solution01();
		int su = s1.solution(3, 2);
		System.out.println("3,2일 때 : "+su);
		int su1 =s1.solution(7, 3);
		System.out.println("7, 3일 때 : "+su1);
		int su2 = s1.solution(1, 16);
		System.out.println("1, 16일 때 : "+su2);
		
	}

}
