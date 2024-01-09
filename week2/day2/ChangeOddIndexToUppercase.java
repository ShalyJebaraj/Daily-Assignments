package week2.day2;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test = "changeme";
		char[] testArray = test.toCharArray();
		String word = "";
		for(int i = 0;i<=test.length()-1;i++)
		{
			//System.out.println(testArray[i]);
			if((i%2)==1)
			{
				char name = testArray[i];
				char upper = Character.toUpperCase(name);
				System.out.print(upper);
			}
			
			 else 
			 { 
				 char name = testArray[i];
					char lower = Character.toLowerCase(name);
					System.out.print(lower);
			 
		}
		
	}
	}

}
