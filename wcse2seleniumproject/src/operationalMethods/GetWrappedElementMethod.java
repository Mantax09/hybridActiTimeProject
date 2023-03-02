package operationalMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetWrappedElementMethod {
	
	
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver", "./drivers/ChromeDriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("file:///C:/Users/Qspiders-Wakad/Desktop/SeleniumData/WebElement/MultiSelectDropDown.html");
	WebElement dropDownElement = driver.findElement(By.id("i1"));
	
	Select sel = new Select(dropDownElement);
	
	   WebElement value = sel.getWrappedElement();
	   
	   String option = value.getText();
	   System.out.println(option);
	
	
	

}

}

