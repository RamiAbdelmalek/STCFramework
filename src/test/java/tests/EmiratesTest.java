package tests;

import org.testng.annotations.Test;

import pages.EmiratesPage;
import pages.HomePage;

public class EmiratesTest extends TestBase {

	HomePage homeObject;
	EmiratesPage emiratesObject;
	
	@Test
	public void VerEmiratesSub() {
		homeObject = new HomePage(driver);
		homeObject.selectCountry();
		emiratesObject = new EmiratesPage(driver);
		emiratesObject.selectEmirates();
		emiratesObject.validateEmiratesCurrencyLite();
		emiratesObject.validateEmiratesCurrencyMain();
		emiratesObject.validateEmiratesCurrencyPremium();
	}

}
