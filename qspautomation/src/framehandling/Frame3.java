package framehandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frame3 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/QSP/Desktop/username.html");
		
		driver.findElement(By.id("un")).sendKeys("admin");
		WebElement frameElement = driver.findElement(By.id("frid"));
		Thread.sleep(3000);
		driver.switchTo().frame(frameElement);
		driver.findElement(By.id("pwd")).sendKeys("manager");
		
		
		
		
		
		
		//confirmBtn
		
		
		
		
		
		
		
		
	}

}
