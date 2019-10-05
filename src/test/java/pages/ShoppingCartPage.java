package pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import myBase.TestBase;

public class ShoppingCartPage extends TestBase{
	
	@FindBy(how=How.CSS,using = "#shopping-cart-table > tbody > tr > td.product-cart-actions > input")
      WebElement QuantityBx;
	
	@FindBy(how=How.CSS,using = "#shopping-cart-table > tbody > tr > td.product-cart-actions > button > span > span")
	WebElement UpdateBtn;
	
	@FindBy(how=How.CSS,using = "#shopping-cart-table > tbody > tr > td.product-cart-info > p")
  public static WebElement ErrorMessageTxt;
	
	@FindBy(how=How.CSS,using = "#empty_cart_button > span > span")
	WebElement Empty_CartLink;
	
	@FindBy(how=How.XPATH,using = "//*[@id='top']/body/div/div/div[2]/div/div/div[1]/h1")
	WebElement SHOPPING_CART_IS_EMPTY_Message;
	
	@FindBy(how=How.CSS,using = ".page-title > h1:nth-child(1)")
	WebElement Compare_ProductsTxt;
	
	@FindBy(how=How.XPATH,using = "/html/body/div/table/tbody[1]/tr[1]/td[1]/a/img")
	WebElement IphonePopUpImg;
	
	
	
	@FindBy(how=How.XPATH,using = "/html/body/div/table/tbody[1]/tr[1]/td[2]/a/img")
	WebElement SamsungGalaxyPopUpImg;
	
	//public ShoppingCartPage(){
	//	PageFactory.initElements(driver, this);
//	}
		
	public void I_Cclick_On_Quantity_Box(){
		QuantityBx.click();	
		}
	public void I_type_1000_in_Qty_Btn(){
		QuantityBx.sendKeys("1000");
	}

	public void I_Click_On_Update_Btn(){
		UpdateBtn.click();
	}
	  public String verify_Error_Message(){
	 return  ErrorMessageTxt.getText();		
}
	  public void I_click_Empty_CartLink(){
		  Empty_CartLink.click();
	  }
	  public String verify_SHOPPING_CART_IS_EMPTY_Message(){
	 	
		return SHOPPING_CART_IS_EMPTY_Message.getText();
}	

public String verifyPopUPDetails(){
	
	Set<String> handler=  driver.getWindowHandles();

Iterator <String> it=	handler.iterator();

String parentWindowId =it.next();
System.out.println(parentWindowId);

String childWindowId=it.next();
System.out.println(childWindowId);
	
driver.switchTo().window(childWindowId);

System.out.println("child widow popup title is "+driver.getTitle());
return Compare_ProductsTxt.getText();

}
	
}

