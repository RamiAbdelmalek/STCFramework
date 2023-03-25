package tests;

import org.testng.annotations.Test;

import pages.JordanPage;
import pages.HomePage;

public class JordanTest extends TestBase {

	HomePage homeObject;
	JordanPage jordanObject;
	
	@Test
	public void VerJordanSub() {
		homeObject = new HomePage(driver);
		homeObject.selectCountry();
		jordanObject = new JordanPage(driver);
		jordanObject.selectEgypt();
		jordanObject.validateJordanCurrencyLite();
		jordanObject.validateJordanCurrencyMain();
		jordanObject.validateJordanCurrencyPremium();
	}

}
