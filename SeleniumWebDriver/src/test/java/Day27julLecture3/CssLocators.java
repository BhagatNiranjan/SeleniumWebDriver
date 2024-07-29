package Day27julLecture3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.nopcommerce.com/en/get-started");
		driver.manage().window().maximize();
		//tag id  tag#id(syntax)
		//driver.findElement(By.cssSelector("input#small-searcTerm")).sendKeys("T-Shirts");
		//driver.findElement(By.cssSelector("small-searcTerm")).sendKeys("T-Shirts");;
       //Tag class how to use ?= tag.classname
		//driver.findElement(By.cssSelector(".Search.box.text")).sendKeys("T-Shirt");
	     //Tag Attribute Syntax =tag[attribute='value']
		//driver.findElement(By.cssSelector("input[placeholder='serach store']")).sendKeys("T-Shirt");
		//tag class attribute syntax=tag.classname[attribute="value"]
		driver.findElement(By.cssSelector(".search-box-text[name='q']")).sendKeys();
		
	}

}
