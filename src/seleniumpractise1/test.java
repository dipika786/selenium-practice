package seleniumpractise1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
	public static void main(String[] args) throws InterruptedException {
		String title;
		// system property for chrome driver
		  System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");    //path of driver in selenium script 
		  //initialize chrome driver using class
		  WebDriver driver=new ChromeDriver();  
	//	WebDriver driver = WebDriverManager.chromedriver().create();
	//	WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev");
		title = driver.getTitle();
	System.out.println(title);
	System.out.println(driver.getCurrentUrl());
	driver.manage().window().maximize();
	// manage method which returns instance of the options interface...which internally return a window method that return 
	//driver. manage() is a method that returns instance of options interface, now the options interface has method window() 
	//that returns instance of window interface, this window interface has method maximize() which maximizes the window.
	//Click on the Link Text using click() command    
       // driver.findElement(By.linkText("This is a Link")).click();  

        //Go back to Home Page  
        driver.navigate().back();   
        //Thread.sleep(1000);
        //Go forward to Registration page  
        driver.navigate().forward();  

        // Go back to Home page  
        driver.navigate().to("https://www.javatpoint.com/selenium-webdriver-navigation-commands");  

        //Refresh browser  
        driver.navigate().refresh();  
    
        //Closing browser  
    	driver.close();  //current 
		//driver.quit();    // all browser opened by driver
	}
	
}
