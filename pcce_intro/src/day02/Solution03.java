package day02;

public class Solution03 {

	 public int[] solution(int numer1, int denom1, int numer2, int denom2) {
	        int[] answer = new int[2];
	        int up = (numer1*denom2)+(numer2*denom1);
	        int down = denom1*denom2;
	        int min = (up < down) ? up : down;
	        for(int i = min; i > 1 ; i--){
	            if(up%i==0&&down%i==0) {
	                up = up/i;
	                down = down/i;
	                break;
	            }
	        }
	        answer[0] = up;
	        answer[1] = down;
	        return answer;
	    }

}
