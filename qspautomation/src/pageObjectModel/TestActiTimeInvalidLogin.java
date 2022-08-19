package pageObjectModel;

import java.io.IOException;

public class TestActiTimeInvalidLogin extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {

		BaseTest bt = new BaseTest();
		bt.openBrowser();

		LoginPage lp = new LoginPage(driver);

		Flib flib = new Flib();
		int rc = flib.getRowCount(EXCEL_PATH,"invalidcreds");

		for(int i=1;i<=rc;i++)
		{
			String invalidusername = flib.readExcelData(EXCEL_PATH,"invalidcreds",i,0);
			String invalidpassword = flib.readExcelData(EXCEL_PATH,"invalidcreds" ,i, 1);
			lp.invalidLoginActiTime(invalidusername, invalidpassword);
		}



		bt.closeBrowser();








	}

}
