package week2.day1;

public class LearnArrayLiterals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String names[] = {"Shaly", "Angel", "Baby", "Jebaraj", "Aruna", "Teddy"};
		
		System.out.println(names);
		//index of an Array starts --> 0
		System.out.println(names[3]);
		String n4 = names[4];
		System.out.println(n4);
		//System.out.println(names[6]="Jeswin"); (this will not be accepted as array is fixed in length)
		
		
		int length = names.length;
		System.out.println("Length of the names[]: " + length);
 
		System.out.println("The Arrays are . . ." );
		
		for (int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
	}

}
