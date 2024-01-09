package week2.day2;

public class LearnString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Comparing 2 string by using '==' it will compare the memory allocation of the string
		//String Literal
		String x = "Testleaf";
		String y = "Testleaf";
		System.out.println(x==y);
		
		
		//String Instantiation
		String a = new String("Testleaf");
		String b = new String("Testleaf");
		System.out.println(a);
		System.out.println(b);
		System.out.println(a==b);
		System.out.println(x==a);
		
		String z = "testLeaf";
		
		int num = 1234;
		
		int xLen = x.length();
		System.err.println(xLen);
		boolean equals = y.equals(b);
		
		System.out.println(equals); //Compares the text value
		System.out.println(y==b);   //Compares the memory address
		System.out.println("z.equals(a) -->  " +z.equals(a));
		System.out.println("z.equalsIgnoreCase(a) -->  " +z.equalsIgnoreCase(a)); //Compares the text without Case sensitive
		System.out.println("x.contains(\"Leaf\") --> " +x.contains("Leaf"));  //Compares the partial text with case sensitive
		
		
		String lowercase = a.toLowerCase();
		System.out.println(lowercase);
		
		String uppercase = a.toUpperCase();
		System.out.println(uppercase);
		
		char[] charArray = a.toCharArray();
		System.out.println(charArray[0]);
		System.out.println(charArray[3]);
		System.out.println(a.charAt(5));
	//	System.out.println("a.charAt(8) ---> " +a.charAt(8)); // (throws "out of bound exception")
		
		String name = "    Shaly    ";
		System.out.println("name --> " +name);
		String nameWithoutSpace = name.trim(); //remove whitespace before and after text
		System.out.println("Name Without Space --> " +nameWithoutSpace);
		
		String n = "    Hello  World    ";
		String trim = n.trim();
		System.out.println(trim);
		
		String text = "Welcome@123";
		
		String replaceFirst = text.replaceFirst("[0-9]", "");
		System.out.println("Replace First --> " +replaceFirst);
		String textWithoutNum = text.replaceAll("[0-9]", "*");
		System.out.println("Text Without Numbers: " +textWithoutNum);
		String numOnly = text.replaceAll("[^0-9]", "");
		System.out.println("Num Only --> " +numOnly);
		
		String[] split = text.split("@");
		System.out.println("split.length --> " +split.length);
		System.out.println("split[0] --> " +split[0]);
		System.out.println("split[1] --> " +split[1]);
		
		String[] split2 = a.split("");
		for (int i = 0; i < split2.length; i++) {
			System.out.println("split2["+i+"] --> " +split2[i]);
			
		}
		
		   System.out.println("text.substring(8) --> " +text.substring(8));
		   System.out.println("text.substring(0,8) --> " +text.substring(0, 8));
		   
		   char[] textChar = text.toCharArray();
		   int ecount=0;
		   for (int i = 0; i < textChar.length; i++) {
			   if(textChar[i]=='e') {
				   ecount++;
			   }
			   
		}
		
		   System.out.println("Number of 'e' present in the "+text+" is " +ecount);
	}

	      
}
