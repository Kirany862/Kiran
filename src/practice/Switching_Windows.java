package practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switching_Windows {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\KIRAN\\Downloads\\chromedriver_win32\\chromedriver.exe");	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.automationtesting.in/Windows.html");
	
	driver.findElement(By.xpath("//a[contains(@class,'analystic')]")).click();
	driver.findElement(By.xpath("//button[contains(text(),'    click   ')]")).click();
	
	Set <String> s=driver.getWindowHandles();
	for(String i:s) {
		System.out.println(s);
		String t=driver.switchTo().window(i).getTitle();
		if(t.contains("Selenium")) {;//Frames & windows
			driver.close();
		}
	}
	}
}
