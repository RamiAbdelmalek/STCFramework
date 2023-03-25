package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class EgyptPage extends PageBase{

	public EgyptPage(WebDriver driver) {
		super(driver);


	}

	@FindBy(id = "eg-contry-flag")
	WebElement Egypt;
	
	@FindBy(id="currency-لايت")
    public  WebElement assertCL;
	
	@FindBy(id="currency-الأساسية")
    public  WebElement assertCM;
	
	@FindBy(id="currency-بريميوم")
    public  WebElement assertCP;

	public void selectEgypt() {
		Egypt.click();
		
	}
	
	public void validateEgyptCurrencyLite() {
		Assert.assertTrue(assertCL.getText().contains("0.25"));
		Assert.assertTrue(assertCL.getText().contains("دولار أمريكي"));
	}
	
	
	public void validateEgyptCurrencyMain() {
		Assert.assertTrue(assertCM.getText().contains("0.5"));
		Assert.assertTrue(assertCM.getText().contains("دولار أمريكي"));
	}
	
	public void validateEgyptCurrencyPremium() {
		Assert.assertTrue(assertCP.getText().contains("1"));
		Assert.assertTrue(assertCP.getText().contains("دولار أمريكي"));
	}
}
