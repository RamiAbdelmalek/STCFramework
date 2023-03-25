package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.Advice.This;

public class PageBase {
	
protected WebDriver driver;
	
	//Create constructor
	public PageBase(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
