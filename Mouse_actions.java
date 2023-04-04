package basic_handlings;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Mouse_actions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prasa\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");

	    ChromeOptions options = new ChromeOptions();
	     options.addArguments("--remote-allow-origins=*");
	      ChromeDriver driver = new ChromeDriver(options);
	      
		//maximise window
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
		WebElement boxA=driver.findElement(By.xpath("//li[text()='A']"));
		WebElement boxD=driver.findElement(By.xpath("//li[text()='D']"));
		Actions actions=new Actions(driver);
		actions.moveToElement(boxA);
		actions.clickAndHold();
		actions.moveToElement(boxD);
		actions.contextClick(boxD);
		actions.doubleClick(boxD);
		
		actions.build().perform();
		Thread.sleep(5000);
		driver.quit();
		System.out.println("done");
	}

}
