package launchBrowser;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
	
	public static void main(String[] args) {
		
		//Scanner scan = new Scanner(System.in);
		
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.close();
		
		
		
		
		
		
		
	}
	
	

}
