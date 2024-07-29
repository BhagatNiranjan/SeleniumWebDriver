package Day27july;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Test Case
 * 
 */

public class MyfirstTestcase {
	

	public static void main(String[] args) {
		//WebDriver driver=new FirefoxDriver();
		//Chrome Browser Driver driver=new ChromeBrowserDriver();
	WebDriver driver =new EdgeDriver();
		driver.get("http://demo.opencart.com/");
		String act_title=driver.getTitle();
		if(act_title.equals("Test Pass"))
		{
			System.out.println("Test failed");
		}
		driver.quit();
		// TODO Auto-generated method stub
	//System.out.println();

	}

}
