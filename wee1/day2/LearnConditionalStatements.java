package wee1.day2;

public class LearnConditionalStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=7;
		int b=5;
		
		if(a>b) {
			System.out.println("A is Greater than B");
		}
		
		if(a==b) {
			System.out.println("Both A & B are equal");
		}
		else {
			System.out.println("Both A & B are not equal");
		}
		
		int marks = 60;
		if (marks>90) {
			System.out.println("PlayStation");
		}
		else if (marks > 80) {
			System.out.println("Toys");
		}
		else if (marks >= 60) {
			System.out.println("Ice Cream");
		}
		else if (marks < 50) {
			System.out.println("OOPS");
		}
		
		int depositAmount = 50000;
			if ((depositAmount>=50000) && (depositAmount<=200000)){
				System.out.println("Pan Card is required");
			}
			else if ((depositAmount>100) && (depositAmount<50000)) {
				System.out.println("Pan card not required");
			}
			else {
				System.out.println("Unable to Deposit");
			}
	}

}
