package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HotStarLoginPage {
	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hotstar.com/in/subscribe/sign-in?returnURL=/in/subscribe/my-account");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='phoneNo']")).sendKeys("8888888888");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class='submit-button']")).click();
	}
}
