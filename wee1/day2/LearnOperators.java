package wee1.day2;

public class LearnOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//add two numbers --> +
		//sub two numbers --> -
		//multi two numbers --> *
		//divide two numbers --> /
		//reminder --> %
		
		int a = 10;
		int b = 20;
		float c;
		c = a+b;
		
		String firstName = "Shaly";
		String middleName = "Angel";
		String lastName = "Baby";
		
		boolean f = (a==b);
		
		System.out.println("c --->"+c);
		System.out.println("a-b:"+(a-b));
		System.out.println("a*b:"+(a*b));
		System.out.println("a/c:"+(a/c));
		System.out.println("a%c:"+(a%c));
		
		
		System.out.println("=======================");
		System.out.println("10==20: "+(a==b));
		System.out.println("10!=20: "+(a!=b));
		System.out.println("10>20: "+(a>b));
		System.out.println("10>=20: "+(a>=b));
		System.out.println("10<20: "+(a<b));
		System.out.println("10<=20: "+(a<=b));
		
		System.out.println("-----String-----");
		System.out.println(firstName+middleName+lastName + f+a+b);
		

	}

}
