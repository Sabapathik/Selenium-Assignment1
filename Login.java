package Week3.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("https://uibank.uipath.com/");
		driver.findElement(By.xpath("//input[id='email']"));
		driver.findElement(By.xpath("//input[type()=password]"));
		driver.findElement(By.xpath("//input[id='firstName']"));
		driver.findElement(By.xpath("//div[id='lastName']"));
		driver.findElement(By.xpath("//label[placeholder='Enter date in MM/DD/YY format']"));
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		
		}
	{	
	}
	
}

