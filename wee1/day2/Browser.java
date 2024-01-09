package wee1.day2;

public class Browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("This is My Browser");
     
     Browser chrome = new Browser();
     chrome.launchBrowser("Firefox");
     chrome.loadUrl();
	}
	
	public String launchBrowser(String browserName) {
		System.out.println("Browser Launched Successfully");
		return browserName;
	}
    
	public void loadUrl() {
		System.out.println("Application URL Loaded successfully");
	}
}
