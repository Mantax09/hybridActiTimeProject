package synchronaiztion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchActiTime1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("http://desktop-aigvo6j/login.do");
		 String loginPageActualTitle = driver.getTitle();
		 if(loginPageActualTitle.equals("actiTIME - Login"))
		 {
			 System.out.println("Test is passed Login page verified!!");
		
		 }
		 
		 else 
		 {

			 System.out.println("Test is failed Login page not verified!!");
		 }
		 
		 driver.findElement(By.name("username")).sendKeys("admin");
		 driver.findElement(By.name("pwd")).sendKeys("manager");
		 driver.findElement(By.id("loginButton")).click(); 
	    
		 String homePageActualTitle = driver.getTitle();
		 
		if(homePageActualTitle.equals("actiTIME - Enter Time-Track"))
		{
			 System.out.println("Test is passed Home page verified!!");
		}
		 
		else
		{
			 System.out.println("Test is failed Home page not verified!!");
		}
		 
	}
            	
}
