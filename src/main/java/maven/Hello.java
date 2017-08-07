package maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Hello {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijay\\Documents\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys("egiants");
		//driver.findElement(By.xpath("//input[@value='Google Search']")).submit();;
		driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div[3]/center/input[2]")).submit();
		}

}
