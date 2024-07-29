package Day2;

import java.util.List;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.util.concurrent.Service.Listener;

public class LocatorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("http://Demo.Opencart.com/");
driver.manage().window().maximize();
driver.findElement(By.name("search")).sendKeys("phones");
/*boolean logoDisplaystatus=driver.findElement(By.id("logo")).isDisplayed();
System.out.println(logoDisplaystatus);*/
//linktext & partial linktext
//driver.findElement(By.linkText("Tablets")).click();
driver.findElement(By.partialLinkText("Tablets")).click();
List<WebElement> headerLinks=driver.findElements(By.className("list-inline-item"));
System.out.println("total number of header links:"+headerLinks.size());

	
	}
	
	

}
