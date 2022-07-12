package launchBrowser;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchInsta2 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();//open firefox browser
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		
		Thread.sleep(5000);//delay of 5 sec
		driver.close();//close the browser
	}

}
