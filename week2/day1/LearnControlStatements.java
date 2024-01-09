package week2.day1;

public class LearnControlStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	/*	for (int i=1; i<=100; i++) {
			System.out.println("Hello");
		}
		*/
		
	/*	int a=10;
		System.out.println("a Value before Pre-Condition:" +a);
		//a++;
		//System.out.println(a++); //Post Condition
		System.out.println(++a);//Pre Condition
		System.out.println("a Value after Pre-Condition:" +a);
		System.out.println("Final a value:" +a); */
		
		
	/*	int x = 1;
		
		    System.out.println("------------Pre-Condition------------");
			System.out.println("X ----> " +x);
			System.out.println("X ----> " +(++x)); //x=1, x= 1+1, x=2
			System.out.println("X ----> " +x);
			
			System.out.println("------------Post-Condition------------");
		
		int y = 1;
		
		     System.out.println("Y -----> " +y);
		     System.out.println("Y -----> " +(y++));
		     System.out.println("Y -----> " +y); */
		     
		     
		     System.out.println("Print from 1 to 10");
		for (int i=1; i<=10; i++)  {
			// or "i<11"
			System.out.println(i);
		}
		
		System.out.println("Print from 10 to 1");
		for (int i=10; i>=1; i--) {
			//or "i>0"
			System.out.println(i);
		}
		
		System.out.println("Print Even Numbers from 1 to 20");
		for (int i=1; i<=20; i++) {
			if (i%2==0) {
			//or((i%2)==0)
				System.out.println(i);
			}
		}
	}

}
