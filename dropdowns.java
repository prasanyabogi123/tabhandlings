package basic_handlings;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class dropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prasa\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");

	    ChromeOptions options = new ChromeOptions();
	     options.addArguments("--remote-allow-origins=*");
	      ChromeDriver driver = new ChromeDriver(options);
	      
		//maximise window
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
	
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("prassu");
		driver.findElement(By.name("lastname")).sendKeys("Bogi");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("8686865831");
		Thread.sleep(1000);
		driver.findElement(By.xpath(("//input[@aria-label='New password']"))).sendKeys("prassu@123");
		
		WebElement staticDropdown =driver.findElement(By.xpath("//select[@aria-label='Day']"));
	    //dropdown with select tag
		Select dropdown=new Select(staticDropdown);
		dropdown.selectByIndex(4);
		System.out.println(dropdown.getFirstSelectedOption().getText());
	    dropdown.selectByVisibleText("9");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByValue("18");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		WebElement staticDropdown1=driver.findElement(By.name("birthday_month"));
		Select dropdown1=new Select(staticDropdown1);
		dropdown1.selectByValue("4");
		System.out.println(dropdown1.getFirstSelectedOption().getText());
		
		WebElement staticDropdown11=driver.findElement(By.name("birthday_year"));
		Select dropdown11=new Select(staticDropdown11);
		dropdown11.selectByValue("2017");
		System.out.println(dropdown11.getFirstSelectedOption().getText());
		

	}

}
