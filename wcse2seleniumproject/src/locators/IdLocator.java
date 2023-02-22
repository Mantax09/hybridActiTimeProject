package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Qspiders-Wakad/Desktop/SeleniumData/WebElement/passwordTB.html");
		driver.findElement(By.id("i1")).sendKeys("manager");
		Thread.sleep(2000);
		driver.navigate().to("file:///C:/Users/Qspiders-Wakad/Desktop/SeleniumData/WebElement/usernameTB.html");
		driver.findElement(By.id("i1")).sendKeys("admin");
	}

}
