package basic_handlings;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class upload_file {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prasa\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");

	    ChromeOptions options = new ChromeOptions();
	     options.addArguments("--remote-allow-origins=*");
	      ChromeDriver driver = new ChromeDriver(options);
	      
		//maximise window
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.file.io/");
		WebElement file=driver.findElement(By.xpath("//label[@for='upload-button']"));
        file.sendKeys("C:\\Users\\prasa\\OneDrive\\DOCUMENTATIONS.txt");
        
	}

}
