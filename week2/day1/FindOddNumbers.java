package week2.day1;

public class FindOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int maxRange = 10;
		
		System.out.println("Print Odd Numbers from 1 to " +maxRange);
		
		for (int i=1; i<=maxRange; i++) {
			if (i%2==1) {
				System.out.println(i);
			}
		}
	}

}
