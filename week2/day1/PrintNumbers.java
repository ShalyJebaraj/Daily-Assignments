package week2.day1;

public class PrintNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		PrintNumbers odd = new PrintNumbers();
		odd.printOddNumbers(1, 40);
		odd.printOddNumbers(30, 40);
		
	}
	
/*	public void printOddNumbers() {
		System.out.println("Print Odd Numbers from 1 to 20");
		for (int i=1; i<=20; i++) {
			if (i%2==1) {
			//or(i%2!=0)
				System.out.println(i);
			}
		} 
		} */
		
		public void printOddNumbers(int initialization, int condition) {
			System.out.println("Print Odd Numbers from" +initialization +" to " +condition);
			for (int i=initialization; i<=condition; i++) {
				if (i%2==1) {
				}
				//or(i%2!=0)
					System.out.println(i);
	}
	
			}
			}

