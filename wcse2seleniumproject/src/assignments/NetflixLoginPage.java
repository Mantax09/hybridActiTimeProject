package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NetflixLoginPage {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.netflix.com/in/login");
		 driver.findElement(By.id("id_userLoginId")).sendKeys("YOGESH");
		 Thread.sleep(3000);
		 driver.findElement(By.id("id_password")).sendKeys("Yogesh@123");
		 Thread.sleep(4000);
		 driver.findElement(By.tagName("button")).click();
		// Thread.sleep(3000);
		// driver.close();
		 
		 
		 
	}

}
