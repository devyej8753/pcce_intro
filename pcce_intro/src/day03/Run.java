package day03;

import day02.Solution02;
import day02.Solution03;

public class Run {
	public static void main(String[] args) {
		Solution01 s = new Solution01();
		int su = s.solution(3, 2);
		System.out.println("3, 2일 때 : "+ su);
		int su1 = s.solution(10, 5);
		System.out.println("10, 5일 때 : "+ su);
		
		System.out.println();
		
		Solution02 s1 = new Solution02();
		int n = s1.solution(2, 3);
		System.out.println("2, 3 일 떄 : "+n);
		int n1 = s1.solution(11, 11);
		System.out.println("11, 11일 때 : "+n1);
		int n2 = s1.solution(7, 99);
		System.out.println("7, 99일 때 : "+n2);
		
		System.out.println();
		
		Solution03 s2 = new Solution03();
		
		
		
		int[] num = s2.solution(1, 2, 3, 4);
		System.out.println("1, 2, 3, 4일 때 : "+num);
		int[] num1 = s2.solution(9, 2, 1, 3);
		System.out.println("9, 2, 1, 3일 때 : "+num1);
		
	}
	

	
}


