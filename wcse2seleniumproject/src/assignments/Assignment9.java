package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment9 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://shoppersstack.com/");

		WebElement sntoor = driver.findElement(By.xpath("//div[@class='featuredProducts_cardBody__MDlEh']/descendant::img[@alt='Santoor']"));
		sntoor.click();
		driver.findElement(By.xpath("//input[@id='Check Delivery']")).sendKeys("580024");


		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement checkButton = driver.findElement(By.xpath("//button[text()='Check']"));
		wait.until(ExpectedConditions.elementToBeClickable(checkButton)).click();

	}

}
