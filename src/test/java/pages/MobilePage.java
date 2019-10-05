package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import myBase.TestBase;

public class MobilePage extends TestBase{
	
@FindBy(how=How.CSS, using = "select[title=\"Sort By\"]")
	WebElement dropdownList;

@FindBy(how=How.XPATH, using = "//a[contains(text(),'IPhone')]")
WebElement IphoneTxt;

@FindBy(how=How.XPATH, using = "//a[contains(text(),'Samsung Galaxy')]")
WebElement Samsung_GalaxyTxt;

@FindBy(how=How.XPATH, using = "//h2[@class='product-name']//a[contains(text(),'Sony Xperia')]")
WebElement Sony_XperiaTxt;

@FindBy(how=How.XPATH, using = "//span[contains(text(),'$100.00')]")
WebElement Sony_XperiaPriceTag;

@FindBy(how=How.XPATH, using = "//span[@class='price']")
WebElement In_Stock_Sony_XperiaPriceTag;

@FindBy(how=How.XPATH, using = "//li[1]//div[1]//div[3]//button[1]//span[1]//span[1]")
WebElement Add_To_Cart_SonyXperiaBtn;

@FindBy(how=How.XPATH, using = "//*[@id='top']/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[2]/div/div[3]/ul/li[2]/a")
      WebElement AddToCompareIphoneBtn;

@FindBy(how=How.XPATH, using = "//*[@id='top']/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[3]/div/div[3]/ul/li[2]/a")
WebElement AddToCompareSamsongGalaxyBtn;

@FindBy(how=How.XPATH, using = "//button[@class='button']//span//span[contains(text(),'Compare')]")
WebElement CompareBtn;




	  public void selectName(){
		  Select dropdown= new Select(dropdownList);
		  dropdown.selectByIndex(1);
		  
	}
	  public void _Should_see_IPhone(){
		  IphoneTxt.isDisplayed();
		}
	  public void _Should_see_Samsung_Galaxy(){
		  Samsung_GalaxyTxt.isDisplayed();
		}
	  public void _Should_see_Sony_Xperia(){
		  Sony_XperiaTxt.isDisplayed();
		}
	  public void _Should_see_Sony_Xperia_Price_Tag(){
	  Sony_XperiaPriceTag.isDisplayed();
		}
	 
	  public void _Should_click_On_Sony_Xperia_Text(){
		  Sony_XperiaTxt.click();
		}
	  public void _Should_click_On_Add_To_Cart_SonyXperiaBtn(){
		  Add_To_Cart_SonyXperiaBtn.click();
		}
	  public String validatePageSony_Xperia_MobileTitle(){
			return driver.getTitle();	
			}
	  
	  public void _Should_see_In_Stock_Sony_Xperia_Price_Tag(){
		  In_Stock_Sony_XperiaPriceTag.getText();
			}	
	  public void _Should_click_On_AddToCompareIphoneBtn(){
		  AddToCompareIphoneBtn.click();
		}
	  public void _Should_click_On_AddToCompareSamsongGalaxyBtn(){
		  AddToCompareSamsongGalaxyBtn.click();
		}
	  public void _Should_click_On_CompareBtn(){
		  CompareBtn.click();
		}
}


