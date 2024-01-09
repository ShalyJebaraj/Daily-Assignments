package week2.day1;

public class IsPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Prime Numbers are: ");
		IsPrimeNumber prime = new IsPrimeNumber();
		prime.primeNumbers(99);
	}
	
	public void primeNumbers(int n) {
		for(int i=2; i<n-1; i++) {
			if((n%i)==0) {
				System.out.println(i +" Prime Number");
			}
			else {
				System.out.println(i +" Not Prime Number");
			}
		}
		
	}

}
