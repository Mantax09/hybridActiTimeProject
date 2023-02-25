package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledMethod {
	
	public static void main(String[] args) {
		
		
		
		//div[text()='Log in']
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.instagram.com/");
		
		WebElement logInButton = driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']"));
		boolean check = logInButton.isEnabled();
		System.out.println(check);
	}

}
