
package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class EmiratesPage extends PageBase{

	public EmiratesPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(id = "ae-contry-flag")
	WebElement Emirates;

	@FindBy(id="currency-لايت")
	public  WebElement assertCL;

	@FindBy(id="currency-الأساسية")
	public  WebElement assertCM;

	@FindBy(id="currency-بريميوم")
	public  WebElement assertCP;




	public void selectEmirates() {
		Emirates.click();

	}

	public void validateEmiratesCurrencyLite() {
		Assert.assertTrue(assertCL.getText().contains("5.4"));
		Assert.assertTrue(assertCL.getText().contains("دولار أمريكي"));
	}

	public void validateEmiratesCurrencyMain() {
		Assert.assertTrue(assertCM.getText().contains("10.9"));
		Assert.assertTrue(assertCM.getText().contains("دولار أمريكي"));
	}

	public void validateEmiratesCurrencyPremium() {
		Assert.assertTrue(assertCP.getText().contains("16.3"));
		Assert.assertTrue(assertCP.getText().contains("دولار أمريكي"));
	}
}
