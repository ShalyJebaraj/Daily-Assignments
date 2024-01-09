package week2.day1;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1,4,3,2,8,6,7};
		
		Arrays.sort(a);
		
		//1,.2,3,4,6,7,8
		
		for(int i=0; i<a.length; i++) {
			if((i+1)!=a[i]) {
				System.out.println("Missing Element is: "+(i+1));
				break;
			}
			
		}
	}

}
