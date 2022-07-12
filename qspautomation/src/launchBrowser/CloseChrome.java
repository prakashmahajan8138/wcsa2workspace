package launchBrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class CloseChrome {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();//open the chrome browser
		Thread.sleep(5000);//stop the execution for 5 seconds
		driver.close();
	}

}
