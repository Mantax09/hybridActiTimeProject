package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Rtp {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("which browser u want to open!!");
	String browserValue = sc.next();
	if(browserValue.equals("chrome"))
	{
	
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
	}
	else if(browserValue.equals("edge"))
	{
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		driver=new EdgeDriver();
		driver.manage().window().maximize();
	}
	else
	{
		System.out.println("enter valid Browser name!!!");
	}
	
	}
	
	
	
	}

