package guruStep;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import myBase.TestBase;
import pages.HomePage;
import pages.MobilePage;
import pages.ShoppingCartPage;

public class StepDefinition extends TestBase{
	HomePage homePage= new HomePage(); 
	MobilePage mobilePage= new MobilePage();
	ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
	
	
@Given("^user is on Home Page$")
public void user_is_on_Home_Page() throws Throwable {
	TestBase.initialization();
}

@Given("^user verify Home Page title$")
public void user_verify_Home_Page_title() throws Throwable {
	HomePage homepage=PageFactory.initElements(driver,HomePage.class); 
	String title= homepage.validatePageTitle();
     System.out.println("The title of HomePage is  "+ title);
     Assert.assertEquals("Home page", title);
}

@When("^I click on  MOBILE link$")
public void i_click_on_MOBILE_link() throws Throwable {
	HomePage homepage=PageFactory.initElements(driver,HomePage.class);
	homepage.IshouldclickMobilelink();
	
}

@Then("^user verify seeing  mobile title$")
public void user_verify_seeing_mobile_title() throws Throwable {
	HomePage homepage=PageFactory.initElements(driver,HomePage.class);
	String mobilePageTitle = homepage.validateMobileTitle();
	System.out.println("The title of this page is "+mobilePageTitle);
	Assert.assertTrue(homepage.validateMobileTitle().equals("Mobile"));
	
}

@Then("^user select name in SORTBY dropdown menu$")
public void user_select_name_in_SORTBY_dropdown_menu() throws Throwable {
	MobilePage mobilePage = PageFactory.initElements(driver, MobilePage.class);
	mobilePage.selectName();
	
}

@Then("^user verify all three products are sorted by name$")
public void user_verify_all_three_products_are_sorted_by_name() throws Throwable {
	MobilePage mobilePage = PageFactory.initElements(driver, MobilePage.class);
	mobilePage._Should_see_IPhone();
	
	mobilePage._Should_see_Samsung_Galaxy();

	mobilePage._Should_see_Sony_Xperia();
}
@Then("^user reads the cost of Sony Xperia$")
public void user_reads_the_cost_of_Sony_Xperia() throws Throwable {
	MobilePage mobilePage = PageFactory.initElements(driver, MobilePage.class);
	mobilePage._Should_see_Sony_Xperia_Price_Tag();
}

@Then("^user clicks on Sony Xperia mobile$")
public void user_clicks_on_Sony_Xperia_mobile() throws Throwable {
	MobilePage mobilePage = PageFactory.initElements(driver, MobilePage.class);
	mobilePage._Should_click_On_Sony_Xperia_Text();
}

@Then("^user confirm he is on Sony Xperia mobile Page$")
public void user_confirm_he_is_on_Sony_Xperia_mobile_Page() throws Throwable {
	MobilePage mobilePage = PageFactory.initElements(driver, MobilePage.class);
String sonyXperiaMobilePageTitle=	mobilePage.validatePageSony_Xperia_MobileTitle();
System.out.println("The title displayed showing sony xperia mobile is "+sonyXperiaMobilePageTitle);
Assert.assertEquals("Sony Xperia - Mobile",sonyXperiaMobilePageTitle );	
}
@Then("^user confirm the price of Sony Xperia in Sony Xperia mobile Page is \\$(\\d+)$")
public void user_confirm_the_price_of_Sony_Xperia_in_Sony_Xperia_mobile_Page_is_$(int arg1) throws Throwable {
	MobilePage mobilePage = PageFactory.initElements(driver, MobilePage.class);
	mobilePage._Should_see_In_Stock_Sony_Xperia_Price_Tag();
	
}
@Then("^user click on Add To Cart button for Sony Xperia$")
public void user_click_on_Add_To_Cart_button_for_Sony_Xperia() throws Throwable {
	MobilePage mobilePage = PageFactory.initElements(driver, MobilePage.class);
	mobilePage._Should_click_On_Add_To_Cart_SonyXperiaBtn();
}

@Then("^user click on the quantity text box$")
public void user_click_on_the_quantity_text_box() throws Throwable {
	ShoppingCartPage shoppingCartPage=PageFactory.initElements(driver, ShoppingCartPage.class);
	shoppingCartPage.I_Cclick_On_Quantity_Box();
}

@Then("^user enters (\\d+) as quantity$")
public void user_enters_as_quantity(int arg1) throws Throwable {
	ShoppingCartPage shoppingCartPage=PageFactory.initElements(driver, ShoppingCartPage.class);
	shoppingCartPage.I_type_1000_in_Qty_Btn();
}

@Then("^user clicks on update button$")
public void user_clicks_on_update_button() throws Throwable {
	ShoppingCartPage shoppingCartPage=PageFactory.initElements(driver, ShoppingCartPage.class);
	shoppingCartPage.I_Click_On_Update_Btn();
}

@Then("^user should verify seeing an error message$")
public void user_should_verify_seeing_an_error_message() throws Throwable {
	ShoppingCartPage shoppingCartPage=PageFactory.initElements(driver, ShoppingCartPage.class);
	String text1=shoppingCartPage.verify_Error_Message();
	System.out.println("I should see "+text1);
	//System.out.println(shoppingCartPage.ErrorMessageTxt.getText());
	Assert.assertTrue(shoppingCartPage.ErrorMessageTxt.getText().contains("* The maximum quantity allowed for purchase is 500."));
		
}

@Then("^user should click on Empty Cart link in the footer of list of all mobile$")
public void user_should_click_on_Empty_Cart_link_in_the_footer_of_list_of_all_mobile() throws Throwable {
	ShoppingCartPage shoppingCartPage=PageFactory.initElements(driver, ShoppingCartPage.class);
	shoppingCartPage.I_click_Empty_CartLink();
}

@Then("^user verify that the cart is empty$")
public void user_verify_that_the_cart_is_empty() throws Throwable {
	ShoppingCartPage shoppingCartPage=PageFactory.initElements(driver, ShoppingCartPage.class);
String text2=shoppingCartPage.verify_SHOPPING_CART_IS_EMPTY_Message();
	System.out.println("Messsage displayed is "+text2);
	Assert.assertEquals("SHOPPING CART IS EMPTY", text2);    
}

@When("^user clicks on Add To Compare on IPhone link$")
public void user_clicks_on_Add_To_Compare_on_IPhone_link() throws Throwable {
	MobilePage mobilePage = PageFactory.initElements(driver, MobilePage.class);
	mobilePage._Should_click_On_AddToCompareIphoneBtn();
}

@When("^user also clicks on Add To Compare on Samson Galaxy$")
public void user_also_clicks_on_Add_To_Compare_on_Samson_Galaxy() throws Throwable {
	MobilePage mobilePage = PageFactory.initElements(driver, MobilePage.class);
	mobilePage._Should_click_On_AddToCompareSamsongGalaxyBtn();
}

@Then("^user clicks on Compare button$")
public void user_clicks_on_Compare_button() throws Throwable {
	MobilePage mobilePage = PageFactory.initElements(driver, MobilePage.class);
	mobilePage._Should_click_On_CompareBtn();
}


@Then("^user verify selected products on for pop up window$")
public void user_verify_selected_products_on_for_pop_up_window() throws Throwable {
	ShoppingCartPage shoppingCartPage=PageFactory.initElements(driver, ShoppingCartPage.class);
String text3=shoppingCartPage.verifyPopUPDetails();
System.out.println(text3);
Assert.assertEquals("COMPARE PRODUCTS",text3);
}

@Then("^user closes the Pop up window$")
public void user_closes_the_Pop_up_window() throws Throwable { 
	driver.close();
}
}
