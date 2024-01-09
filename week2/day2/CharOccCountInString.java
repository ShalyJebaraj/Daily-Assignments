package week2.day2;

public class CharOccCountInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count =0;
		String input = "TestLeaf";
		char[] inputArray = input.toCharArray();
		for(int i=0;i<inputArray.length-1;i++)
		{
			if(inputArray[i]=='e')
			{
				count++;
			}
			
		}
		System.out.println("Count of given String "+input+" is "+count);

	}

}
