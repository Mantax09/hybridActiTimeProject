package xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Xpat3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shine.com/registration/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@id,'id_name')]")).sendKeys("admin");
		driver.findElement(By.id("id_email")).sendKeys("admin@123");
		driver.findElement(By.xpath("//input[contains(@id,'id_cell_phone')]")).sendKeys("1234567890");
		driver.findElement(By.xpath(" //input[contains(@id,'id_password')]")).sendKeys("admin12345");
		driver.findElement(By.id("registerButton")).click();
	
	}

}
