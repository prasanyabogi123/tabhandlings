package basic_handlings;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Tabshandlings {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prasa\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");

	    ChromeOptions options = new ChromeOptions();
	     options.addArguments("--remote-allow-origins=*");
	      ChromeDriver driver = new ChromeDriver(options);
	      
		//maximise window
		
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		
		//prints page title and content present in the page
	    System.out.println("Page title is : " + driver.getTitle());
		String element = driver.findElement(By.xpath("//a[text()='తెలుగు']")).getText();
		System.out.println(element);
		
		//switch to next tab
		WebDriver newTab = driver.switchTo().newWindow(WindowType.TAB);
		newTab.get("https://www.google.com/gmail/about/");
		Thread.sleep(5000);

		//sign in to mail and printed title and content
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		System.out.println("Page title is : " + driver.getTitle());
	    driver.findElement(By.xpath("//input[@type='email']")).sendKeys("prasanyabogi@gmail.com");
		Thread.sleep(3000);
		String name= driver.findElement(By.xpath("//span[text()='Create account']")).getText();
		System.out.println(name);
		Thread.sleep(4000);
		
		//navigates to password page
		driver.findElement(By.xpath("(//span[@jsname='V67aGc'])[2]")).click();
		String content=driver.findElement(By.xpath("//h1[@id='headingText']")).getText();
		System.out.println(content);
		
		//switches to previous tab
		String Tab1 = driver.getWindowHandle(); 
		ArrayList<String> availableWindows = new ArrayList<String>(driver.getWindowHandles()); 
		if (!availableWindows.isEmpty()) { 
		driver.switchTo().window(availableWindows.get(0));
		
		//opens fb and printed title content present in the page
		driver.get("https://www.facebook.com/");
		System.out.println("Page title is : " + driver.getTitle());
		String text= driver.findElement(By.xpath("//a[text()='Create a Page']")).getText();
		System.out.println(text);
	
		}
		
	}
		
}
