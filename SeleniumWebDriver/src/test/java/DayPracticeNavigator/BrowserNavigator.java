package DayPracticeNavigator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserNavigator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","c:\\Users\\Pandu\\Downloads\\imp--delete\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
		//driver.get("https://www.google.com/");
	driver.navigate().to("https://www.goole.com/");
		driver.findElement(By.linkText("images")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(1000);
		System.out.println("back done");
		driver.navigate().forward();
		System.out.println("Forward  done");
		driver.navigate().refresh();
		System.out.println("Refresh  done");
		
		

	}

}
