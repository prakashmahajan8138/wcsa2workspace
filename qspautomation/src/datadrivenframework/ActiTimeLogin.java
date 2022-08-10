package datadrivenframework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class ActiTimeLogin {


	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://desktop-bh9ro97/login.do");

		Flib flib = new Flib();
		String username = flib.readExceldata("./data/TestDataAct.xlsx","validcreds",1,0);
		String password = flib.readExceldata("./data/TestDataAct.xlsx","validcreds",1,1);
		
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);

		driver.findElement(By.id("loginButton")).click();





	}

}
