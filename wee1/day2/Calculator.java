package wee1.day2;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc = new Calculator();
		calc.add(2, 3);
		calc.add(2, 3, 4);
		
        
	}
       public void add(int a, int b) {
    	   int c = a+b;
    	   System.out.println("c:"+c);
    	   
       }
       
       public void add(int a, int b, int e) {
    	   int x = a+b+e;
    	   System.out.println("x:"+x);
       }
}
