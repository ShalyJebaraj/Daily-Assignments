package week2.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Fibonacci Series for the given Number: ");
		FibonacciSeries fibonacci = new FibonacciSeries();
		fibonacci.fibSeries(8);
		
	}
	
	int a=0;
	int b=1;
	

	 public void fibSeries(int n) {
		 for (int i = 0; i <= n; i++) {
			 int c=a+b;
			 a=b;
			 b=c;
			 System.out.println(a+"");
			
		}
	 }
}
