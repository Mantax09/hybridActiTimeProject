package screenShotPack;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScrrenShotOfWebElement {
	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.selenium.dev");
		
		WebElement seleniumIde = driver.findElement(By.xpath("//h4[text()='Selenium IDE']/ancestor::div[@class='card-body']"));
		
		File src = seleniumIde.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ScreenShots/wess.png");
		
		
		Files.copy(src, dest);
		
	}

}
