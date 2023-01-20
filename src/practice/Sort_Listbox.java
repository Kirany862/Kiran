package practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sort_Listbox {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\KIRAN\\Downloads\\chromedriver_win32\\chromedriver.exe");	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://testautomationpractice.blogspot.com/");
	//driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
	WebElement element = driver.findElement(By.id("animals"));
	
	Select s = new Select(element);
	
	List originalList = new ArrayList();//List interface
	List tempList = new ArrayList();
	
	List <WebElement> options=s.getOptions();
	
	for(WebElement e:options) {
		originalList.add(e.getText());
		tempList.add(e.getText());
	}
	System.out.println("originalList before sortnig: "+originalList);
	System.out.println("tempList before sorting: "+tempList);
	
	Collections.sort(tempList);
	
	System.out.println("originallist after sorting: "+originalList);
	System.out.println("templist after  Sorting: "+tempList);
	
	
	if(originalList != tempList) {
		System.out.println("Dropdown is sorted");
	}
	else {
		System.out.println("Dropdown is not sorted");
	}
	}
}





