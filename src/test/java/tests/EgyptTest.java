package tests;

import org.testng.annotations.Test;

import pages.EgyptPage;
import pages.HomePage;

public class EgyptTest extends TestBase {

	HomePage homeObject;
	EgyptPage egyptObject;
	
	@Test
	public void VerEgySub() {
		homeObject = new HomePage(driver);
		homeObject.selectCountry();
		egyptObject = new EgyptPage(driver);
		egyptObject.selectEgypt();
		egyptObject.validateEgyptCurrencyLite();
		egyptObject.validateEgyptCurrencyMain();
		egyptObject.validateEgyptCurrencyPremium();
	}

}
