package Test_Runner;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Base.Base_class;
import Utility.PageObjectManager;

public class Runner_Class  extends Base_class{

	PageObjectManager pom = new PageObjectManager();

	@BeforeSuite
	private void BrowserLaunch() 
	{
		launchBrowser(pom.get_config().get_Browser());
	}

	@BeforeTest
	private void waitmethod()
	{
		implicitWait();
	}

	@Test
	private void UrlLaunch() 
	{
		launchUrl(pom.get_config().get_Url());

	}
	@Test(priority=1)

	private void LoginPage() throws Exception
	{

		clickOnElement(pom.getpom().getMobile_Number());
		input(pom.getpom().getMobile_Number(),pom.get_config().get_MobileNo());
		//input(pom.getpom().get_otp(), scannerMethod());
        clickOnElement(pom.getpom().getContinue_btn());
        Thread.sleep(3000);
    }

	@Test(priority = 2)

	private void Airport() throws Exception
	{
		clickUsingJSE(pom.getpom1().get_Cab());
		clickOnElement(pom.getpom1().get_airport_btn());
		input(pom.getpom1().get_Pickup_location(),pom.get_config().get_From());
		clickOnElement(pom.getpom1().get_pickup_xpath());
		input(pom.getpom1().get_drop_location(), pom.get_config().get_To());
		clickOnElement(pom.getpom1().get_drop_xpath());
		// input(pom.getpom1().get_drop_xpath(), pom.get_config().get_To());
		clickOnElement(pom.getpom1().get_search_cab());

	}


    @Test(priority=3)
	private void SelectACars() {

		clickOnElement(pom.getpom2().getIndica_WagonR());

	}
	



}