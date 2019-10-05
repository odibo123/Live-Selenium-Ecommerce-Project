package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import myBase.TestBase;

public class HomePage extends TestBase {
	
	
	@FindBy(how=How.XPATH,using = "//a[contains(text(),'Mobile')]")
	 WebElement mobileLink;



	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	public String validatePageTitle(){
	return driver.getTitle();	
	}

public void IshouldclickMobilelink(){
	mobileLink.click();
   }
public String validateMobileTitle(){
	return driver.getTitle();	
	}
}
