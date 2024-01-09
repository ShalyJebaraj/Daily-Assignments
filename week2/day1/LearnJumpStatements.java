package week2.day1;

public class LearnJumpStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i <=10; i++) {
			if(i==3) {
				continue;
			}
			
			System.out.println(i+" ");
			
			if(i==7) {
				break;
			}
			
		}
	}

}
