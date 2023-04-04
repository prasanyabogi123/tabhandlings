package basic_handlings;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class drag_and_drop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prasa\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");

	    ChromeOptions options = new ChromeOptions();
	     options.addArguments("--remote-allow-origins=*");
	      ChromeDriver driver = new ChromeDriver(options);
	      //maximise window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://selenium08.blogspot.com/2020/01/drag-drop.html");
		WebElement ele1=driver.findElement(By.id("draggable"));
		WebElement ele2=driver.findElement(By.id("droppable"));
		Actions actions=new Actions(driver);
		actions.dragAndDrop(ele1, ele2);
		actions.build().perform();
		
		

	}

}
