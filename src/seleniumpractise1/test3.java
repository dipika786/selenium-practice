package seleniumpractise1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test3 {
	public static void main(String[] args) throws InterruptedException {
		
	
		  System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");    //path of driver in selenium script 
		
		  WebDriver driver=new ChromeDriver();  

			driver.manage().window().maximize();
		
		  driver.findElement(By.className("submit signInBtn")).click();  //2 classes are defined/applicable for this button- u can either give anyone
	
}
	
}

