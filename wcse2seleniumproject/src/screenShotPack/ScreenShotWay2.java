package screenShotPack;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class ScreenShotWay2 {
	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.get("https://www.flipkart.com/");
		 
		 // way 2 Downcast into RemoteWebDriver (class)
		     
		         RemoteWebDriver rw = (RemoteWebDriver)driver;
		         
		         File src = rw.getScreenshotAs(OutputType.FILE);
		         File dest = new File("./ScreenShots/tanmay.png");
		         
		         Files.copy(src, dest);
	}

}
