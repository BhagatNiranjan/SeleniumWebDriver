package DayPracticeNavigator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//org.openqa.selenium.remote.NoSuchDriverException
public class Part2methods {

	private static final WebElement Unm = null;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c:\\Users\\Pandu\\Downloads\\imp--delete\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		// TODO Auto-generated method stub
driver.get("https://www.facebook.com/home.php");
WebElement img=driver.findElement(By.xpath("div[@class='_5iyy'//img[@class='img']"));
System.out.println(img.isDisplayed());
System.out.println(img.isEnabled());
System.out.println(img.isSelected());
WebElement unm=driver.findElement(By.id("email"));
Unm.sendKeys("welcome");
Unm.clear();
unm.sendKeys("Ai@gmail.com");

	}

}
