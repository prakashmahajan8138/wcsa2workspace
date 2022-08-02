package actionsMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropAction {
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		
		WebElement src = driver.findElement(By.xpath("//a[contains(text(),'BANK')]"));
		
		WebElement dest = driver.findElement(By.xpath("//div[@id='shoppingCart1']/descendant::li[@class='placeholder']"));
		
		
		Actions act = new Actions(driver);
		act.dragAndDrop(src, dest).perform();
		
		
		
		
	}

}
