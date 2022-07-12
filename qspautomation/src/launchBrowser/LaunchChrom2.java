package launchBrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrom2 {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

	}
	
	public static void main(String[] args) {

		new ChromeDriver();

	}

}
