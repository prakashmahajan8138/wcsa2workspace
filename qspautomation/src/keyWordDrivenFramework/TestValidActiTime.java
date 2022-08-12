package keyWordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class TestValidActiTime extends BaseTest{
	
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		BaseTest bt = new BaseTest();
		bt.openBrowser();//open the browser
		Flib flib = new Flib();
		//read the data from property file
		String username = flib.readPropertFile("./data/config.properties","username");
		String password = flib.readPropertFile("./data/config.properties","password");

		//valid login
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		Thread.sleep(4000);
		driver.findElement(By.id("loginButton")).click();
		
		bt.closeBrowser();//close all browsers
		
		
		
		
		
		
		
		
		
	}

}
