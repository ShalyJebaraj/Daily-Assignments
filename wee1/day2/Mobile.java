package wee1.day2;

public class Mobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Mobile iPhone = new Mobile();
     iPhone.makeCall("Mom");
     
     Mobile candyShop = new Mobile();
    
     int balanceRupee = candyShop.buyChocolate("milky bar", 50);
     System.out.println(balanceRupee);
     //Press ctrl and 2 simultaneously and then release both keys and press 1
     candyShop.buyChocolate("Kitkat", 30);
	}
	
	public String makeCall(String personName) {
		System.out.println("make call to:"+ personName);
		return "Either they answer or doesn't answer";
		
	}
    public int buyChocolate(String chocolateName, int rupee) {
    	int chocolatePrice = 30;
    	System.out.println(chocolateName + "Price is:" +chocolatePrice);
    	return (rupee-chocolatePrice);
    }
    
}
