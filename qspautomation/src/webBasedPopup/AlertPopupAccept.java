package webBasedPopup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopupAccept {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/QSP/Desktop/wcsa2htmldocs/Alert.html");
		driver.findElement(By.xpath("//button[contains(text(),'Try')]")).click();
		
		Alert al = driver.switchTo().alert();
		Thread.sleep(2000);
		al.accept();
		
		
		
		
		
		
	}

}
