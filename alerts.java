package basic_handlings;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prasa\\Downloads\\chromedriver_win32\\chromedriver.exe");

	    ChromeOptions options = new ChromeOptions();
	     options.addArguments("--remote-allow-origins=*");
	      ChromeDriver driver = new ChromeDriver(options);
		//maximise window
		
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		
		//simple Alert
		driver.findElement(By.id("alertBox")).click();
		driver.switchTo().alert().accept();
	    Thread.sleep(2000);
	    
	    //confirmation alert
	    driver.findElement(By.id("confirmBox")).click();
	    driver.switchTo().alert().dismiss();
	    Thread.sleep(2000);
	    
	  
		
		

	}

}
