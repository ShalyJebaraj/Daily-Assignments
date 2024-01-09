package wee1.day2;

public class Mobiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("This is My Mobile");
         Mobiles Android = new Mobiles();
         Android.makeCall("Nokia", 110f);
         Android.sendMsg(true, 15000);
         
	}
	
	public void makeCall(String mobileModel, float mobileWeight) {
		System.out.println("Mobile Model:" +mobileModel);
		System.out.println("Mobile Weight:" +mobileWeight);
	}
	
	public void sendMsg(boolean isFullyCharged, int mobileCost) {
		System.out.println("Is Fully Charged?" +isFullyCharged);
		System.out.println("Mobile Cost:" +mobileCost);
	}

}
