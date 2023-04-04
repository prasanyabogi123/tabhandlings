package basic_handlings;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prasa\\Downloads\\chromedriver_win32\\chromedriver.exe");

	    ChromeOptions options = new ChromeOptions();
	     options.addArguments("--remote-allow-origins=*");
	      ChromeDriver driver = new ChromeDriver(options);
		//maximise window
		
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		
		driver.findElement(By.id("name")).sendKeys("hello");
		driver.switchTo().frame(driver.findElement(By.id("frm3")));
		driver.switchTo().frame(driver.findElement(By.id("frm1")));
		Select courseDD =new Select(driver.findElement(By.id("course")));
		courseDD.selectByVisibleText("Java");
		Thread.sleep(2000);
		
		driver.switchTo().parentFrame();
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("frame3");//frame 3
		
		//get back to original webpage
		driver.switchTo().defaultContent();
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("main webpage");
		
		
		
		
		
		
		
		

	}

}
