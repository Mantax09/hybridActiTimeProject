package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Qspiders-Wakad/Desktop/SeleniumData/WebElement/CheckBox.html");
		Thread.sleep(2000);
		driver.findElement(By.name("n3")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("n2")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("i4")).click();
		
		
	}
}
