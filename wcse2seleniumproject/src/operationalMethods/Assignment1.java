package operationalMethods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/Qspiders-Wakad/Desktop/SeleniumData/WebElement/SingleSelectDropDown.html");
		
		WebElement dropDownElement = driver.findElement(By.id("i1"));
		
		Select sel = new Select(dropDownElement);
		
		// without using selection method select the option from dropDown
		
		List<WebElement> allOps = sel.getOptions();
		
		for(WebElement option:allOps)
		{
			if(option.getText().equals("tea"))
			{
				option.click();
				break;
			}
		}
	}

}
