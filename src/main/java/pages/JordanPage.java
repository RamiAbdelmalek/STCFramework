package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class JordanPage extends PageBase{

	public JordanPage(WebDriver driver) {
		super(driver);


	}

	@FindBy(id = "jo-contry-flag")
	WebElement Jordan;
	
	@FindBy(id="currency-لايت")
    public  WebElement assertCL;
	
	@FindBy(id="currency-الأساسية")
    public  WebElement assertCM;
	
	@FindBy(id="currency-بريميوم")
    public  WebElement assertCP;

	public void selectEgypt() {
		Jordan.click();
		
	}
	
	public void validateJordanCurrencyLite() {
		Assert.assertTrue(assertCL.getText().contains("2.7"));
		Assert.assertTrue(assertCL.getText().contains("دولار أمريكي"));
	}
	
	
	public void validateJordanCurrencyMain() {
		Assert.assertTrue(assertCM.getText().contains("5.2"));
		Assert.assertTrue(assertCM.getText().contains("دولار أمريكي"));
	}
	
	public void validateJordanCurrencyPremium() {
		Assert.assertTrue(assertCP.getText().contains("8"));
		Assert.assertTrue(assertCP.getText().contains("دولار أمريكي"));
	}
}
