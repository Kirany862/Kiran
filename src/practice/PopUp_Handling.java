package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp_Handling {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\KIRAN\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
	String text = driver.findElement(By.cssSelector("//p[contains(text(),'')]")).getText();
	System.out.println(text);
	}

}
