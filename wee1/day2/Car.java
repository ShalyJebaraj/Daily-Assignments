package wee1.day2;

public class Car {

	
	String colour = "Green";
	int noOfWheels = 5;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car cooper = new Car();
		cooper.startCar();
		cooper.applyBreak();
		System.out.println(cooper.colour);
		cooper.changeCarColour();
		System.out.println(cooper.colour);
		
		System.out.println("---------------");
		
		Car polo = new Car();
		polo.playMusic();
		System.out.println(polo.colour);
	}
	
	
		public void startCar() {
			System.out.println("I need a key of the car");
			System.out.println("Open the car and Insert the key");
			System.out.println("Start the car");
		}
		
		public void playMusic() {
			int x=1;
			System.out.println("Play Music");
		}
		
		public void applyBreak() {
			System.out.println("Apply Break");
	
	}
		
		public void changeCarColour() {
			 colour = "Black";
			System.out.println(colour);
			float x = 2;
			
		}
		
	}


