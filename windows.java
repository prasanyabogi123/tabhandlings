package basic_handlings;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class windows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prasa\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");

	    ChromeOptions options = new ChromeOptions();
	     options.addArguments("--remote-allow-origins=*");
	      ChromeDriver driver = new ChromeDriver(options);
	      
		//maximise window
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		String parentHandle=driver.getWindowHandle();
		System.out.println("parent window - " + parentHandle);
		Thread.sleep(2000);
		driver.findElement(By.id("newWindowBtn")).click();
		Thread.sleep(2000);
		Set<String> handles = driver.getWindowHandles();
		for (String handle : handles) {
			System.out.println(handle);
		if(!handle.equals(parentHandle)) {
			driver.switchTo().window(handle);
			driver.findElement(By.id("firstName")).sendKeys("bogi");
			Thread.sleep(5000);
			driver.close();
		
				
			}
			
		}
		driver.switchTo().window(parentHandle);
		driver.findElement(By.id("name")).sendKeys("chinna");
		Thread.sleep(2000);
		driver.quit();
		
		

	}

}
